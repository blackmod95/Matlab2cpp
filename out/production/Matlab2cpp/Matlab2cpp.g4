grammar Matlab2cpp;

start : (param ENTER)* param?;

param : math;

math : init_var | init_matrix | equation | set_item;

init_var : lvalue ASSIGN number SC?;

init_matrix : lvalue ASSIGN matrices SC?;

matrices : matrix | range | zeros | ones | eye ;

lvalue : NAME;

set_item : item ASSIGN (number | item);

item : lvalue LB number (CM number)? RB;

section : lvalue LB (row | column) RB;

row : number CM DP;

column : DP CM number;

equation : lvalue ASSIGN rvalue SC? ;

rvalue : rvalue lb_ops rvalue | term;

term : u_ops | number | LB rvalue RB | term hb_ops term;

u_ops : (MINUS)? NAME (TRANSPOSE)?;

lb_ops : (PLUS | MINUS);

hb_ops : (PDIV | PMUL);

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