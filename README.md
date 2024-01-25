# Double Interpreter for Musica Programming Language
**by** : Kaung Sithu | Min Khant Soe Oke

**Formal Languages and Compilers**

***AGH University of Science and Technology***

## Abstract
This project aims to develop a double interpreter for the Musica Programming Language, which is designed specifically for algorithmic music composition. The interpreter will generate both PDF scores and sound files (WAV and MP3) based on the compositions written in Musica. The project requires thorough understanding of the Musica language syntax and semantics, creation of an ANTLR4 grammar, implementation of a Python interpreter, integration with LilyPond and other music generation tools, and error handling mechanisms.

## Project Overview
The Musica Programming Language is a simple language designed for algorithmic music composition. It allows users to create melodies, rhythms, and harmonies using a variety of instructions. The language also supports the generation of PDF scores and sound files.
This project will develop a double interpreter for Musica. The first interpreter will read Musica code and translate it into a representation that can be used by a music generation engine. The second interpreter will read the representation of the music and generate PDF scores and sound files.

## Project Requirements
- Understand the syntax and semantics of the Musica Programming Language
- Create an ANTLR4 grammar for the Musica language
- Implement a Python interpreter for the Musica language
- Integrate the Python interpreter with LilyPond for generating PDF scores
- Integrate the Python interpreter with Timidity++ or another MIDI-to-WAV converter for generating WAV files
- Implement error handling mechanisms to catch and report errors

## Project Success Criteria
- The interpreter should be able to correctly interpret all Musica code from the documentation
- The interpreter should generate PDF scores that match the examples in the documentation
- The interpreter should generate WAV files that accurately represent the melodies, rhythms, and harmonies of the Musica code
- The interpreter should handle errors gracefully and provide informative error messages

## How to run the project?
**Step 1: Clone the Repository**
Clone the repository containing the ANTLR grammar and generated code to your local machine.

**Step 2: Generate the Parser**
If you haven't already, generate the parser using ANTLR. You can do this by running the following command from the project root directory:
```
antlr4 -Dlanguage=Python3 -no-listener -visitor Musica.g
```
This will generate the necessary lexer and parser classes for python.

**Step 3: Run the Program**
Run the program using the following command:

```
python3 Musica.py music_language_sample.musica
```

or 

```
python3 Musica.py music_language_sample.musica Hanoi
```


## User Guide for Musica Programming Language


Before diving into Musica, it's important to understand its basic syntax and structure. Musica programs are composed of instructions that allow you to define processes, manipulate musical notes, and execute various musical operations.

### Key Concepts and Syntax

#### Basic Elements

- **Variables**: Start with a letter and can include alphanumeric characters.
- **Numbers**: Integer values, either positive or negative.
- **Strings**: Enclosed in double quotes (e.g., `"Hello"`).
- **Comments**: Begin with `###` and are not executed.

#### Input and Output

- **Input**: `<?>` followed by a variable name is used for input.
- **Output**: `<w>` followed by an expression is used for output.

#### Control Structures

- **If-Else Condition**: `if` followed by a condition and instructions within `|:` and `:|`. An `else` block can be added optionally.
- **While Loop**: `while` followed by a condition and instructions within `|:` and `:|`.

#### Procedures

- **Defining a Procedure**: Define a procedure with a name and a series of instructions.
- **Calling a Procedure**: Invoke a procedure by its name.

#### Musical Operations

- **Assign**: Use `<-` to assign a value to a variable.
- **Add**: `<<` adds musical elements to a variable.
- **Cut**: `8<` cuts a segment from a variable.
- **Reproduce**: `(:)` reproduces an expression.

#### Expressions

- **Arithmetic**: `+`, `-`, `*`, `/`, `%` for arithmetic operations.
- **Comparisons**: Includes `=`, `/=`, `>`, `<`, `>=`, `<=`.
- **Lists**: Enclosed expressions in `{}`.
- **Size Declaration**: `#` followed by a variable.
- **Musical Notes**: Format `[A-G][0-9]?`.

### Examples

#### Assigning a Value

```
musica
x <- 5;
```

#### Outputing a Value

```
<w> x + 3;
```

#### If-Else Condition

```
if x = 5 |: 
    <w> "x is five";
:| else |: 
    <w> "x is not five";
:|
```

#### While Loop

```
while x < 10 |:
    x <- x + 1;
:|
```

#### Defining and Calling a Procedure

```
MyProcedure |:
    <w> "Inside MyProcedure";
:|

MyProcedure;
```

## Conclusion
The development of a double interpreter for Musica is a challenging but rewarding project that will provide significant benefits to the music community. The project will also give us valuable experience in programming and music theory.
