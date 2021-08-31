package org.apache.ibatis.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Month;

import org.apache.ibatis.lang.UsesJava8;

/**
 *
 * @since 3.4.5
 * @author Björn Raupach
 */
@UsesJava8
public class MonthTypeHandler extends BaseTypeHandler<Month> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Month month, JdbcType type) throws SQLException {
        ps.setInt(i, month.getValue());
    }

    @Override
    public Month getNullableResult(ResultSet rs, String columnName) throws SQLException {
        int month = rs.getInt(columnName);
        return month == 0 ? null : Month.of(month);
    }

    @Override
    public Month getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        int month = rs.getInt(columnIndex);
        return month == 0 ? null : Month.of(month);
    }

    @Override
    public Month getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        int month = cs.getInt(columnIndex);
        return month == 0 ? null : Month.of(month);
    }

}
