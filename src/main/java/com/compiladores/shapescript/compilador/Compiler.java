package com.compiladores.shapescript.compilador;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Compiler extends JFrame {
	
	private static JTextArea textAreaCode;
	private static JTable tableSymbol;
    private static JTable tableError;
    
    private final String[] SYMBOL_TABLE_COLUMNS = {"ID", "Token", "Lexema"};
    private final String[] ERROR_TABLE_COLUMNS = {"Linea", "Columna", "Mensaje"};
    
    private final DefaultTableModel EMPTY_SYMBOL_TABLE_MODEL = new DefaultTableModel(new String[][]{}, SYMBOL_TABLE_COLUMNS);
    private final DefaultTableModel EMPTY_ERROR_TABLE_MODEL = new DefaultTableModel(new String[][]{}, ERROR_TABLE_COLUMNS);

    public Compiler() {
        initComponents();
    }

    private void initComponents() {
    	// Configuración de la ventana
    	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    	setTitle("ShapeScript");
    	setPreferredSize(new Dimension(1000, 450));

    	// Creación de la label para el área de texto
    	JLabel labelCode = new JLabel("Ingrese el código:");
    	labelCode.setHorizontalAlignment(JLabel.CENTER);

    	// Creación del área de texto
    	textAreaCode = new JTextArea();
    	textAreaCode.setRows(10);
    	JScrollPane scroll = new JScrollPane(textAreaCode);
    	
    	// Creación del botón para compilar
    	JButton buttonCompile = new JButton("Compilar");
    	buttonCompile.addActionListener(e -> compile());
    	
    	// Creación del botón para limpiar
    	JButton buttonClear = new JButton("Limpiar");
    	buttonClear.addActionListener(e -> clear());
    	
    	// Creación del panel de botones
    	JPanel panelButtons = new JPanel(new BorderLayout());
    	panelButtons.add(buttonCompile, BorderLayout.NORTH);
    	panelButtons.add(buttonClear, BorderLayout.SOUTH);

    	// Creación de la etiqueta para la tabla de simbolos
    	JLabel labelSymbolTable = new JLabel("Tabla de Simbolos");
    	labelSymbolTable.setHorizontalAlignment(JLabel.CENTER);

    	// Creación de la tabla de simbolos
    	tableSymbol = new JTable(EMPTY_SYMBOL_TABLE_MODEL);
    	JScrollPane scrollSymbolTable = new JScrollPane(tableSymbol);

    	// Creación de la etiqueta para la tabla de errores
    	JLabel labelErrorTable = new JLabel("Tabla de Errores");
    	labelErrorTable.setHorizontalAlignment(JLabel.CENTER);

    	// Creación de la tabla de errores
    	tableError = new JTable(EMPTY_ERROR_TABLE_MODEL);
    	JScrollPane scrollErrorTable = new JScrollPane(tableError);

    	// Creación del panel para la tabla de símbolos y su etiqueta
    	JPanel panelSymbolTable = new JPanel(new BorderLayout());
    	panelSymbolTable.add(labelSymbolTable, BorderLayout.NORTH);
    	panelSymbolTable.add(scrollSymbolTable, BorderLayout.CENTER);

    	// Creación del panel para la tabla de errores y su etiqueta
    	JPanel panelTableError = new JPanel(new BorderLayout());
    	panelTableError.add(labelErrorTable, BorderLayout.NORTH);
    	panelTableError.add(scrollErrorTable, BorderLayout.CENTER);

    	// Creación del panel para el área de texto
    	JPanel panelCodeTextArea = new JPanel(new BorderLayout());
    	panelCodeTextArea.add(labelCode, BorderLayout.NORTH);
    	panelCodeTextArea.add(scroll, BorderLayout.CENTER);
    	panelCodeTextArea.add(panelButtons, BorderLayout.SOUTH);

    	// Creación del panel principal para las dos tablas y el área de texto
    	JPanel panelMain = new JPanel(new GridLayout(1, 3));
    	panelMain.add(panelSymbolTable, BorderLayout.WEST);
    	panelMain.add(panelCodeTextArea, BorderLayout.CENTER);
    	panelMain.add(panelTableError, BorderLayout.EAST);

    	// Creación del split pane para las tablas y el área de texto
    	JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, panelMain, null);
    	splitPane.setResizeWeight(0.5); // se ajusta el peso para que quede centrado

    	// Configuración del layout y agregado de componentes
    	JPanel panel = new JPanel(new BorderLayout());
    	panel.add(splitPane, BorderLayout.CENTER);

    	getContentPane().setLayout(new BorderLayout());
    	getContentPane().add(panel, BorderLayout.CENTER);

    	pack();
    }

    private void compile() {
    	

    	// Se obtiene el codigo ingresado en el area de texto
    	String inputCode = textAreaCode.getText();

    	// Se crea un ANTLRInputStream a partir del codigo obtenido anteriormente
    	ANTLRInputStream inputStream = new ANTLRInputStream(inputCode);

    	// Se crea un lexer para analizar los tokens del codigo
    	ShapeScriptLexer lexer = new ShapeScriptLexer(inputStream);

    	// Se crea un CommonTokenStream a partir del lexer creado anteriormente
    	CommonTokenStream tokens = new CommonTokenStream(lexer);

    	// Se crea un parser para analizar la estructura del codigo
    	ShapeScriptParser parser = new ShapeScriptParser(tokens);

    	// Se crea un ShapeScriptCustomErrorListener para manejar los errores de analisis
    	ShapeScriptCustomErrorListener errorListener = new ShapeScriptCustomErrorListener();

    	// Se remueven los listeners de error por defecto y se agrega el listener personalizado
    	parser.removeErrorListeners();
    	parser.addErrorListener(errorListener);

    	// Se obtiene el arbol de parseo a partir del codigo analizado por el parser
    	ShapeScriptParser.ProgramContext tree = parser.program();

    	// Si hay errores de analisis, se muestran en una tabla de errores
    	if (errorListener.hasErrors()) {
	    	Object[][] tableErrorData = errorListener.getErrorTable();
	    	tableError.setModel(new DefaultTableModel(tableErrorData, ERROR_TABLE_COLUMNS));
	    	// Imprime el encabezado de la tabla
	    	System.out.printf("%-10s %-10s %-50s\n", "Linea", "Columna", "Mensaje");
	    	for (int i = 0; i < tableErrorData.length; i++) {
	    	    String line = (String) tableErrorData[i][0];
	    	    String column = (String) tableErrorData[i][1];
	    	    String message = (String) tableErrorData[i][2];

	    	    // Imprime los datos de la fila en una tabla con tres columnas
	    	    System.out.printf("%-10s %-10s %-50s\n", line, column, message);
	    	}
    	} else {
    		tableError.setModel(EMPTY_ERROR_TABLE_MODEL);
    	}

    	// Se crea un ShapeScriptCustomListener para manejar los eventos de entrada y salida de cada regla en el arbol de parseo
    	ShapeScriptCustomListener listener = new ShapeScriptCustomListener();

    	// Se agrega el listener personalizado al parser
    	parser.addParseListener(listener);

    	// Se crea un ParseTreeWalker para recorrer el arbol de parseo con el ShapeScriptCustomListener
    	ParseTreeWalker walker = new ParseTreeWalker();
    	walker.walk(listener, tree);

    	// Se obtiene una tabla de simbolos a partir de la informacion recolectada por el ShapeScriptCustomListener
    	Object[][] tableSymbolData = listener.getSymbolTable();

    	// Se muestra la tabla de simbolos en una tabla grafica
    	tableSymbol.setModel(new DefaultTableModel(tableSymbolData, SYMBOL_TABLE_COLUMNS));

    	// Se crea un ShapeScriptCustomVisitor para visitar el arbol de parseo y generar el codigo de salida
    	ShapeScriptCustomVisitor visitor = new ShapeScriptCustomVisitor();

    	// Se visita el arbol de parseo con el ShapeScriptCustomVisitor
    	visitor.visit(tree);
    	
    }
    
    private void clear() {
    	tableSymbol.setModel(EMPTY_SYMBOL_TABLE_MODEL);
	    tableError.setModel(EMPTY_ERROR_TABLE_MODEL);
	    textAreaCode.setText("");
    }

    public static void main(String[] args) {
        Compiler form = new Compiler();
        form.setVisible(true);
    }
}