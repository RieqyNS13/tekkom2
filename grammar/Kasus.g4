grammar Kasus;



// START:stat
prog:   declaration ';' stat+ ;

block 	: '{'
		stat*
	  '}'
	;

stat:   assignment ';'
    | ifstat
    | whilestat
    | input ';'
    | print ';'
    | block
    ;

 ifstat	:	'if' expr a=block ('else' b=block)?
    ;

whilestat
	:	 'while' expr block
	;

// END:stat

declaration
	:
	'var' ID ( ',' ID)*
	;

print   :
	'print' ID
	| 'print' STRING
	| 'println' STRING
	| 'println' ID
	;
input	:
	'input' ID
	;

assignment
	:
	ID '=' expr
	;
// START:expr

expr 	: condExpr;

condExpr:  aexpr (relationalOp aexpr)*
                ;

aexpr:   multExpr (('+'|'-') multExpr)*
    ;

multExpr
    :   unaryExpr (('*'|'%'|'/') unaryExpr)*
    ;


relationalOp
    :    '<='
    |    '>='
    |   '<'
    |   '>'
    |    '=='
    |    '!='
    ;

unaryExpr
	: unary_op atom
	| atom
	;

atom:   INT
    | ID
    |   '(' expr ')'
    ;

unary_op:
	PLUS
	|MINUS
	;
// END:expr

// START:tokens
INT :   '0'..'9'+ ;
ID:    'a'..'z'+ ;
WS  :   (' '|'\t'|'\n'|'\r')+ {skip();} ;
STRING	:	 '\''( ~('\'') )*'\'' ;
PLUS	:	 '+';
MINUS :	 '-';
// END:tokens
