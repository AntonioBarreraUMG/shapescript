// Generated from com/compiladores/shapescript/compilador/ShapeScript.g4 by ANTLR 4.5.1
package com.compiladores.shapescript.compilador;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ShapeScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ShapeScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ShapeScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ShapeScriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShapeScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ShapeScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShapeScriptParser#shapeCreation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShapeCreation(ShapeScriptParser.ShapeCreationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShapeScriptParser#shapeParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShapeParams(ShapeScriptParser.ShapeParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShapeScriptParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(ShapeScriptParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShapeScriptParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(ShapeScriptParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShapeScriptParser#shapeManipulation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShapeManipulation(ShapeScriptParser.ShapeManipulationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShapeScriptParser#transformOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformOperator(ShapeScriptParser.TransformOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShapeScriptParser#shapeVisualization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShapeVisualization(ShapeScriptParser.ShapeVisualizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShapeScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ShapeScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShapeScriptParser#process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcess(ShapeScriptParser.ProcessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShapeScriptParser#shapeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShapeType(ShapeScriptParser.ShapeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShapeScriptParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(ShapeScriptParser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShapeScriptParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ShapeScriptParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShapeScriptParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ShapeScriptParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShapeScriptParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(ShapeScriptParser.ColorContext ctx);
}