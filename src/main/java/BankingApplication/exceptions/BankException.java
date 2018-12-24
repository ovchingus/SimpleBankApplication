package BankingApplication.exceptions;

/**
 * The BankException is thrown when there is a
 * persistance exception. This exception this will be thrown from the
 * BankApp if an operation fail. Error messages provided to this exception are
 * formatted similar to the PrintStream.printf method.
 *
 * @author Vladimir
 */
public class BankException extends Exception {

    public BankException(String text) {
        super(text);
    }

    /**
     * Constructor for the BankException object.
     * This constructor takes a format string an a variable number of
     * object arguments, which can be inserted into the format string.
     *
     * @param text a format string used to present the error message
     * @param list a list of arguments to insert into the string
     */
    public BankException(String text, Object... list) {
        super(String.format(text, list));
    }

    /**
     * Constructor for the BankException object.
     * This constructor takes a format string an a variable number of
     * object arguments, which can be inserted into the format string.
     *
     * @param cause the source exception this is used to represent
     * @param text a format string used to present the error message
     * @param list a list of arguments to insert into the string
     */
    public BankException(Throwable cause, String text, Object... list) {
        super(String.format(text, list), cause);
    }
}
