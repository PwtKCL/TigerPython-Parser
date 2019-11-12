/*
 * This file is part of the 'TigerPython-Parser' project.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package tigerpython.parser
package errormessages

import tigerpython.parser.errors.ErrorCode

/**
  * @author Tobias Kohn
  * @author Cédric Donner
  *
  * Created by Tobias Kohn on 22/02/2017
  * Updated by Tobias Kohn on 07/11/2019
  */
object FrenchMessages extends ModifiableErrorMessages {
  import tigerpython.parser.errors.ErrorCode._

 protected def _getMessage(msg: ErrorCode.Value): String =
    msg match {
        case AND_CONNECTS_CMP_NOT_VARS => "Combinaison erronée d'une expression booléenne avec une variable non booléenne à l'aide de l'opérateur logique '%s'."
        case AS_NOT_ALLOWED_HERE => "'as' n'est pas autorisé dans ce contexte."
        case ASSIGNMENT_TO_RIGHT => "La destination d'une assignation doit se trouve à gauche de l'opérateur d'assignation et non à droite."
        case USE_BREAK_INSTEAD_OF_RETURN => "Il faut utiliser 'break' au lieu de 'return' pour interrompre une boucle."
        case BREAK_OUTSIDE_LOOP => "Il n'est pas possible d'utiliser l'instruction '%s' à l'extérieur d'une boucle."
        case CALL_NEEDS_PARENTHESES => "Il faut utiliser des parenthèses pour appeler une fonction."
        case CANNOT_APPLY_ASYNC => "Il est impossible d'appliquer 'async' à cette instruction."
        case CANNOT_ASSIGN_TO_CALL => "Il est impossible d'assigner une valeur à l'appel d'une fonction."
        case CANNOT_ASSIGN_TO_FUNCTION => "Il est dangereux d'assigner une valeur à une fonction existante. Par mesure de sécurité, TigerJython n'autorise pas cette opération."
        case CANNOT_CALL_VALUE => "Il n'est pas possible d'appeler '%s' avec des parenthèses car ce n'est ni une fonction ni un objet 'callable'."
        case CANNOT_REDEFINE_NAME => "Le nom '%s' est déjà défini : il est dangereux de l'écraser. Par mesure de sécurité, TigerJython n'autorise pas cette opération."
        case CANNOT_TEST_TUPLE => "Il faut tester tous les éléments de ce tuple individuellement."
        case CANNOT_USE_KEYWORD_AS_NAME => "'%s' est un mot réservé : impossible de l'utiliser comme un nom."
        case CLASS_METHOD_WITHOUT_SELF => "Une méthode de classe nécessite au moins un paramètre (référence à la classe)."
        case COLON_EXPECTED => "Il manque le double point ':'."
        case CONDITION_CANNOT_BE_FULFILLED => "Cette condition n'est jamais satisfaite."
        case CONDITION_ALWAYS_FULFILLED => "Cette condition est toujours satisfaite."
        case DECORATOR_NAME_CLASH => "Une fonction et son décorateur ne peuvent pas prendre le même nom '%s'."
        case DECORATOR_NEEDS_CALLABLE => "Seules les fonctions et les classes peuvent être décorées."
        case DEFINITION_INSIDE_LOOP => "Il faut définir la fonction '%s' à l'extérieur de la boucle."
        case DOUBLE_CALL => "Double appel : la valeur de retour de la fonction ne peut pas faire l'objet d'un appel."
        case DOUBLE_ELSE => "Une instruction '%s' ne peut avoir qu'une seule branche 'else'."
        case DOUBLE_EQUAL_SIGN_EXPECTED => "Pour tester l'égalité, il faut utiliser l'opérateur '=='."
        case DOUBLE_PARAMETER_NAMES => "La fonction ne peut pas prendre deux paramètres de même nom : '%s'."
        case ELSE_MUST_BE_INDENTED => "Il faut que le '%s' soit indenté de la même manière que le 'if'."
        case ELSE_WITH_COMPARISON => "'else' n'accepte pas de condition : utiliser 'elif'."
        case ELSE_WITHOUT_IF => "Il faut d'abord mettre un 'if' avant un '%s'."
        case EMPTY_SUBSCRIPT => "Il faut fournir un indice ou un 'slice' entre les crochets []."
        case EXTRA_BRACKETS => "Il y a des parenthèses en trop."
        case EXTRA_INDENTATION => "Cette ligne est trop indentée par rapport à la précédente."
        case EXTRA_LEFT_BRACKET => "Il y a une parenthèse ouvrante en trop: '%s'."
        case EXTRA_LINEBREAK => "Pour écrire cette instruction sur plusieurs lignes, il faut mettre '\\' en fin de ligne."
        case EXTRA_LINE_NUMBER => "Il semble qu'il y ait un nombre trop grand de lignes."
        case EXTRA_RIGHT_BRACKET => "Il y a une parenthèse fermante en trop: '%s'."
        case EXTRA_SPACE => "Il y a un espace en trop."
        case EXTRA_SPACE_OR_MISSING_COMMA => "Soit il y a un espace en trop, soit il manque une virgule."
        case EXTRA_TOKEN => "Tokens en trop détectés : '%s'."
        case FOREIGN_KEYWORD => "'%s' n'est pas un mot-clé Python valide."
        case FOREIGN_STATEMENT => "'%s' n'est pas une instruction Python valide."
        case FOREIGN_SYNTAX => "'%s' ne constitue pas une syntaxe valide en Python."
        case FOREIGN_TOKEN => "Le token '%s' est invalide en Python. Essayer d'utiliser '%s' à la place."
        case FOREIGN_VAR => "Python n'utilise pas '%s' pour définir les variables."
        case FOR_TARGET_NAME_REQUIRED => "Le boucle 'for' nécessite une variable de contrôle."
        case FUTURE_MUST_BE_FIRST => "L'instruction 'from __future__ import' doit être placée au tout début du module."
        case GENERATOR_CANNOT_RETURN_VALUE => "On ne peut pas utiliser 'return' pour renvoyer une valeur depuis un générateur."
        case GLOBAL_MUST_BE_FIRST => "Les instructions '%s' doivent être placées tout au début du corps de la fonction."
        case GLOBAL_OUTSIDE_FUNCTION => "L'instruction '%s' n'est valide qu'à l'intérieur d'une fonction."
        case IMPORT_INSIDE_LOOP => "L'instruction 'import' ne peut pas figurer à l'intérieur d'une boucle."
        case INCOMPLETE_IMPORT => "Instruction 'import' incomplète."
        case INCONSISTENT_INDENTATION => "Indentation incohérente."
        case INCONSISTENT_RETURNS => "Parfois, cette fonction renvoie une valeur, parfois elle ne renvoie rien."
        case INDENTED_ELSE => "Le '%s' ne doit pas être indenté."
        case INDENTED_HEADER => "L'en-tête de l'instruction '%s' ne doit pas être indenté : seul son corps doit l'être."
        case INFINITE_LOOP => "Boucle infinie probablement involontaire."
        case INITIALIZATION_INSIDE_LOOP => "Il ne faut pas initialiser une variable à l'intérieur d'une boucle."
        case INVALID_ASSIGNMENT => "Il n'est pas possible d'assigner une valeur à '%s'."
        case INVALID_FUNCTION_DEF => "Cette définition de fonction n'est pas valide."
        case INVALID_FUNCTION_DEF_ASSIGN => "Utiliser ':' et 'return' au lieu d'une assignation."
        case INVALID_GENERATOR_ARG => "Il n'est pas possible de combiner un paramètre donné sous forme de 'générateur/compréhension' avec d'autres paramètres."
        case INVALID_INPUT_CHARACTER => "Ce caractère n'est pas valide: '%s'."
        case INVALID_KEY_VALUE_PAIR => "Ce couple de clé-valeur n'est pas valide."
        case INVALID_NAME => "Ce nom n'est pas valide: '%s'."
        case INVALID_AUGASSIGN_TARGET => "Cette expression n'est pas valide comme destination d'une assignation."
        case INVALID_STRING_PREFIX => "'%s' n'est pas un préfixe de chaîne de caractères valide."
        case INVALID_TOKEN_AT_START_OF_LINE => "Le token '%s' ne peut pas se trouver en début de ligne."
        case METHOD_WITHOUT_SELF => "Une fonction de classe nécessite un paramètre 'self'."
        case MISMATCHED_CLOSING_BRACKET => "La parenthèse fermante n'est pas appropriée: essayer '%s' au lieu de '%s'."
        case MISPLACED_ASSIGN => "L'assignation '%s' ne peut pas faire partie d'une expression."
        case MISSING_ASSIGNMENT => "Il semble qu'il manque une assignation."
        case MISSING_ASSIGNMENT_SOURCE => "Il manque une expression source à droite de l'assignation."
        case MISSING_BODY => "Cette structure nécessite un corps. Vérifier l'indentation !"
        case MISSING_COMMA => "Il manque une virgule."
        case MISSING_COMPARISON => "Le test nécessaire est manquant."
        case MISSING_DOT => "Il manque un point."
        case MISSING_EXPRESSION => "Il manque une expression."
        case MISSING_LEFT_BRACKET => "Il manque une parenthèse ouvrante: '%s'."
        case MISSING_LEFT_PARENTHESIS => "Il manque une parenthèse ouvrante '('."
        case MISSING_OPERATOR_OR_COMMA => "Il manque une virgule ou un opérateur."
        case MISSING_PARENTHESES => "Il semble qu'il manque des parenthèses ici."
        case MISSING_RIGHT_BRACKET => "Il manque une parenthèse fermante: '%s'."
        case MISSING_SPACE => "Il manque un espace."
        case MISSING_TOKEN => "Il manque un '%s'."
        case MISSPELLED_KEYWORD => "Mot-clé mal orthographié : '%s' au lieu de '%s'."
        case MISSPELLED_NUMBER => "Il semble que le nombre soit mal orthographié."
        case MISSPELLED_OPERATOR => "Opérateur mal orthographié : '%s' au lieu de '%s'."
        case NAME_EXPECTED => "Nom attendu à cet endroit."
        case NESTED_FUNCTIONS => "Définition d'une fonction à l'intérieur d'une autre fonction : est-ce bien volontaire ?"
        case NO_END_NEEDED => "En Python, il ne faut pas mettre 'end' pour terminer un bloc d'instructions."
        case NO_VIABLE_ALTERNATIVE => "Impossible de déterminer le type d'erreur et de suggérer une correction : '%s'."
        case NUMBER_NOT_SUBSCRIPTABLE => "Impossible d'indicer les nombres."
        case PARAMS_REQUIRED => "Il faut indiquer les paramètres entre parenthèses : '%s' trouvé à la place."
        case PRINT_IS_STATEMENT => "En Python 2.x, 'print' n'est pas une fonction et ne peut pas être appelé avec des paramètres nommés."
        case PRINT_NEEDS_PARENTHESES => "En Python 3.x, 'print' est une fonction et nécessite des parenthèses."
        case USE_RETURN_INSTEAD_OF_BREAK => "Il faut utiliser 'return' au lieu de 'break' pour sortir d'une fonction."
        case RETURN_OUTSIDE_FUNCTION => "Une instruction 'return' ne peut pas figurer hors d'une fonction."
        case SINGLE_EQUAL_SIGN_EXPECTED => "Pour effectuer une assignation, il faut utiliser un seul caractère '='."
        case SUPERFLUOUS_COMPARISON => "Dans ce cas, la comparaison avec '%s' est superflue."
        case SWAPPED_TOKENS => "Il semble que ces tokens soient inversés: '%s' et '%s'."
        case TOKEN_REQUIRED => "Il faut un '%s' à la place de '%s'."
        case TUPLE_NEEDS_PARENS => "Pour former un tuple, il faut mettre les valeurs entre parenthèses."
        case UNEXPECTED_END_OF_INPUT => "Fin de ligne inattendue."
        case UNEXPECTED_KEYWORD => "Le mot-clé '%s' est inattendu dans ce contexte."
        case UNMATCHED_BRACKET => "La parenthèse ouvrante '%s' ne possède pas de parenthèse fermante correspondante."
        case UNREACHABLE_CODE => "Ce code est hors d'atteinte: il n'est jamais executé."
        case UNTERMINATED_STRING => "Chaîne de caractères non terminée."
        case USE_AND_NOT_COMMA => "Pour combiner plusieurs conditions, il faut utiliser 'and' ou 'or' et non une virgule."
        case USE_COMMA_NOT_AND => "Pour combiner plusieurs valeurs, il faut utiliser des virgules et non 'and'."
        case USE_ELIF_INSTEAD_OF_ELSE => "Utiliser 'elif' au lieu de 'else'."
        case USE_ELIF_INSTEAD_OF_ELSE_IF => "Utiliser 'elif' au lieu de 'else if'."
        case USE_EQ_INSTEAD_OF_NEQ => "Utiliser '== %s' au lieu de '!= %s'."
        case USE_MOD_NOT_DIV => "Utiliser '%%' au lieu de '/' pour tester la divisibilité."
        case USE_NOT_INSTEAD_OF_FALSE => "Utiliser 'not' au lieu d'une comparaison avec '%s'."
        case USE_PYTHON_POWER => "Utiliser '**' au lieu de '^'."
        case USE_REPEAT_INSTEAD_OF_WHILE => "Utiliser 'repeat' au lieu de 'while'."
        case USE_SEMICOLON_INSTEAD_OF_COMMA => "Utiliser un point-virgule au lieu d'une virgule."
        case USELESS_COMPUTATION => "Le résultat de cette expression n'est jamais utilisé."
        case USELESS_STATEMENT => "Cette instruction est inutile : elle n'a aucun effet."
        case USELESS_STMT_USE_AUG_ASSIGN => "Cette instruction est inutile. L'idée était-elle de faire '%s='?"
        case WRONG_BRACKET => "Mauvais type de parenthèses : il faut utiliser '%s' au lieu de '%s'."
        case WRONG_TOKEN => "Mauvais token : utiliser '%s' au lieu de '%s'."
        case YIELD_OUTSIDE_FUNCTION => "L'expression 'yield' ne peut pas figurer à l'extérieur du corps d'une fonction."
        case _ => null
    }
}
