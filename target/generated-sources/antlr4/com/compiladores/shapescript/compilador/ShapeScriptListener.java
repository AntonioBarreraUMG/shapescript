// Generated from com/compiladores/shapescript/compilador/ShapeScript.g4 by ANTLR 4.5.1
package com.compiladores.shapescript.compilador;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ShapeScriptParser}.
 */
public interface ShapeScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ShapeScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ShapeScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ShapeScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ShapeScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ShapeScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeScriptParser#shapeCreation}.
	 * @param ctx the parse tree
	 */
	void enterShapeCreation(ShapeScriptParser.ShapeCreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeScriptParser#shapeCreation}.
	 * @param ctx the parse tree
	 */
	void exitShapeCreation(ShapeScriptParser.ShapeCreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeScriptParser#shapeParams}.
	 * @param ctx the parse tree
	 */
	void enterShapeParams(ShapeScriptParser.ShapeParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeScriptParser#shapeParams}.
	 * @param ctx the parse tree
	 */
	void exitShapeParams(ShapeScriptParser.ShapeParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeScriptParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(ShapeScriptParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeScriptParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(ShapeScriptParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeScriptParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(ShapeScriptParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeScriptParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(ShapeScriptParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeScriptParser#shapeManipulation}.
	 * @param ctx the parse tree
	 */
	void enterShapeManipulation(ShapeScriptParser.ShapeManipulationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeScriptParser#shapeManipulation}.
	 * @param ctx the parse tree
	 */
	void exitShapeManipulation(ShapeScriptParser.ShapeManipulationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeScriptParser#transformOperator}.
	 * @param ctx the parse tree
	 */
	void enterTransformOperator(ShapeScriptParser.TransformOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeScriptParser#transformOperator}.
	 * @param ctx the parse tree
	 */
	void exitTransformOperator(ShapeScriptParser.TransformOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeScriptParser#shapeVisualization}.
	 * @param ctx the parse tree
	 */
	void enterShapeVisualization(ShapeScriptParser.ShapeVisualizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeScriptParser#shapeVisualization}.
	 * @param ctx the parse tree
	 */
	void exitShapeVisualization(ShapeScriptParser.ShapeVisualizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ShapeScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ShapeScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeScriptParser#process}.
	 * @param ctx the parse tree
	 */
	void enterProcess(ShapeScriptParser.ProcessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeScriptParser#process}.
	 * @param ctx the parse tree
	 */
	void exitProcess(ShapeScriptParser.ProcessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeScriptParser#shapeType}.
	 * @param ctx the parse tree
	 */
	void enterShapeType(ShapeScriptParser.ShapeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeScriptParser#shapeType}.
	 * @param ctx the parse tree
	 */
	void exitShapeType(ShapeScriptParser.ShapeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeScriptParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(ShapeScriptParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeScriptParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(ShapeScriptParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeScriptParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ShapeScriptParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeScriptParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ShapeScriptParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeScriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ShapeScriptParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeScriptParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ShapeScriptParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ShapeScriptParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(ShapeScriptParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ShapeScriptParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(ShapeScriptParser.ColorContext ctx);
}