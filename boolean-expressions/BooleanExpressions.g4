grammar BooleanExpressions;

// Parser rules

// Matches one or more entryExpression rules before EOF
entryExpression
    : singleEntryExpression+ EOF
    ;

// Matches a single named Boolean expression
singleEntryExpression
    : IDENTIFIER '(' parameters ')' '=' booleanExpression
    ;

// Matches a comma-separated list of variables, e.g., "A,B,C"
parameters
    : IDENTIFIER (',' IDENTIFIER)* // At least one identifier, followed by zero or more additional identifiers separated by commas
    ;

// Defines the structure of a Boolean expression
booleanExpression
    : '-' booleanExpression                     # NegationExpression        // Logical NOT (highest precedence)
    | '(' booleanExpression ')'                 # ParenthesizedExpression   // Parentheses for grouping expressions
    | booleanExpression '&' booleanExpression   # AndExpression             // Logical AND (left-associative, medium precedence)
    | booleanExpression '+' booleanExpression   # OrExpression              // Logical OR (left-associative, lowest precedence)
    | IDENTIFIER                                # Variable                  // Boolean variable (e.g., A, B, C)
    | BOOLEAN                                   # BooleanConstant           // Boolean constants 0 or 1
    ;

// Lexer rules

// Matches identifiers like "F", "A", "B", etc. (letters followed by optional letters/digits/underscores)
IDENTIFIER
    : [A-Za-z][A-Za-z0-9_]*
    ;

// Matches Boolean constants: 0 (false) or 1 (true)
BOOLEAN
    : '0' | '1'
    ;

// Matches and skips whitespace (spaces, tabs, newlines) so they don't interfere with parsing
WS
    : [ \t\r\n]+ -> skip
    ;