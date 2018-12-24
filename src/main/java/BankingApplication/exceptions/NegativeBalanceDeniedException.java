package BankingApplication.exceptions;

public class NegativeBalanceDeniedException extends BankException {

    public NegativeBalanceDeniedException(String text) {
        super(text);
    }

    public NegativeBalanceDeniedException(String text, Object... list) {
        super(text, list);
    }

    public NegativeBalanceDeniedException(Throwable cause, String text, Object... list) {
        super(cause, text, list);
    }


}
