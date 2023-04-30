// Generated from com/compiladores/shapescript/compilador/ShapeScript.g4 by ANTLR 4.5.1
package com.compiladores.shapescript.compilador;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShapeScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, HEX_CHAR=33, CHAR=34, DIGIT=35, WS=36;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_shapeCreation = 2, RULE_shapeParams = 3, 
		RULE_paramList = 4, RULE_param = 5, RULE_shapeManipulation = 6, RULE_transformOperator = 7, 
		RULE_shapeVisualization = 8, RULE_expression = 9, RULE_process = 10, RULE_shapeType = 11, 
		RULE_binaryOperator = 12, RULE_number = 13, RULE_identifier = 14, RULE_color = 15;
	public static final String[] ruleNames = {
		"program", "statement", "shapeCreation", "shapeParams", "paramList", "param", 
		"shapeManipulation", "transformOperator", "shapeVisualization", "expression", 
		"process", "shapeType", "binaryOperator", "number", "identifier", "color"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'x'", "'='", "'y'", "'radius'", "'width'", 
		"'height'", "'sides'", "'color'", "'rotate'", "'scale'", "'translate'", 
		"'reflect'", "'draw'", "'process'", "'{'", "'}'", "'circle'", "'rectangle'", 
		"'polygon'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'=='", "'!='", 
		"'.'", "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "HEX_CHAR", "CHAR", 
		"DIGIT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ShapeScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShapeScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeScriptVisitor ) return ((ShapeScriptVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				statement();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << CHAR) | (1L << DIGIT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ShapeCreationContext shapeCreation() {
			return getRuleContext(ShapeCreationContext.class,0);
		}
		public ShapeManipulationContext shapeManipulation() {
			return getRuleContext(ShapeManipulationContext.class,0);
		}
		public ShapeVisualizationContext shapeVisualization() {
			return getRuleContext(ShapeVisualizationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeScriptVisitor ) return ((ShapeScriptVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				shapeCreation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				shapeManipulation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				shapeVisualization();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				process();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeCreationContext extends ParserRuleContext {
		public ShapeTypeContext shapeType() {
			return getRuleContext(ShapeTypeContext.class,0);
		}
		public ShapeParamsContext shapeParams() {
			return getRuleContext(ShapeParamsContext.class,0);
		}
		public ShapeCreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeCreation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).enterShapeCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).exitShapeCreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeScriptVisitor ) return ((ShapeScriptVisitor<? extends T>)visitor).visitShapeCreation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShapeCreationContext shapeCreation() throws RecognitionException {
		ShapeCreationContext _localctx = new ShapeCreationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_shapeCreation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			shapeType();
			setState(45);
			shapeParams();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeParamsContext extends ParserRuleContext {
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ShapeParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).enterShapeParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).exitShapeParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeScriptVisitor ) return ((ShapeScriptVisitor<? extends T>)visitor).visitShapeParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShapeParamsContext shapeParams() throws RecognitionException {
		ShapeParamsContext _localctx = new ShapeParamsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_shapeParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__0);
			setState(48);
			paramList();
			setState(49);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeScriptVisitor ) return ((ShapeScriptVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			param();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(52);
				match(T__2);
				setState(53);
				param();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeScriptVisitor ) return ((ShapeScriptVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_param);
		try {
			setState(80);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(T__3);
				setState(60);
				match(T__4);
				setState(61);
				number();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__5);
				setState(63);
				match(T__4);
				setState(64);
				number();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				match(T__6);
				setState(66);
				match(T__4);
				setState(67);
				number();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(T__7);
				setState(69);
				match(T__4);
				setState(70);
				number();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				match(T__8);
				setState(72);
				match(T__4);
				setState(73);
				number();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				match(T__9);
				setState(75);
				match(T__4);
				setState(76);
				number();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
				match(T__10);
				setState(78);
				match(T__4);
				setState(79);
				color();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeManipulationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TransformOperatorContext transformOperator() {
			return getRuleContext(TransformOperatorContext.class,0);
		}
		public ShapeManipulationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeManipulation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).enterShapeManipulation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).exitShapeManipulation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeScriptVisitor ) return ((ShapeScriptVisitor<? extends T>)visitor).visitShapeManipulation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShapeManipulationContext shapeManipulation() throws RecognitionException {
		ShapeManipulationContext _localctx = new ShapeManipulationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_shapeManipulation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			identifier();
			setState(83);
			transformOperator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformOperatorContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TransformOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).enterTransformOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).exitTransformOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeScriptVisitor ) return ((ShapeScriptVisitor<? extends T>)visitor).visitTransformOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformOperatorContext transformOperator() throws RecognitionException {
		TransformOperatorContext _localctx = new TransformOperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_transformOperator);
		try {
			setState(103);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(T__11);
				setState(86);
				number();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__12);
				setState(88);
				match(T__0);
				setState(89);
				number();
				setState(90);
				match(T__2);
				setState(91);
				number();
				setState(92);
				match(T__1);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(T__13);
				setState(95);
				match(T__0);
				setState(96);
				number();
				setState(97);
				match(T__2);
				setState(98);
				number();
				setState(99);
				match(T__1);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(T__14);
				setState(102);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeVisualizationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShapeVisualizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeVisualization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).enterShapeVisualization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).exitShapeVisualization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeScriptVisitor ) return ((ShapeScriptVisitor<? extends T>)visitor).visitShapeVisualization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShapeVisualizationContext shapeVisualization() throws RecognitionException {
		ShapeVisualizationContext _localctx = new ShapeVisualizationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_shapeVisualization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__15);
			setState(106);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeScriptVisitor ) return ((ShapeScriptVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(109);
				number();
				}
				break;
			case CHAR:
				{
				setState(110);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(113);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(114);
					binaryOperator();
					setState(115);
					expression(2);
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ProcessContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).enterProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).exitProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeScriptVisitor ) return ((ShapeScriptVisitor<? extends T>)visitor).visitProcess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessContext process() throws RecognitionException {
		ProcessContext _localctx = new ProcessContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_process);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__16);
			setState(123);
			identifier();
			setState(124);
			match(T__17);
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				statement();
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << CHAR) | (1L << DIGIT))) != 0) );
			setState(130);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShapeTypeContext extends ParserRuleContext {
		public ShapeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shapeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).enterShapeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).exitShapeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeScriptVisitor ) return ((ShapeScriptVisitor<? extends T>)visitor).visitShapeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShapeTypeContext shapeType() throws RecognitionException {
		ShapeTypeContext _localctx = new ShapeTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_shapeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryOperatorContext extends ParserRuleContext {
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).exitBinaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeScriptVisitor ) return ((ShapeScriptVisitor<? extends T>)visitor).visitBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_binaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(ShapeScriptParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ShapeScriptParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeScriptVisitor ) return ((ShapeScriptVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(136);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(139); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(141);
				match(T__30);
				setState(143); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(142);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(145); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(ShapeScriptParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(ShapeScriptParser.CHAR, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeScriptVisitor ) return ((ShapeScriptVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(149);
					match(CHAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(152); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorContext extends ParserRuleContext {
		public List<TerminalNode> HEX_CHAR() { return getTokens(ShapeScriptParser.HEX_CHAR); }
		public TerminalNode HEX_CHAR(int i) {
			return getToken(ShapeScriptParser.HEX_CHAR, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ShapeScriptParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ShapeScriptParser.DIGIT, i);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeScriptListener ) ((ShapeScriptListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeScriptVisitor ) return ((ShapeScriptVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_color);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__31);
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				_la = _input.LA(1);
				if ( !(_la==HEX_CHAR || _la==DIGIT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HEX_CHAR || _la==DIGIT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00a3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2$\n"+
		"\2\r\2\16\2%\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\7\69\n\6\f\6\16\6<\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7S\n\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\tj\n\t\3\n\3\n\3\n\3\13\3\13\3\13\5\13r\n\13\3\13\3\13\3\13\3\13"+
		"\7\13x\n\13\f\13\16\13{\13\13\3\f\3\f\3\f\3\f\6\f\u0081\n\f\r\f\16\f\u0082"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17\u008c\n\17\r\17\16\17\u008d\3\17"+
		"\3\17\6\17\u0092\n\17\r\17\16\17\u0093\5\17\u0096\n\17\3\20\6\20\u0099"+
		"\n\20\r\20\16\20\u009a\3\21\3\21\6\21\u009f\n\21\r\21\16\21\u00a0\3\21"+
		"\2\3\24\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\5\3\2\26\30\3\2\31"+
		" \4\2##%%\u00a9\2#\3\2\2\2\4,\3\2\2\2\6.\3\2\2\2\b\61\3\2\2\2\n\65\3\2"+
		"\2\2\fR\3\2\2\2\16T\3\2\2\2\20i\3\2\2\2\22k\3\2\2\2\24q\3\2\2\2\26|\3"+
		"\2\2\2\30\u0086\3\2\2\2\32\u0088\3\2\2\2\34\u008b\3\2\2\2\36\u0098\3\2"+
		"\2\2 \u009c\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2"+
		"\2&\3\3\2\2\2\'-\5\6\4\2(-\5\16\b\2)-\5\22\n\2*-\5\24\13\2+-\5\26\f\2"+
		",\'\3\2\2\2,(\3\2\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\5\3\2\2\2./\5\30"+
		"\r\2/\60\5\b\5\2\60\7\3\2\2\2\61\62\7\3\2\2\62\63\5\n\6\2\63\64\7\4\2"+
		"\2\64\t\3\2\2\2\65:\5\f\7\2\66\67\7\5\2\2\679\5\f\7\28\66\3\2\2\29<\3"+
		"\2\2\2:8\3\2\2\2:;\3\2\2\2;\13\3\2\2\2<:\3\2\2\2=>\7\6\2\2>?\7\7\2\2?"+
		"S\5\34\17\2@A\7\b\2\2AB\7\7\2\2BS\5\34\17\2CD\7\t\2\2DE\7\7\2\2ES\5\34"+
		"\17\2FG\7\n\2\2GH\7\7\2\2HS\5\34\17\2IJ\7\13\2\2JK\7\7\2\2KS\5\34\17\2"+
		"LM\7\f\2\2MN\7\7\2\2NS\5\34\17\2OP\7\r\2\2PQ\7\7\2\2QS\5 \21\2R=\3\2\2"+
		"\2R@\3\2\2\2RC\3\2\2\2RF\3\2\2\2RI\3\2\2\2RL\3\2\2\2RO\3\2\2\2S\r\3\2"+
		"\2\2TU\5\36\20\2UV\5\20\t\2V\17\3\2\2\2WX\7\16\2\2Xj\5\34\17\2YZ\7\17"+
		"\2\2Z[\7\3\2\2[\\\5\34\17\2\\]\7\5\2\2]^\5\34\17\2^_\7\4\2\2_j\3\2\2\2"+
		"`a\7\20\2\2ab\7\3\2\2bc\5\34\17\2cd\7\5\2\2de\5\34\17\2ef\7\4\2\2fj\3"+
		"\2\2\2gh\7\21\2\2hj\5\36\20\2iW\3\2\2\2iY\3\2\2\2i`\3\2\2\2ig\3\2\2\2"+
		"j\21\3\2\2\2kl\7\22\2\2lm\5\36\20\2m\23\3\2\2\2no\b\13\1\2or\5\34\17\2"+
		"pr\5\36\20\2qn\3\2\2\2qp\3\2\2\2ry\3\2\2\2st\f\3\2\2tu\5\32\16\2uv\5\24"+
		"\13\4vx\3\2\2\2ws\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\25\3\2\2\2{y"+
		"\3\2\2\2|}\7\23\2\2}~\5\36\20\2~\u0080\7\24\2\2\177\u0081\5\4\3\2\u0080"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0084\3\2\2\2\u0084\u0085\7\25\2\2\u0085\27\3\2\2\2\u0086\u0087"+
		"\t\2\2\2\u0087\31\3\2\2\2\u0088\u0089\t\3\2\2\u0089\33\3\2\2\2\u008a\u008c"+
		"\7%\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0095\3\2\2\2\u008f\u0091\7!\2\2\u0090\u0092\7%\2"+
		"\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\35\3\2\2\2\u0097\u0099\7$\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2"+
		"\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\37\3\2\2\2\u009c\u009e"+
		"\7\"\2\2\u009d\u009f\t\4\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1!\3\2\2\2\17%,:Riqy\u0082\u008d"+
		"\u0093\u0095\u009a\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}