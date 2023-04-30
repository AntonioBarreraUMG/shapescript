package com.compiladores.shapescript.compilador;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ShapeScriptCustomErrorListener extends BaseErrorListener {
	
    private List<String[]> errors = new ArrayList<>();
    
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String[] error = new String[3];
        error[0] = String.valueOf(line);
        error[1] = String.valueOf(charPositionInLine);
        error[2] = msg;
        errors.add(error);
    }
    
    public boolean hasErrors() {
    	return this.getErrors().size() > 0;
    }
    
    public List<String[]> getErrors() {
        return errors;
    }
    
    public Object[][] getErrorTable() {
        Object[][] matrix = new Object[errors.size()][3];
        int i = 0;
        for (String[] error : this.getErrors()) {
        	matrix[i][0] = error[0];
            matrix[i][1] = error[1];
            matrix[i][2] = error[2];
            i++;
        }
        return matrix;
    }

}
