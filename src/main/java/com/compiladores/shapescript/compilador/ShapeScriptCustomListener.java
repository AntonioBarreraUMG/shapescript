package com.compiladores.shapescript.compilador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShapeScriptCustomListener extends ShapeScriptBaseListener {
	
	private List<String[]> symbols = new ArrayList<>();

	@Override
	public void enterIdentifier(ShapeScriptParser.IdentifierContext ctx) {
        String type = "Identifier";
        String name = ctx.getText();
        symbols.add(new String[]{type, name});
	}
	
	@Override
	public void enterNumber(ShapeScriptParser.NumberContext ctx) {
        String type = "Number";
        String name = ctx.getText();
        symbols.add(new String[]{type, name});
	}
	
	@Override
	public void enterColor(ShapeScriptParser.ColorContext ctx) {
        String type = "Color";
        String name = ctx.getText();
        symbols.add(new String[]{type, name});
	}
	
	@Override
	public void enterBinaryOperator(ShapeScriptParser.BinaryOperatorContext ctx) {
        String type = "Binary Operator";
        String name = ctx.getText();
        symbols.add(new String[]{type, name});
	}
	
	@Override
	public void enterShapeType(ShapeScriptParser.ShapeTypeContext ctx) {
        String type = "Shape Type";
        String name = ctx.getText();
        symbols.add(new String[]{type, name});
	}
	
	public Object[][] getSymbolTable() {
	    Object[][] matrix = new Object[symbols.size()][3];
	    Map<String, Integer> firstOccurrence = new HashMap<>();
	    int i = 0;
	    for (String[] symbol : symbols) {
	        String symbolName = symbol[0];
	        if (firstOccurrence.containsKey(symbolName)) {
	            int firstRow = firstOccurrence.get(symbolName);
	            matrix[i][0] = matrix[firstRow][0];
	        } else {
	            matrix[i][0] = i + 1;
	            firstOccurrence.put(symbolName, i);
	        }
	        matrix[i][1] = symbolName;
	        matrix[i][2] = symbol[1];
	        i++;
	    }
	    return matrix;
	}

}
