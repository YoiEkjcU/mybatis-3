package org.apache.ibatis.exceptions;

/**
 * @author Clinton Begin
 */
public class PersistenceException extends IbatisException {

    private static final long serialVersionUID = 1L;

    public PersistenceException() {
        super();
    }

    public PersistenceException(String message) {
        super(message);
    }

    public PersistenceException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersistenceException(Throwable cause) {
        super(cause);
    }
}
