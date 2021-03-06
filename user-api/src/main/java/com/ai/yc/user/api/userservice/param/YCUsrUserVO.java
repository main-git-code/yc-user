package com.ai.yc.user.api.userservice.param;

import java.sql.Timestamp;

import com.ai.opt.base.vo.BaseInfo;

public class YCUsrUserVO extends BaseInfo{

	private static final long serialVersionUID = 2207957250250450105L;
	private String userId;
	/**
	 * 昵称
	 */
    private String nickname;
    /**
     * 姓
     */
    private String lastname;
    /**
     * 名
     */
    private String firstname;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 生日
     */
    private Timestamp birthday;

    private String telephone;
    /**
     * 电话
     */
    private String mobilePhone;

    private String fixPhone;

    private String qq;
    /**
     * 地址
     */
    private String address;
    /**
     * 城市
     */
    private String cnCity;
    /**
     * 省份
     */
    private String province;
    /**
     * 国家
     */
    private String country;
    /**
     * 时区
     */
    private String tZone;

    private Integer occupation;

    private Integer title;
    /**
     * 会员等级
     */
    private String safetyLevel;
    /**
     * 注册时间
     */
    private Timestamp registTime;
    /**
     * 修改时间
     */
    private Timestamp lastModifyTime;
    /**
     * 用户来源
     */
    private String usersource;

    private Integer state;

    private String personsign;

    private String zipCode;

    private String portraitId;

    private String isChange;
    /**
     * 是否是译员
     */
    private Integer isTranslator;
    /**
     * 账户id
     */
    private Long accountId;

    private String griwthLevel;

    private Integer griwthValue;
	// 登录次数
	private Integer loginCount;
	// 余额
	private Long balance;
	// 积分
	private Long integral;
	/**
	 * 是否是企业
	 */
	private Integer isCompany;
	/**
	 * email
	 */
	private String email;
	/**
	 * 账户状态
	 */
	private String acctStatus;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 收藏数
	 */
	private Integer collectCount;
	/**
	 * 注册时IP
	 */
	private String registIP;
	
	private String translatorLevel;

	public String getUserId() {
		return userId;
	}
	public String getNickname() {
		return nickname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public Integer getSex() {
		return sex;
	}
	public Timestamp getBirthday() {
		return birthday;
	}
	public String getTelephone() {
		return telephone;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public String getFixPhone() {
		return fixPhone;
	}
	public String getQq() {
		return qq;
	}
	public String getAddress() {
		return address;
	}
	public String getCnCity() {
		return cnCity;
	}
	public String getProvince() {
		return province;
	}
	public String getCountry() {
		return country;
	}
	public String gettZone() {
		return tZone;
	}
	public Integer getOccupation() {
		return occupation;
	}
	public Integer getTitle() {
		return title;
	}
	public String getSafetyLevel() {
		return safetyLevel;
	}
	public Timestamp getRegistTime() {
		return registTime;
	}
	public Timestamp getLastModifyTime() {
		return lastModifyTime;
	}
	public String getUsersource() {
		return usersource;
	}
	public Integer getState() {
		return state;
	}
	public String getPersonsign() {
		return personsign;
	}
	public String getZipCode() {
		return zipCode;
	}
	public String getPortraitId() {
		return portraitId;
	}
	public String getIsChange() {
		return isChange;
	}
	public Integer getIsTranslator() {
		return isTranslator;
	}
	public Long getAccountId() {
		return accountId;
	}
	public String getGriwthLevel() {
		return griwthLevel;
	}
	public Integer getGriwthValue() {
		return griwthValue;
	}
	public Integer getLoginCount() {
		return loginCount;
	}
	public Long getBalance() {
		return balance;
	}
	public Long getIntegral() {
		return integral;
	}
	public Integer getIsCompany() {
		return isCompany;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public void setFixPhone(String fixPhone) {
		this.fixPhone = fixPhone;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCnCity(String cnCity) {
		this.cnCity = cnCity;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void settZone(String tZone) {
		this.tZone = tZone;
	}
	public void setOccupation(Integer occupation) {
		this.occupation = occupation;
	}
	public void setTitle(Integer title) {
		this.title = title;
	}
	public void setSafetyLevel(String safetyLevel) {
		this.safetyLevel = safetyLevel;
	}
	public void setRegistTime(Timestamp registTime) {
		this.registTime = registTime;
	}
	public void setLastModifyTime(Timestamp lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
	public void setUsersource(String usersource) {
		this.usersource = usersource;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public void setPersonsign(String personsign) {
		this.personsign = personsign;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public void setPortraitId(String portraitId) {
		this.portraitId = portraitId;
	}
	public void setIsChange(String isChange) {
		this.isChange = isChange;
	}
	public void setIsTranslator(Integer isTranslator) {
		this.isTranslator = isTranslator;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public void setGriwthLevel(String griwthLevel) {
		this.griwthLevel = griwthLevel;
	}
	public void setGriwthValue(Integer griwthValue) {
		this.griwthValue = griwthValue;
	}
	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	public void setIntegral(Long integral) {
		this.integral = integral;
	}
	public void setIsCompany(Integer isCompany) {
		this.isCompany = isCompany;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAcctStatus() {
		return acctStatus;
	}
	public void setAcctStatus(String acctStatus) {
		this.acctStatus = acctStatus;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getCollectCount() {
		return collectCount;
	}
	public void setCollectCount(Integer collectCount) {
		this.collectCount = collectCount;
	}
	public String getRegistIP() {
		return registIP;
	}
	public void setRegistIP(String registIP) {
		this.registIP = registIP;
	}
	public String getTranslatorLevel() {
		return translatorLevel;
	}
	public void setTranslatorLevel(String translatorLevel) {
		this.translatorLevel = translatorLevel;
	}
	
}
