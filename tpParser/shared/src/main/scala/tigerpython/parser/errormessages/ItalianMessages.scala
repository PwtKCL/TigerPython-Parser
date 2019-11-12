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
  * @author Sven Gregorio
  *
  * Created by Tobias Kohn on 23/02/2017
  * Updated by Tobias Kohn on 12/11/2019
  */
object ItalianMessages extends ModifiableErrorMessages {
  import tigerpython.parser.errors.ErrorCode._

  protected def _getMessage(msg: ErrorCode.Value): String =
    msg match {
        case AND_CONNECTS_CMP_NOT_VARS => "'%s' connette comparazioni, non variabili."
        case ARG_AFTER_VARARGS => "Non puoi passare ulteriori argomenti dopo un argomento spacchettante."
        case AS_NOT_ALLOWED_HERE => "'as' non è permesso/supportato qui."
        case ASSIGNMENT_TO_RIGHT => "Il target dell'assegnamento deve essere sulla sinistra."
        case USE_BREAK_INSTEAD_OF_RETURN => "Usa 'break' invece di 'return' per uscire da un ciclo."
        case BREAK_OUTSIDE_LOOP => "Non si può usare un'istruzione '%s' fuori da un ciclo."
        case CALL_NEEDS_PARENTHESES => "Per invocare una funzione devi usare le parentesi anche quando sono vuote."
        case CANNOT_APPLY_ASYNC => "Non è possibile applicare 'async' a questa istruzione."
        case CANNOT_ASSIGN_TO_CALL => "Non puoi assegnare qualcosa ad un'invocazione."
        case CANNOT_ASSIGN_TO_FUNCTION => "Non puoi assegnare qualcosa ad una funzione."
        case CANNOT_REDEFINE_NAME => "Il nome '%s' è già definito."
        case CANNOT_TEST_TUPLE => "Devi testare ogni elemento di questa tupla individualmente."
        case CANNOT_USE_KEYWORD_AS_NAME => "Non puoi usare la parola chiave '%s' come un nome."
        case CLASS_METHOD_WITHOUT_SELF => "Un metodo di classe richiede almeno un parametro."
        case COLON_EXPECTED => "Due punti ':' sono necessari qui."
        case CONDITION_CANNOT_BE_FULFILLED => "Questa condizione non può essere soddisfatta."
        case CONDITION_ALWAYS_FULFILLED => "Questa condizione è sempre soddisfatta."
        case DECORATOR_NAME_CLASH => "Una funziona e il suo decoratore non possono avere lo stesso nome '%s'."
        case DECORATOR_NEEDS_CALLABLE => "Decoratori sono applicabili solo a funzioni e classi."
        case DEFINITION_INSIDE_LOOP => "Una definizione '%s' non può essere in un ciclo."
        case DOUBLE_ELSE => "Una struttura '%s' può avere solo un ramo 'else'."
        case DOUBLE_EQUAL_SIGN_EXPECTED => "Qui è richiesto un doppio uguale '=='."
        case DOUBLE_PARAMETER_NAMES => "Due parametri non possono avere lo stesso nome: '%s'."
        case ELSE_MUST_BE_INDENTED => "'%s' deve essere indentato quanto 'if'."
        case ELSE_WITH_COMPARISON => "'else' non ha una comparazione."
        case ELSE_WITHOUT_IF => "C'è un '%s' senza un 'if'."
        case EMPTY_SUBSCRIPT => "L'indice non può essere vuoto."
        case EXTRA_INDENTATION => "C'è un indentazione di troppo."
        case EXTRA_LINEBREAK => "Sembra che ci sia un'interruzione di linea di troppo. Forse vuoi nasconderla usando '\\'."
        case EXTRA_LEFT_BRACKET => "C'è una parentesi aperta di troppo: '%s'."
        case EXTRA_RIGHT_BRACKET => "C'è una parentesi chiusa di troppo: '%s'."
        case EXTRA_SPACE => "C'è uno spazio di troppo."
        case EXTRA_SPACE_OR_MISSING_COMMA => "C'è uno spazio di troppo o una virgola mancante."
        case EXTRA_TOKEN => "C'è un token di troppo: '%s'."
        case FOREIGN_KEYWORD => "'%s' non è una parola chiave in Python."
        case FOREIGN_PRIVATE => "Il token '%s' non è valido, usa il trattino basso '_' per marcare la funzione come 'privata'."
        case FOREIGN_STATEMENT => "Python non ha un istruzione '%s'."
        case FOREIGN_SYNTAX => "La seguente sintassi non è valida in Python: %s."
        case FOREIGN_TOKEN => "Il token '%s' non è valido, invece usa '%s'."
        case FOREIGN_VAR => "Python non usa '%s' per definire variabili."
        case FOR_TARGET_NAME_REQUIRED => "Il ciclo-'for' richiede una variabile."
        case FUTURE_MUST_BE_FIRST => "L'istruzione 'from __future__ import' deve essere la prima istruzione del modulo."
        case GENERATOR_CANNOT_RETURN_VALUE => "Un generatore non può usare 'return' per restituire un valore."
        case GLOBAL_MUST_BE_FIRST => "Le istruzioni '%s' devono essere la prime istruzioni all'interno di una funzione."
        case GLOBAL_OUTSIDE_FUNCTION => "Un'istruzione '%s' non può essere all'esterno di una funzione."
        case IMPORT_INSIDE_LOOP => "Un istruzione 'import' non può essere all'interno di un ciclo."
        case INCOMPLETE_IMPORT => "Questa istruzione 'import' è incompleta."
        case INCONSISTENT_INDENTATION => "L'indentazione è inconsistente."
        case INCONSISTENT_RETURNS => "Questa funzione ogni tanto ritorna un valore e ogni tanto no."
        case INDENTED_ELSE => "Questo '%s' deve essere indentato."
        case INFINITE_LOOP => "Questo è un ciclo infinito: la sua esecuzione non termina mai."
        case INITIALIZATION_INSIDE_LOOP => "Non puoi avere un'inizializzazione all'interno di un ciclo."
        case INVALID_ASSIGNMENT => "Non puoi assegnare qualcosa a '%s'."
        case INVALID_FUNCTION_DEF => "Definizione di funzione non valida."
        case INVALID_FUNCTION_DEF_ASSIGN => "Usa ':' e 'return' invece di un assegnamento."
        case INVALID_GENERATOR_ARG => "Un argomento 'generatore/comprensione' non può essere combinato con altri argomenti."
        case INVALID_INPUT_CHARACTER => "Questo carattere immesso non è valido: '%s'."
        case INVALID_KEY_VALUE_PAIR => "Questa coppia chiave-valore non è valida."
        case INVALID_NAME => "Questo nome non è valido: '%s'."
        case INVALID_AUGASSIGN_TARGET => "Questa espressione non è un target valido per un assegnamento aumentato."
        case INVALID_STRING_PREFIX => "Questo non è un prefisso di stringa valido: '%s'."
        case INVALID_TOKEN_AT_START_OF_LINE => "Questo token non può essere all'inizio di una riga: '%s'."
        case METHOD_WITHOUT_SELF => "Un metodo richiede un argomento 'self'."
        case MISMATCHED_CLOSING_BRACKET => "Ci sono parentesi non corrispondenti: dovrebbe esserci '%s', ma c'è '%s'."
        case MISPLACED_ASSIGN => "L'assegnamento '%s' non può avvenire all'interno di un espressione."
        case MISSING_ASSIGNMENT => "Sembra che manca un assegnamento."
        case MISSING_ASSIGNMENT_SOURCE => "A questo assegnamento manca un espressione sorgente."
        case MISSING_BODY => "Manca un corpo o un indentazione."
        case MISSING_COMMA => "Manca una virgola."
        case MISSING_COMPARISON => "Manca una comparazione."
        case MISSING_DOT => "Sembra che manca un punto."
        case MISSING_LEFT_BRACKET => "Manca una parentesi aperta: '%s'."
        case MISSING_LEFT_PARENTHESIS => "Manca una parentesi tonda aperta '('."
        case MISSING_OPERATOR_OR_COMMA => "Manca un operatore o una virgola."
        case MISSING_PARENTHESES => "Sembra che mancano delle parentesi."
        case MISSING_RIGHT_BRACKET => "Manca una parentesi chiusa: '%s'."
        case MISSING_SPACE => "Manca uno spazio."
        case MISSING_TOKEN => "Manca '%s'."
        case MISSPELLED_KEYWORD => "Parola chiave errata '%s' invece di '%s'."
        case MISSPELLED_NUMBER => "Sembra che ci sia un errore all'interno del tuo numero."
        case MISSPELLED_OPERATOR => "Operatore errato '%s' invece di '%s'."
        case MULTIPLE_VAR_ARGS => "È permesso un solo argomento spacchettante."
        case MULTIPLE_VAR_PARAMS => "È permesso un solo argomento spacchettante."
        case NAME_EXPECTED => "Qui serve un nome."
        case NO_END_NEEDED => "In Python non serve 'end', e non è nemmeno permesso."
        case NO_PARAM_DEFAULT_ALLOWED => "Un argomento spacchettante non può avere un valore default."
        case NO_VIABLE_ALTERNATIVE => "Non esiste nessun alternativa sensata: '%s'."
        case NUMBER_NOT_SUBSCRIPTABLE => "Un numero non può avere un indice."
        case PARAM_AFTER_KEYWORD_PARAM => "L'argomento spacchettante deve essere alla fine."
        case PARAMS_REQUIRED => "Sono richiesti dei parametri, ma si è trovato '%s'."
        case POS_ARG_AFTER_KEYWORD => "Argomenti posizionali non possono essere dopo argomenti con parola chiave."
        case POS_PARAM_AFTER_KEYWORD => "Parametri senza defaults non possono essere dopo parametri con valori default o spacchettanti"
        case PRINT_DEST_EXPECTED => "'>>' deve essere seguito da un target valido."
        case PRINT_IS_STATEMENT => "In Python 2.x 'print' è un'istruzione e non può essere invocata con argomenti con parola chiave."
        case PRINT_NEEDS_PARENTHESES => "In Python 3.x 'print' è una funzione e richiede parentesi."
        case PYTHON_2_FEATURE_NOT_AVAILABLE => "Questa funzionalità da Python 2.x non è disponibile."
        case PYTHON_3_FEATURE_NOT_AVAILABLE => "Questa funzionalità da Python 3.x non è disponibile."
        case USE_RETURN_INSTEAD_OF_BREAK => "Usa 'return' invece di 'break' per uscire da una funzione."
        case RETURN_OUTSIDE_FUNCTION => "Un'istruzione 'return' non può essere all'esterno di una funzione."
        case SINGLE_EQUAL_SIGN_EXPECTED => "Usa un singolo uguale '=' per assegnamenti."
        case SUPERFLUOUS_COMPARISON => "La comparazione con '%s' è superflua qui."
        case SWAPPED_TOKENS => "Sembra che questi token sono scambiati: '%s' e '%s'."
        case TOKEN_REQUIRED => "'%s' è richiesto, però '%s' è stato trovato."
        case TUPLE_NEEDS_PARENS => "Questa tupla deve essere tra parentesi."
        case UNEXPECTED_END_OF_INPUT => "Interruzione di riga o di input inaspettato."
        case UNEXPECTED_KEYWORD => "La parola chiave '%s' non può essere in questo punto."
        case UNMATCHED_BRACKET => "Questa parentesi aperta '%s' non ha una parentesi chiusa corrispondente."
        case UNREACHABLE_CODE => "Questo codice non è raggiungibile e non sarà mai eseguito."
        case UNTERMINATED_STRING => "Questa stringa non è chiusa."
        case USE_AND_NOT_COMMA => "Multiple comparazioni sono collegate con 'and' oppure 'or' invece che da una virgola."
        case USE_COMMA_NOT_AND => "Multipli valori sono separati con la virgola invece che con 'and'."
        case USE_ELIF_INSTEAD_OF_ELSE => "Usa 'elif' invece di 'else'."
        case USE_ELIF_INSTEAD_OF_ELSE_IF => "Usa 'elif' invece di 'else if'."
        case USE_EQ_INSTEAD_OF_NEQ => "Usa '== %s' invece di '!= %s'."
        case USE_MOD_NOT_DIV => "Usa '%%' invece di '/' per verificare se un numero è divisibile."
        case USE_NOT_INSTEAD_OF_FALSE => "Usa 'not' piuttosto che una comparazione con '%s'."
        case USE_REPEAT_INSTEAD_OF_WHILE => "Usa 'repeat' invece di 'while'."
        case USELESS_COMPUTATION => "Il risultato di questa espressione non viene mai usato."
        case USELESS_STATEMENT => "Questa istruzione è inutile: non ha nessun effetto."
        case USELESS_STMT_USE_AUG_ASSIGN => "Questa istruzione è inutile. Intendevi '%s='?"
        case VARARG_AFTER_KEYWORD_ARG => "L'argomento spacchettante variabile deve essere prima dell'argomento spacchettante con parola chiave."
        case VARARG_NOT_ALLOWED => "Argomenti spacchettanti non sono permessi a questo punto."
        case WRONG_BRACKET => "Parentesi sbagliata: '%s' è richiesto invece di '%s'."
        case WRONG_TOKEN => "Simbolo sbagliato '%s' invece di '%s'."
        case YIELD_OUTSIDE_FUNCTION => "Un'espressione 'yield' non può essere all'esterno di una funzione."
        case _ => null
    }
}
