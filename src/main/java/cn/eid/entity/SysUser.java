package cn.eid.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 用户主键ID */
    private Long userId;

    /** 头像 */
    private String avatar;

    /** 账号 */
    private String account;
    /** 密码 */
    private String password;
    /** md5密码盐 */
    private String salt;

    /** 姓名 */
    private String name;

    /** 生日 */
    private Date birthday;

    /** 性别 */
    private String sex;

    /** 邮箱 */
    private String email;

    /** 手机号 */
    private String phone;

    /** 角色id */
    private List<Long> roleId;

    /** 手机号 */
    private String status;

    /** 创建时间 */
    private Date createTime;

    /** 创建人 */
    private Long createUser;

    /** 更新时间 */
    private String updateTime;

    /** 更新人 */
    private Long updateUser;

    /** 乐观锁 */
    private int version;

    /***/
    private String idCard;

    /** 单位ID（t_business） */
    private Long unitId;

    /** 单位名称 */
    private String unitName;

    /** 社交账号 */
    private String socialAccount;

    /** 巡查单位、企业字典值 */
    private String inspectCompany;

    /** 用户类型：1.普通用户 2.企业用户，3.巡查用户 */
    private String userType;

    /** 过期时间（找回密码） */
    private Date outDate;

    /** 唯一标识 */
    private String validateCode;

    public Long getUserId() {
        return userId;
}

    public void setUserId(Long userId) {
        this.userId = userId;
}

    public String getAvatar() {
        return avatar;
}

    public void setAvatar(String avatar) {
        this.avatar = avatar;
}

    public String getAccount() {
        return account;
}

    public void setAccount(String account) {
        this.account = account;
}

    public String getPassword() {
        return password;
}

    public void setPassword(String password) {
        this.password = password;
}

    public String getSalt() {
        return salt;
}

    public void setSalt(String salt) {
        this.salt = salt;
}

    public String getName() {
        return name;
}

    public void setName(String name) {
        this.name = name;
}

    public Date getBirthday() {
        return birthday;
}

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
}

    public String getSex() {
        return sex;
}

    public void setSex(String sex) {
        this.sex = sex;
}

    public String getEmail() {
        return email;
}

    public void setEmail(String email) {
        this.email = email;
}

    public String getPhone() {
        return phone;
}

    public void setPhone(String phone) {
        this.phone = phone;
}

    public List<Long> getRoleId() {
        return roleId;
}

    public void setRoleId(List<Long> roleId) {
        this.roleId = roleId;
}

    public String getStatus() {
        return status;
}

    public void setStatus(String status) {
        this.status = status;
}

    public Date getCreateTime() {
        return createTime;
}

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
}

    public Long getCreateUser() {
        return createUser;
}

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
}

    public String getUpdateTime() {
        return updateTime;
}

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
}

    public Long getUpdateUser() {
        return updateUser;
}

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
}

    public int getVersion() {
        return version;
}

    public void setVersion(int version) {
        this.version = version;
}

    public String getIdCard() {
        return idCard;
}

    public void setIdCard(String idCard) {
        this.idCard = idCard;
}

    public Long getUnitId() {
        return unitId;
}

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
}

    public String getUnitName() {
        return unitName;
}

    public void setUnitName(String unitName) {
        this.unitName = unitName;
}

    public String getSocialAccount() {
        return socialAccount;
}

    public void setSocialAccount(String socialAccount) {
        this.socialAccount = socialAccount;
}

    public String getInspectCompany() {
        return inspectCompany;
}

    public void setInspectCompany(String inspectCompany) {
        this.inspectCompany = inspectCompany;
}

    public String getUserType() {
        return userType;
}

    public void setUserType(String userType) {
        this.userType = userType;
}

    public Date getOutDate() {
        return outDate;
}

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
}

    public String getValidateCode() {
        return validateCode;
}

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
}

    @Override
    public String toString() {
        return "SysUser [userId=" + userId + ", avatar=" + avatar + ", account=" + account + ", password=" + password + ", salt=" + salt + ", name=" + name + ", birthday=" + birthday + ", sex=" + sex + ", email=" + email + ", phone=" + phone + ", roleId="
                + roleId + ", status=" + status + ", createTime=" + createTime + ", createUser=" + createUser + ", updateTime=" + updateTime + ", updateUser=" + updateUser + ", version=" + version + ", idCard=" + idCard + ", unitId=" + unitId
                + ", unitName=" + unitName + ", socialAccount=" + socialAccount + ", inspectCompany=" + inspectCompany + ", userType=" + userType + ", outDate=" + outDate + ", validateCode=" + validateCode + "]";
}
}
