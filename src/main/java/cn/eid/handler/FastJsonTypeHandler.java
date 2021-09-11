package cn.eid.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class FastJsonTypeHandler extends BaseTypeHandler<Object> {

    private Class<?> cls;

    public FastJsonTypeHandler(Class<?> cls) {
        this.cls = cls;
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, JSON.toJSONString(parameter));
    }

    @Override
    public Object getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return parse(rs.getObject(columnName));
    }

    @Override
    public Object getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return parse(rs.getObject(columnIndex));
    }

    @Override
    public Object getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return parse(cs.getObject(columnIndex));
    }

    private Object parse(Object obj) {
        if (obj == null) {
            return null;
        }
        Object parse = JSON.parse(obj.toString());
        if (parse instanceof JSONObject) {
            JSONObject jobj = (JSONObject) parse;
            return jobj.toJavaObject(cls);
        } else if (parse instanceof JSONArray) {
            JSONArray jarr = (JSONArray) parse;
            return jarr.toJavaList(cls);
        } else {
            throw new RuntimeException("不支持的类型");
        }
    }
}
