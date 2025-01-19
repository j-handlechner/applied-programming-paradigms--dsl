# DSL Assignment

__This is the main result of this assignment - the generated tree for the input below.__  

![](./boolean-expressions/antlr4_parse_tree.png)
```
A = 0
B = 1
C = 0
F = A + -B & -(A + C)
F
````
(specified in input.txt)

### Usual procedure:
antlr4 BooleanExpressions.g4  
javac -cp .:/opt/homebrew/Cellar/antlr/4.13.2/antlr-4.13.2-complete.jar *.java   
grun BooleanExpressions entryExpression input.txt -gui  

### Setup (on a mac silicon)
File: .zshrc
```
# For DSL/Antrl
# Set JAVA_HOME
export JAVA_HOME="/opt/homebrew/opt/openjdk/libexec/openjdk.jdk/Contents/Home"

# Set CLASSPATH to include the ANTLR JAR and current directory
export CLASSPATH=".:/opt/homebrew/Cellar/antlr/4.13.2/antlr-4.13.2-complete.jar:$CLASSPATH"

# Alias to run ANTLR and TestRig
alias antlr4='java -jar /opt/homebrew/Cellar/antlr/4.13.2/antlr-4.13.2-complete.jar'
alias grun='java -cp $CLASSPATH org.antlr.v4.gui.TestRig'
````