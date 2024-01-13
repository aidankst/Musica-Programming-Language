import sys
from antlr4 import *
from MusicaLexer import MusicaLexer
from MusicaParser import MusicaParser
from Visitor import Visitor

input_stream = FileStream(sys.argv[1],encoding = 'utf-8')
lexer = MusicaLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = MusicaParser(token_stream)
tree = parser.root()

print(tree)

if len(sys.argv) > 2:
    visitor = Visitor(sys.argv[2])
else:
    visitor = Visitor()
    
visitor.visit(tree)