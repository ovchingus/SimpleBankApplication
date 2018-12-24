package BankingApplication.exceptions;

public class InvalidAccountTypeException extends BankException {
    public InvalidAccountTypeException(String text) {
        super(text);
    }

    public InvalidAccountTypeException(String text, Object... list) {
        super(text, list);
    }

    public InvalidAccountTypeException(Throwable cause, String text, Object... list) {
        super(cause, text, list);
    }
}
