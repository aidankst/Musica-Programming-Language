grammar Musica;

root: procDef*;

inss: ins*;

ins: (assign | input_ | output_)
    | (reprod | proc | condition | while_)
    | (addl | cut);


input_: '<?>' VAR;
output_: '<w>' expr;

condition: 'if' expr LB inss RB ('else' LB inss RB)?;

while_: 'while' expr LB inss RB;

sizel: SIZE VAR;
SIZE: '#';

query: VAR LS expr RS;

assign: VAR ASSIGN expr;
ASSIGN: '<-';


PROCNAME: [A-Z][a-zA-Z0-9_]*;
procDef: PROCNAME paramsID LB inss RB;

proc: PROCNAME paramsExpr;

paramsID: (VAR)*;
paramsExpr: (expr)*;

reprod: REPROD expr;
REPROD: '(:)';

cut: CUTTING VAR LS expr RS;
CUTTING: 'cutting';

addl: VAR ADDING expr;
ADDING: '<<';

list: '{' expr* '}';

expr: expr MUL expr
    |   expr DIV expr
    |   expr MOD expr
    |   expr SUM expr
    |   expr MIN expr
    |   expr GT expr
    |   expr LT expr
    |   expr GET expr
    |   expr LET expr
    |   expr EQ expr
    |   expr NEQ expr
    |   VAR
    |   STRING
    |   NUM
    |   list
    |   sizel;

LB: '|:';
RB: ':|';

LS: '[';
RS: ']';

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

NUM: '-'?[0-9]+('.'[0-9]+)?;
STRING: '"' ('\\' . | ~('\\' | '"'))* '"';
VAR: [a-zA-Z][a-zA-Z0-9]*;