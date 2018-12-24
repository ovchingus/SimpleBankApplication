package BankingApplication.exceptions;

public class TransferException extends  BankException {
    public TransferException(String text) {
        super(text);
    }

    public TransferException(String text, Object... list) {
        super(text, list);
    }

    public TransferException(Throwable cause, String text, Object... list) {
        super(cause, text, list);
    }
}
