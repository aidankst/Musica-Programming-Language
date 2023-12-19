import os
import operator
from collections import defaultdict

if __name__ is not None and "." in __name__:
    from .MusicaParser import MusicaParser
    from .MusicaVisitor import MusicaVisitor
else:
    from MusicaParser import MusicaParser
    from MusicaVisitor import MusicaVisitor


class Visitor(MusicaVisitor):
