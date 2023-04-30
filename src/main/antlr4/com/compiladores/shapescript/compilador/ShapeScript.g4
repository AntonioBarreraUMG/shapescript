grammar ShapeScript;

program: statement+;

statement: 
		  shapeCreation | 
          shapeManipulation | 
          shapeVisualization |
          expression | 
          process;

shapeCreation: shapeType shapeParams;

shapeParams: '(' paramList ')';

paramList: param (',' param)*;

param: 
      'x' '=' number | 
      'y' '=' number | 
      'radius' '=' number | 
      'width' '=' number | 
      'height' '=' number | 
      'sides' '=' number | 
      'color' '=' color;

shapeManipulation: identifier transformOperator;

transformOperator: 
              'rotate' number | 
              'scale' '(' number ',' number ')' | 
              'translate' '(' number ',' number ')' | 
              'reflect' identifier;

shapeVisualization: 'draw' identifier;

expression: 
            number | 
            identifier | 
            expression binaryOperator expression;

process: 'process' identifier '{' statement+ '}';

shapeType: 'circle' | 'rectangle' | 'polygon';
binaryOperator: '+' | '-' | '*' | '/' | '>' | '<' | '==' | '!=';
number: DIGIT+ ('.' DIGIT+)?;
identifier: CHAR+;
color: '#' (HEX_CHAR | DIGIT)+;

HEX_CHAR: [A-F];
CHAR: [a-z];
DIGIT: [0-9];

WS: [ \t\r\n]+ -> skip;
