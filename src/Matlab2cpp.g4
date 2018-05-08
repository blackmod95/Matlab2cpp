grammar Matlab2cpp;

start : (param ENTER)*;

param : math;

math : init_var | init_matrix | unary_operation | binary_operation;

init_var : NAME ASSIGN (number | range | zeros | ones) SC?;

init_matrix : NAME ASSIGN matrix SC?;

unary_operation : NAME ASSIGN NAME (TRANSPOSE) SC?;

binary_operation : NAME ASSIGN (NAME | number) (PLUS | MINUS) (NAME | number) SC?;

matrix : LSQB ((line SC)* line)? RSQB;

range : number DP number (DP number)?;

zeros : ZEROS LB number (CM number)* RB SC?;

ones : ONES LB number (CM number)* RB SC?;

line : number+;

number : DIGIT;


SC : ';' ;
DP : ':' ;
CM : ',' ;
ENTER : '\n'+ ;
NAME : [a-zA-Z]+ ;
LB : '(' ;
RB : ')' ;
LSQB : '[' ;
RSQB : ']' ;
DIGIT : '-'?[0-9.]+ ;
VAR : [a-zA-Z_][a-zA-Z0-9_]* ;
ASSIGN : '=' ;
PLUS : '+' ;
MINUS : '-';
TRANSPOSE : '\'' | '.\'';
WS : [ \t\r\n] -> skip ;
ZEROS : 'zeros' ;
ONES : 'ones' ;