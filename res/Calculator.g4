grammar Calculator;

expr : assign;

assign : (IDENTIFIER '=')? multiplicative;

multiplicative : additive (('*' | '/' | '%') additive)*;

additive : negate (('+' | '-') negate)*;

negate : '-'? terminal;

terminal : NUMBER | IDENTIFIER | '(' expr ')';

IDENTIFIER: [a-zA-Z][a-zA-Z0-9_]*;
NUMBER: [0-9]+;
NEWLINE: '\r'? '\n';

// Skip all whitespaces
WHITESPACE: [ \t]+ -> skip;

// Skip comments
COMMENT: '//' ~('\r' | '\n')* -> skip;