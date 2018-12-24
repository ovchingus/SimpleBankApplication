package BankingApplication.exceptions;

public class WithdrawDeniedException extends BankException {

    public WithdrawDeniedException(String text) {
        super(text);
    }

    public WithdrawDeniedException(String text, Object... list) {
        super(text, list);
    }

    public WithdrawDeniedException(Throwable cause, String text, Object... list) {
        super(cause, text, list);
    }
}
