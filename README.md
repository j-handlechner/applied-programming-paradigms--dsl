setup: .zshrc
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

## Usual procedure:
antlr4 BooleanExpressions.g4  
javac -cp .:/opt/homebrew/Cellar/antlr/4.13.2/antlr-4.13.2-complete.jar *.java   
grun BooleanExpressions entryExpression input.txt -gui  