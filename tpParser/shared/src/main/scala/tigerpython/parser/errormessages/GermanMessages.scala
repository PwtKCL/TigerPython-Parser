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
  *
  * Created by Tobias Kohn on 30/06/2016
  * Updated by Tobias Kohn on 12/11/2019
  */
object GermanMessages extends ModifiableErrorMessages {
  import tigerpython.parser.errors.ErrorCode._

  protected def _getMessage(msg: ErrorCode.Value): String =
    msg match {
      case AND_CONNECTS_CMP_NOT_VARS => "'%s' verknüpft Vergleiche, nicht Variablen."
      case ARG_AFTER_VARARGS => "Nach einem entpackenden Argument können keine weiteren Argumente folgen."
      case AS_NOT_ALLOWED_HERE => "'as' ist hier nicht erlaubt/unterstützt."
      case ASSIGNMENT_TO_RIGHT => "Das Ziel einer Zuweisung muss immer links sein."
      case USE_BREAK_INSTEAD_OF_RETURN => "Verwende 'break' anstatt 'return', um eine Schleife zu verlassen."
      case BREAK_OUTSIDE_LOOP => "Eine '%s'-Anweisung kann nicht ausserhalb einer Schleife auftreten."
      case CALL_NEEDS_PARENTHESES => "Um eine Funktion aufzurufen musst du auch dann Klammern schreiben, wenn diese leer sind."
      case CANNOT_APPLY_ASYNC => "'async' kann nicht auf diese Anweisung angewendet werden."
      case CANNOT_ASSIGN_TO_CALL => "Einem Funktionsaufruf kann nichts zugewiesen werden."
      case CANNOT_ASSIGN_TO_FUNCTION => "Einer Funktion kann nichts zugewiesen werden."
      case CANNOT_REDEFINE_NAME => "Der Name '%s' ist bereits definiert."
      case CANNOT_TEST_TUPLE => "Jedes Element dieses Tupels muss hier einzeln getestet werden."
      case CANNOT_USE_KEYWORD_AS_NAME => "Das Schlüsselwort '%s' kann nicht als Name verwendet werden."
      case CLASS_METHOD_WITHOUT_SELF => "Eine Klassen-Methode braucht mindestens einen Parameter."
      case COLON_EXPECTED => "Doppelpunkt ':' fehlt."
      case CONDITION_CANNOT_BE_FULFILLED => "Bedingung kann nicht erfüllt werden."
      case CONDITION_ALWAYS_FULFILLED => "Bedingung ist immer erfüllt."
      case DECORATOR_NAME_CLASH => "Eine Funktion und ihr Dekorator können nicht den selben Namen '%s' haben."
      case DECORATOR_NEEDS_CALLABLE => "Dekoratoren können nur auf Funktionen und Klassen angewendet werden."
      case DEFINITION_INSIDE_LOOP => "'%s'-Definition kann nicht innerhalb einer Schleife sein."
      case DOUBLE_ELSE => "Eine '%s'-Struktur kann nur einen 'else'-Zweig haben."
      case DOUBLE_EQUAL_SIGN_EXPECTED => "Doppeltes Gleichheitszeichen '==' erwartet."
      case DOUBLE_PARAMETER_NAMES => "Zwei Parameter können nicht den gleichen Namen haben: '%s'"
      case ELSE_MUST_BE_INDENTED => "'%s' muss gleich eingerückt sein wie 'if'"
      case ELSE_WITH_COMPARISON => "'else' steht immer ohne eine Bedingung."
      case ELSE_WITHOUT_IF => "Da steht ein '%s' ohne das zugehörige 'if'"
      case EMPTY_SUBSCRIPT => "Der Index-Zugriff darf nicht leer sein."
      case EXTRA_INDENTATION => "Unerlaubte (zusätzliche) Einrückung."
      case EXTRA_LINEBREAK => "Hier scheint es einen unbeabsichtigten Zeilenwechsel zu haben."
      case EXTRA_LEFT_BRACKET => "Unerwartete öffnende Klammer ohne Gegenstück: '%s'."
      case EXTRA_RIGHT_BRACKET => "Unerwartete schliessende Klammer ohne Gegenstück: '%s'."
      case EXTRA_SPACE => "Unerlaubter (zusätzlicher) Abstand."
      case EXTRA_SPACE_OR_MISSING_COMMA => "Unerlaubter Abstand ohne fehlendes Komma."
      case EXTRA_TOKEN => "Unerwartete(s) Symbol(e): '%s'"
      case FOREIGN_KEYWORD => "'%s' is in Python kein Schlüsselwort."
      case FOREIGN_PRIVATE => "Unerlaubts Symbol: '%s', verwende den Unterstrich '_', um eine Funktion als 'private' zu markieren."
      case FOREIGN_STATEMENT => "Python hat keine '%s'-Anweisung."
      case FOREIGN_SYNTAX => "Diese %s-Syntax ist in Python ungültig."
      case FOREIGN_TOKEN => "Unerlaubtes Symbol: '%s', verwende stattdessen '%s'"
      case FOREIGN_VAR => "Python verwendet kein '%s', um Variablen zu definieren."
      case FOR_TARGET_NAME_REQUIRED => "Die 'for'-Schleife braucht eine Variable."
      case FUTURE_MUST_BE_FIRST => "Die 'from __future__ import'-Anweisung muss als erste Anweisung im Modul stehen."
      case GENERATOR_CANNOT_RETURN_VALUE => "Ein Generator kann keine Werte mit 'return' zurückgeben."
      case GLOBAL_MUST_BE_FIRST => "'%s'-Anweisungen müssen in einer Funktion zuerst stehen."
      case GLOBAL_OUTSIDE_FUNCTION => "Eine '%s'-Anweisung kann nicht ausserhalb einer Funktion stehen."
      case IMPORT_INSIDE_LOOP => "'import'-Anweisungen dürfen nicht in einer Schleife stehen."
      case INCOMPLETE_IMPORT => "Unvollständige 'import'-Anweisung."
      case INCONSISTENT_INDENTATION => "Die Einrückung ist nicht einheitlich."
      case INCONSISTENT_RETURNS => "Die 'return'-Anweisungen sind nicht einheitlich."
      case INDENTED_ELSE => "Dieses '%s' ist zu stark eingerückt."
      case INFINITE_LOOP => "Unendliche Schleife."
      case INITIALIZATION_INSIDE_LOOP => "Die Variablen-Initialisierung muss vor der Schleife stehen."
      case INVALID_ASSIGNMENT => "Kann nicht etwas zu '%s' zuweisen."
      case INVALID_AUGASSIGN_TARGET => "Dieser Ausdruck kann nicht als Ziel für eine erweiterte Zuweisung auftreten."
      case INVALID_FUNCTION_DEF => "Ungültige Definition einer Funktion."
      case INVALID_FUNCTION_DEF_ASSIGN => "Verwende ':' und 'return' anstelle der Zuweisung."
      case INVALID_GENERATOR_ARG => "Ein 'generator/comprehension' kann nicht mit anderen Argumenten kombiniert werden."
      case INVALID_INPUT_CHARACTER => "Ungültiges Zeichen: '%s'"
      case INVALID_KEY_VALUE_PAIR => "Ungültiges Schlüssel-Wert-Paar"
      case INVALID_NAME => "Ungültiger Name: '%s'"
      case INVALID_STRING_PREFIX => "Ungültiges String-Prefix: '%s'."
      case INVALID_TOKEN_AT_START_OF_LINE => "Ungültiges Zeichen am Anfang der Zeile: '%s'"
      case METHOD_WITHOUT_SELF => "Methoden brauchen einen 'self'-Parameter."
      case MISMATCHED_CLOSING_BRACKET => "Fehlerhafte Klammerung: An dieser Stelle braucht es '%s' anstatt '%s'"
      case MISPLACED_ASSIGN => "Die Zuweisung '%s' kann nicht Teil eines Ausdrucks sein."
      case MISSING_ASSIGNMENT => "Da scheint eine Zuweisung zu fehlen."
      case MISSING_ASSIGNMENT_SOURCE => "Der Zuweisung fehlt ein Wert."
      case MISSING_BODY => "Hier fehlt der Code-Block oder er ist nicht korrekt eingerückt."
      case MISSING_COMMA => "Fehlendes Komma ','."
      case MISSING_COMPARISON => "Hier fehlt ein Vergleich."
      case MISSING_DOT => "Da scheint ein Punkt '.' zu fehlen."
      case MISSING_LEFT_BRACKET => "Fehlende öffnende Klammer: '%s'"
      case MISSING_LEFT_PARENTHESIS => "Fehlende öffnende Klammer."
      case MISSING_OPERATOR_OR_COMMA => "Fehlender Operator oder Komma."
      case MISSING_PARENTHESES => "Da scheinen Klammern zu fehlen."
      case MISSING_RIGHT_BRACKET => "Fehlende schliessende Klammer: '%s'"
      case MISSING_SPACE => "Fehlender Abstand."
      case MISSING_TOKEN => "Hier fehlt ein '%s'."
      case MISSPELLED_KEYWORD => "Falsch geschriebenes Schlüsselwort: '%s' anstelle von '%s'."
      case MISSPELLED_NUMBER => "In dieser Zahl hat es offenbar einen Tippfehler."
      case MISSPELLED_OPERATOR => "Falsch geschriebener Operator: '%s' anstelle von '%s'."
      case MULTIPLE_VAR_ARGS => "Es darf nur ein entpackendes Argument vorkommen."
      case MULTIPLE_VAR_PARAMS => "Es darf nur ein entpackender Parameter vorkommen."
      case NAME_EXPECTED => "Hier wird ein Name erwartet."
      case NO_END_NEEDED => "Python braucht kein 'end'."
      case NO_PARAM_DEFAULT_ALLOWED => "Entpackende Parameter können keine Standardwerte haben."
      case NO_VIABLE_ALTERNATIVE => "Hier gibt es keine Möglichkeit mehr, den Code zu verstehen: '%s'"
      case NUMBER_NOT_SUBSCRIPTABLE => "Eine Zahl kann keinen Index haben."
      case PARAM_AFTER_KEYWORD_PARAM => "Der entpackende Schlüsselwert-Parameter muss zuletzt kommen."
      case PARAMS_REQUIRED => "Parameter erwartet aber '%s' gefunden."
      case POS_ARG_AFTER_KEYWORD => "Positionsbezogene Argumente können nicht nach Schlüsselwert-Argumenten stehen."
      case POS_PARAM_AFTER_KEYWORD => "Parameter ohne Standardwert können nicht nach solchen mit Standardwert oder entpackenden Parameter stehen."
      case PRINT_DEST_EXPECTED => "Nach '>>' ein gültiges Ausgabe-Ziel stehen."
      case PRINT_IS_STATEMENT => "In Python 2.x ist 'print' eine Anweisung und kann nicht mit Schlüsselwörtern aufgerufen werden."
      case PRINT_NEEDS_PARENTHESES => "In Python 3.x ist 'print' eine Funktion und benötigt Klammern."
      case PYTHON_2_FEATURE_NOT_AVAILABLE => "Dieses Feature von Python 2.x ist nicht verfügbar."
      case PYTHON_3_FEATURE_NOT_AVAILABLE => "Dieses Feature von Python 3.x ist nicht verfügbar."
      case USE_RETURN_INSTEAD_OF_BREAK => "Verwende 'return' anstelle von 'break', um eine Funktion zu verlassen."
      case RETURN_OUTSIDE_FUNCTION => "Eine 'return'-Anweisung kann nicht ausserhalb einer Funktion stehen."
      case SINGLE_EQUAL_SIGN_EXPECTED => "Verwende ein einzelnes Gleichheitszeichen '=' für Zuweisungen."
      case SUPERFLUOUS_COMPARISON => "Der Vergleich mit '%s' ist hier überflüssig."
      case SWAPPED_TOKENS => "Diese beiden Symbole sind hier vertauscht: '%s' und '%s'."
      case TOKEN_REQUIRED => "Hier braucht es ein '%s' anstelle von '%s'."
      case TUPLE_NEEDS_PARENS => "Dieses Tuple muss in Klammern eingeschlossen werden."
      case UNEXPECTED_END_OF_INPUT => "Überraschendes Ende der Zeile oder des ganzen Programms."
      case UNEXPECTED_KEYWORD => "Das Schlüsselwort '%s' kann an dieser Stelle nicht auftreten."
      case UNMATCHED_BRACKET => "Zu dieser öffnenden Klammer '%s' fehlt die schliessende Klammer."
      case UNREACHABLE_CODE => "Unerreichbarer Code."
      case UNTERMINATED_STRING => "Nicht abgeschlossener String."
      case USE_AND_NOT_COMMA => "Mehrere Vergleiche werden mit 'and' oder 'or' kombiniert, nicht mit einem Komma."
      case USE_COMMA_NOT_AND => "Mehrere Werte werden durch Komma getrennt und nicht durch 'and'."
      case USE_ELIF_INSTEAD_OF_ELSE => "Verwende 'elif' anstelle von 'else'."
      case USE_ELIF_INSTEAD_OF_ELSE_IF => "Verwende 'elif' anstelle von 'else if'."
      case USE_EQ_INSTEAD_OF_NEQ => "Verwende '== %s' anstelle von '!= %s'."
      case USE_MOD_NOT_DIV => "Verwende '%%' anstelle von '/', um die Teilbarkeit zu prüfen."
      case USE_NOT_INSTEAD_OF_FALSE => "Verwende 'not' anstelle eines Vergleichs mit '%s'."
      case USE_REPEAT_INSTEAD_OF_WHILE => "Verwende 'repeat' anstelle von 'while'."
      case USELESS_COMPUTATION => "Das Resultat dieses Ausdrucks wird nie verwendet."
      case USELESS_STATEMENT => "Wirkungslose Anweisung."
      case USELESS_STMT_USE_AUG_ASSIGN => "Wirkungslose Anweisung. Meinst du vielleicht '%s='?"
      case VARARG_AFTER_KEYWORD_ARG => "Das entpackende VAR-argument muss vor dem entpackenden Schlüsselwert-Argument stehen."
      case VARARG_NOT_ALLOWED => "Entpackende Argumente sind an dieser Stelle nicht erlaubt."
      case WRONG_BRACKET => "Falsche Klammer: hier braucht es eine '%s' anstelle von '%s'"
      case WRONG_TOKEN => "Falsches Symbol: anstelle von '%s' sollte hier '%s' stehen."
      case YIELD_OUTSIDE_FUNCTION => "Ein 'yield'-Ausdruck kann nicht ausserhalb einer Funktion stehen."
      case _ => null
    }
}
