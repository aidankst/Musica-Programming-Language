# Double Interpreter for Musica Programming Language
**by** : Kaung Sithu | Min Khant Soe Oke

**Formal Languages and Compilers**

***AGH University of Science and Technology***

## Abstract:
This project aims to develop a double interpreter for the Musica Programming Language, which is designed specifically for algorithmic music composition. The interpreter will generate both PDF scores and sound files (WAV and MP3) based on the compositions written in Musica. The project requires thorough understanding of the Musica language syntax and semantics, creation of an ANTLR4 grammar, implementation of a Python interpreter, integration with LilyPond and other music generation tools, and error handling mechanisms.

## Project Overview:
The Musica Programming Language is a simple language designed for algorithmic music composition. It allows users to create melodies, rhythms, and harmonies using a variety of instructions. The language also supports the generation of PDF scores and sound files.
This project will develop a double interpreter for Musica. The first interpreter will read Musica code and translate it into a representation that can be used by a music generation engine. The second interpreter will read the representation of the music and generate PDF scores and sound files.

## Project Requirements:
- Understand the syntax and semantics of the Musica Programming Language
- Create an ANTLR4 grammar for the Musica language
- Implement a Python interpreter for the Musica language
- Integrate the Python interpreter with LilyPond for generating PDF scores
- Integrate the Python interpreter with Timidity++ or another MIDI-to-WAV converter for generating WAV files
- Implement error handling mechanisms to catch and report errors

## Project Success Criteria:
- The interpreter should be able to correctly interpret all Musica code from the documentation
- The interpreter should generate PDF scores that match the examples in the documentation
- The interpreter should generate WAV files that accurately represent the melodies, rhythms, and harmonies of the Musica code
- The interpreter should handle errors gracefully and provide informative error messages

## How to run the project?
**Step 1: Clone the Repository**
Clone the repository containing the ANTLR grammar and generated code to your local machine.

**Step 2: Generate the Parser**
If you haven't already, generate the parser using ANTLR. You can do this by running the following command from the project root directory:
'''
antlr4 -Dlanguage=Python3 -no-listener -visitor Musica.g
'''
This will generate the necessary lexer and parser classes for python.

**Run the Program**
Run the program using the following command:

```
python3 Musica.py music_language_sample.musica
```

or 

```
python3 Musica.py music_language_sample.musica Hanoi
```

## Conclusion:
The development of a double interpreter for Musica is a challenging but rewarding project that will provide significant benefits to the music community. The project will also give us valuable experience in programming and music theory.
