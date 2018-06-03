grammar Matlab2cpp;

start : (param ENTER)* param?;

param : math;

math : init_var | init_matrix | unary_operation | binary_operation;

init_var : NAME ASSIGN number SC?;

init_matrix : NAME ASSIGN (matrix | range | zeros | ones | eye) SC?;

unary_operation : NAME ASSIGN NAME (TRANSPOSE)? SC?;

binary_operation : NAME ASSIGN NAME (PLUS | MINUS | PMUL | PDIV) (NAME | number) SC?;

matrix : LSQB ((line SC)* line)? RSQB;

range : number DP number (DP number)?;

zeros : ZEROS number (CM number)* RB SC?;

ones : ONES number (CM number)* RB SC?;

eye : EYE number RB SC?;

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
PMUL : '.*';
PDIV : './';
TRANSPOSE : '\'' | '.\'';
WS : [ \t\r\n] -> skip ;
ZEROS : 'zeros(' ;
ONES : 'ones(' ;
EYE : 'eye(';