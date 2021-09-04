package org.apache.ibatis.executor.result;

import org.apache.ibatis.exceptions.PersistenceException;

/**
 * @author Ryan Lamore
 */
public class ResultMapException extends PersistenceException {

    private static final long serialVersionUID = 1L;

    public ResultMapException() {
    }

    public ResultMapException(String message) {
        super(message);
    }

    public ResultMapException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResultMapException(Throwable cause) {
        super(cause);
    }
}
