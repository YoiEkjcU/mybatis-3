package cn.eid.mapper;

import org.apache.ibatis.jdbc.SQL;

import cn.eid.entity.SysUser;

public interface SysUserMapper {

//    @Select("select user_id userId, avatar avatar, account account, password password, salt salt, name name, birthday birthday, sex sex, email email, phone phone, status status, create_time createTime, create_user createUser, update_time updateTime, update_user updateUser, version version, idCard idCard, unit_id unitId, unit_name unitName, social_account socialAccount, inspect_company inspectCompany, user_type userType, out_date outDate, validate_code validateCode from sys_user where user_id = #{id}")
    SysUser getById(int id);

//    @SelectProvider(type = SysUserMapperSelectProvider.class, method = "getById")
//    @Results({ //
//            @Result(column = "user_id", property = "userId"), //
//            @Result(column = "avatar", property = "avatar"), //
//            @Result(column = "account", property = "account"), //
//            @Result(column = "password", property = "password"), //
//            @Result(column = "salt", property = "salt"), //
//            @Result(column = "name", property = "name"), //
//            @Result(column = "birthday", property = "birthday"), //
//            @Result(column = "sex", property = "sex"), //
//            @Result(column = "email", property = "email"), //
//            @Result(column = "phone", property = "phone"), //
//            @Result(column = "status", property = "status"), //
//            @Result(column = "create_time", property = "createTime"), //
//            @Result(column = "create_user", property = "createUser"), //
//            @Result(column = "update_time", property = "updateTime"), //
//            @Result(column = "update_user", property = "updateUser"), //
//            @Result(column = "version", property = "version"), //
//            @Result(column = "idCard", property = "idCard"), //
//            @Result(column = "unit_id", property = "unitId"), //
//            @Result(column = "unit_name", property = "unitName"), //
//            @Result(column = "social_account", property = "socialAccount"), //
//            @Result(column = "inspect_company", property = "inspectCompany"), //
//            @Result(column = "user_type", property = "userType"), //
//            @Result(column = "out_date", property = "outDate"), //
//            @Result(column = "validate_code", property = "validateCode") //
//})
//    SysUser getById(int id);

    class SysUserMapperSelectProvider {

        public String getById(int id) {
            String sql = new SQL()//
                    .SELECT("user_id, avatar, account, password, salt, name, birthday, sex, email, phone, status, create_time, create_user, update_time,"
                            + "update_user, version, idCard, unit_id, unit_name, social_account, inspect_company, user_type, out_date, validate_code")//
                    .FROM("sys_user")//
                    .WHERE("user_id = #{id}").toString();
            return sql;
}
}
}
