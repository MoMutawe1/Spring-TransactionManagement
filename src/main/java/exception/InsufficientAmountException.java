package exception;

public class InsufficientAmountException extends RuntimeException {
    public InsufficientAmountException (String ex) {
        super(ex);
    }
}
