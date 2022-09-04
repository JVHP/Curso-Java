package model.exceptions;

public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 0l;

    public DomainException(String message) {
        super(message);
    }
}
