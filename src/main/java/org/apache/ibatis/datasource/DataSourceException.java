package org.apache.ibatis.datasource;

import org.apache.ibatis.exceptions.PersistenceException;

/**
 * @author Clinton Begin
 */
public class DataSourceException extends PersistenceException {

    private static final long serialVersionUID = 1L;

    public DataSourceException() {
        super();
    }

    public DataSourceException(String message) {
        super(message);
    }

    public DataSourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataSourceException(Throwable cause) {
        super(cause);
    }
}
