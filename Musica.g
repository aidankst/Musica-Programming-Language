grammar Musica;

root: procDef*;


inss: ins*;
ins: (assign | input_ | output_)
    | (reprod | proc | condition | while_)
    | (addl | cut);

input_: '<?>' VAR;    
output_: '<w>' expr+;

condition: 'if' expr LB inss RB ('else' LB inss RB)?;

while_: 'while' expr LB inss RB;

sizel: SIZE VAR;
SIZE: '#';

NOTE: [A-G][0-9]?;

query: VAR LS expr RS;

PROCNAME: [A-Z][a-zA-Z0-9]*;
procDef: PROCNAME paramsId LB inss RB;
proc: PROCNAME paramsExpr;


assign: VAR ASSIGN expr;
ASSIGN: '<-';

paramsId: (VAR)*;
paramsExpr: (expr)*;


reprod: REPROD expr;
REPROD: '(:)';

cut: CUTTING VAR LS expr RS;
CUTTING: '8<';

addl: VAR ADDING expr;
ADDING: '<<';


liste: '{' expr* '}';

expr: expr MUL expr  
    | expr DIV expr  
    | expr MOD expr  
    | expr SUM expr  
    | expr MIN expr 
    | expr GT expr  
    | expr LT expr  
    | expr GET expr  
    | expr LET expr  
    | expr EQ expr  
    | expr NEQ expr  
    | VAR 
    | STRING 
    | NUM  
    | liste 
    | sizel  
    | query  
    | NOTE  
    | LP expr RP 
    ;

    
    
LB: '|:';
RB: ':|';
LS: '[';
RS: ']';
LP: '(';
RP: ')';



MUL: '*';
DIV: '/';
MOD: '%';
SUM: '+';
MIN: '-';
EQ: '=';
NEQ: '/=';
GT: '>';
LT: '<';
GET: '>=';
LET: '<=';




VAR: [a-zA-Z][a-zA-Z0-9]*;
NUM: '-'?[0-9]+;
STRING: '"' ( '\\' . | ~('\\'|'"'))* '"';

COMMENT: '###' ~[\r\n]* -> skip;

WS: [ \t\r\n]+ -> skip;