package BankingApplication.exceptions;

public class ReplenishmentDenied extends BankException {
    public ReplenishmentDenied(String text) {
        super(text);
    }

    public ReplenishmentDenied(String text, Object... list) {
        super(text, list);
    }

    public ReplenishmentDenied(Throwable cause, String text, Object... list) {
        super(cause, text, list);
    }
}
