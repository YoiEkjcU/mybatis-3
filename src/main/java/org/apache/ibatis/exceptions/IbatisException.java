package org.apache.ibatis.exceptions;

/**
 * @author Clinton Begin
 */
@Deprecated
public class IbatisException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public IbatisException() {
        super();
    }

    public IbatisException(String message) {
        super(message);
    }

    public IbatisException(String message, Throwable cause) {
        super(message, cause);
    }

    public IbatisException(Throwable cause) {
        super(cause);
    }
}
