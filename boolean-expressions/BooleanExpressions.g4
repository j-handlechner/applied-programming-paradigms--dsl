grammar BooleanExpressions;

// Parser rules
entryExpression
    : stat+;

// Matches a single named Boolean expression
stat
    : expr LINEBREAK
    | IDENTIFIER '=' expr LINEBREAK
    | LINEBREAK
    ;

// Defines the structure of a Boolean expression
expr
    : '-' expr                                  # NegationExpression        // Logical NOT (highest precedence)
    | '(' expr ')'                              # ParenthesizedExpression   // Parentheses for grouping expressions
    | left=expr '&' right=expr                  # AndExpression             // Logical AND (left-associative, medium precedence)
    | left=expr '+' right=expr                  # OrExpression              // Logical OR (left-associative, lowest precedence)
    | IDENTIFIER                                # Variable                  // Boolean variable (e.g., A, B, C)
    | BOOLEAN_CONST                             # BooleanConstant           // Boolean constants 0 or 1
    ;

// Matches identifiers like "F", "A", "B", etc. (letters followed by optional letters/digits/underscores)
IDENTIFIER
    : [A-Za-z][A-Za-z0-9_]*
    ;

BOOLEAN_CONST
    : '0' | '1'
    ;

LINEBREAK: '\r'? '\n' ;
WS: [ \t]+ -> skip;