package com.ai.yc.user.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class TEnterpriseCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public TEnterpriseCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("CUST_ID like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("CUST_ID not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNull() {
            addCriterion("ENTERPRISE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNotNull() {
            addCriterion("ENTERPRISE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualTo(String value) {
            addCriterion("ENTERPRISE_NAME =", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualTo(String value) {
            addCriterion("ENTERPRISE_NAME <>", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThan(String value) {
            addCriterion("ENTERPRISE_NAME >", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERPRISE_NAME >=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThan(String value) {
            addCriterion("ENTERPRISE_NAME <", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("ENTERPRISE_NAME <=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLike(String value) {
            addCriterion("ENTERPRISE_NAME like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotLike(String value) {
            addCriterion("ENTERPRISE_NAME not like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIn(List<String> values) {
            addCriterion("ENTERPRISE_NAME in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotIn(List<String> values) {
            addCriterion("ENTERPRISE_NAME not in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameBetween(String value1, String value2) {
            addCriterion("ENTERPRISE_NAME between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("ENTERPRISE_NAME not between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFileNameIsNull() {
            addCriterion("BUSINESS_LICENSE_FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFileNameIsNotNull() {
            addCriterion("BUSINESS_LICENSE_FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFileNameEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_FILE_NAME =", value, "businessLicenseFileName");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFileNameNotEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_FILE_NAME <>", value, "businessLicenseFileName");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFileNameGreaterThan(String value) {
            addCriterion("BUSINESS_LICENSE_FILE_NAME >", value, "businessLicenseFileName");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_FILE_NAME >=", value, "businessLicenseFileName");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFileNameLessThan(String value) {
            addCriterion("BUSINESS_LICENSE_FILE_NAME <", value, "businessLicenseFileName");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFileNameLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_FILE_NAME <=", value, "businessLicenseFileName");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFileNameLike(String value) {
            addCriterion("BUSINESS_LICENSE_FILE_NAME like", value, "businessLicenseFileName");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFileNameNotLike(String value) {
            addCriterion("BUSINESS_LICENSE_FILE_NAME not like", value, "businessLicenseFileName");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFileNameIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE_FILE_NAME in", values, "businessLicenseFileName");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFileNameNotIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE_FILE_NAME not in", values, "businessLicenseFileName");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFileNameBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE_FILE_NAME between", value1, value2, "businessLicenseFileName");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFileNameNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE_FILE_NAME not between", value1, value2, "businessLicenseFileName");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFilePathIsNull() {
            addCriterion("BUSINESS_LICENSE_FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFilePathIsNotNull() {
            addCriterion("BUSINESS_LICENSE_FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFilePathEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_FILE_PATH =", value, "businessLicenseFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFilePathNotEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_FILE_PATH <>", value, "businessLicenseFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFilePathGreaterThan(String value) {
            addCriterion("BUSINESS_LICENSE_FILE_PATH >", value, "businessLicenseFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_FILE_PATH >=", value, "businessLicenseFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFilePathLessThan(String value) {
            addCriterion("BUSINESS_LICENSE_FILE_PATH <", value, "businessLicenseFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFilePathLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE_FILE_PATH <=", value, "businessLicenseFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFilePathLike(String value) {
            addCriterion("BUSINESS_LICENSE_FILE_PATH like", value, "businessLicenseFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFilePathNotLike(String value) {
            addCriterion("BUSINESS_LICENSE_FILE_PATH not like", value, "businessLicenseFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFilePathIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE_FILE_PATH in", values, "businessLicenseFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFilePathNotIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE_FILE_PATH not in", values, "businessLicenseFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFilePathBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE_FILE_PATH between", value1, value2, "businessLicenseFilePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseFilePathNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE_FILE_PATH not between", value1, value2, "businessLicenseFilePath");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailIsNull() {
            addCriterion("ENTERPRISE_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailIsNotNull() {
            addCriterion("ENTERPRISE_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailEqualTo(String value) {
            addCriterion("ENTERPRISE_EMAIL =", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailNotEqualTo(String value) {
            addCriterion("ENTERPRISE_EMAIL <>", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailGreaterThan(String value) {
            addCriterion("ENTERPRISE_EMAIL >", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERPRISE_EMAIL >=", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailLessThan(String value) {
            addCriterion("ENTERPRISE_EMAIL <", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailLessThanOrEqualTo(String value) {
            addCriterion("ENTERPRISE_EMAIL <=", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailLike(String value) {
            addCriterion("ENTERPRISE_EMAIL like", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailNotLike(String value) {
            addCriterion("ENTERPRISE_EMAIL not like", value, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailIn(List<String> values) {
            addCriterion("ENTERPRISE_EMAIL in", values, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailNotIn(List<String> values) {
            addCriterion("ENTERPRISE_EMAIL not in", values, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailBetween(String value1, String value2) {
            addCriterion("ENTERPRISE_EMAIL between", value1, value2, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andEnterpriseEmailNotBetween(String value1, String value2) {
            addCriterion("ENTERPRISE_EMAIL not between", value1, value2, "enterpriseEmail");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("TELEPHONE =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("TELEPHONE <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("TELEPHONE >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("TELEPHONE >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("TELEPHONE <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("TELEPHONE <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("TELEPHONE like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("TELEPHONE not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("TELEPHONE in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("TELEPHONE not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("TELEPHONE between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("TELEPHONE not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("LINKMAN is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("LINKMAN is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("LINKMAN =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("LINKMAN <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("LINKMAN >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("LINKMAN <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("LINKMAN like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("LINKMAN not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("LINKMAN in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("LINKMAN not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("LINKMAN between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("LINKMAN not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andLogoFileNameIsNull() {
            addCriterion("LOGO_FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLogoFileNameIsNotNull() {
            addCriterion("LOGO_FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLogoFileNameEqualTo(String value) {
            addCriterion("LOGO_FILE_NAME =", value, "logoFileName");
            return (Criteria) this;
        }

        public Criteria andLogoFileNameNotEqualTo(String value) {
            addCriterion("LOGO_FILE_NAME <>", value, "logoFileName");
            return (Criteria) this;
        }

        public Criteria andLogoFileNameGreaterThan(String value) {
            addCriterion("LOGO_FILE_NAME >", value, "logoFileName");
            return (Criteria) this;
        }

        public Criteria andLogoFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGO_FILE_NAME >=", value, "logoFileName");
            return (Criteria) this;
        }

        public Criteria andLogoFileNameLessThan(String value) {
            addCriterion("LOGO_FILE_NAME <", value, "logoFileName");
            return (Criteria) this;
        }

        public Criteria andLogoFileNameLessThanOrEqualTo(String value) {
            addCriterion("LOGO_FILE_NAME <=", value, "logoFileName");
            return (Criteria) this;
        }

        public Criteria andLogoFileNameLike(String value) {
            addCriterion("LOGO_FILE_NAME like", value, "logoFileName");
            return (Criteria) this;
        }

        public Criteria andLogoFileNameNotLike(String value) {
            addCriterion("LOGO_FILE_NAME not like", value, "logoFileName");
            return (Criteria) this;
        }

        public Criteria andLogoFileNameIn(List<String> values) {
            addCriterion("LOGO_FILE_NAME in", values, "logoFileName");
            return (Criteria) this;
        }

        public Criteria andLogoFileNameNotIn(List<String> values) {
            addCriterion("LOGO_FILE_NAME not in", values, "logoFileName");
            return (Criteria) this;
        }

        public Criteria andLogoFileNameBetween(String value1, String value2) {
            addCriterion("LOGO_FILE_NAME between", value1, value2, "logoFileName");
            return (Criteria) this;
        }

        public Criteria andLogoFileNameNotBetween(String value1, String value2) {
            addCriterion("LOGO_FILE_NAME not between", value1, value2, "logoFileName");
            return (Criteria) this;
        }

        public Criteria andLogoFilePathIsNull() {
            addCriterion("LOGO_FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andLogoFilePathIsNotNull() {
            addCriterion("LOGO_FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andLogoFilePathEqualTo(String value) {
            addCriterion("LOGO_FILE_PATH =", value, "logoFilePath");
            return (Criteria) this;
        }

        public Criteria andLogoFilePathNotEqualTo(String value) {
            addCriterion("LOGO_FILE_PATH <>", value, "logoFilePath");
            return (Criteria) this;
        }

        public Criteria andLogoFilePathGreaterThan(String value) {
            addCriterion("LOGO_FILE_PATH >", value, "logoFilePath");
            return (Criteria) this;
        }

        public Criteria andLogoFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("LOGO_FILE_PATH >=", value, "logoFilePath");
            return (Criteria) this;
        }

        public Criteria andLogoFilePathLessThan(String value) {
            addCriterion("LOGO_FILE_PATH <", value, "logoFilePath");
            return (Criteria) this;
        }

        public Criteria andLogoFilePathLessThanOrEqualTo(String value) {
            addCriterion("LOGO_FILE_PATH <=", value, "logoFilePath");
            return (Criteria) this;
        }

        public Criteria andLogoFilePathLike(String value) {
            addCriterion("LOGO_FILE_PATH like", value, "logoFilePath");
            return (Criteria) this;
        }

        public Criteria andLogoFilePathNotLike(String value) {
            addCriterion("LOGO_FILE_PATH not like", value, "logoFilePath");
            return (Criteria) this;
        }

        public Criteria andLogoFilePathIn(List<String> values) {
            addCriterion("LOGO_FILE_PATH in", values, "logoFilePath");
            return (Criteria) this;
        }

        public Criteria andLogoFilePathNotIn(List<String> values) {
            addCriterion("LOGO_FILE_PATH not in", values, "logoFilePath");
            return (Criteria) this;
        }

        public Criteria andLogoFilePathBetween(String value1, String value2) {
            addCriterion("LOGO_FILE_PATH between", value1, value2, "logoFilePath");
            return (Criteria) this;
        }

        public Criteria andLogoFilePathNotBetween(String value1, String value2) {
            addCriterion("LOGO_FILE_PATH not between", value1, value2, "logoFilePath");
            return (Criteria) this;
        }

        public Criteria andProposerIdIsNull() {
            addCriterion("PROPOSER_ID is null");
            return (Criteria) this;
        }

        public Criteria andProposerIdIsNotNull() {
            addCriterion("PROPOSER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProposerIdEqualTo(String value) {
            addCriterion("PROPOSER_ID =", value, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdNotEqualTo(String value) {
            addCriterion("PROPOSER_ID <>", value, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdGreaterThan(String value) {
            addCriterion("PROPOSER_ID >", value, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROPOSER_ID >=", value, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdLessThan(String value) {
            addCriterion("PROPOSER_ID <", value, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdLessThanOrEqualTo(String value) {
            addCriterion("PROPOSER_ID <=", value, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdLike(String value) {
            addCriterion("PROPOSER_ID like", value, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdNotLike(String value) {
            addCriterion("PROPOSER_ID not like", value, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdIn(List<String> values) {
            addCriterion("PROPOSER_ID in", values, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdNotIn(List<String> values) {
            addCriterion("PROPOSER_ID not in", values, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdBetween(String value1, String value2) {
            addCriterion("PROPOSER_ID between", value1, value2, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerIdNotBetween(String value1, String value2) {
            addCriterion("PROPOSER_ID not between", value1, value2, "proposerId");
            return (Criteria) this;
        }

        public Criteria andProposerNameIsNull() {
            addCriterion("PROPOSER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProposerNameIsNotNull() {
            addCriterion("PROPOSER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProposerNameEqualTo(String value) {
            addCriterion("PROPOSER_NAME =", value, "proposerName");
            return (Criteria) this;
        }

        public Criteria andProposerNameNotEqualTo(String value) {
            addCriterion("PROPOSER_NAME <>", value, "proposerName");
            return (Criteria) this;
        }

        public Criteria andProposerNameGreaterThan(String value) {
            addCriterion("PROPOSER_NAME >", value, "proposerName");
            return (Criteria) this;
        }

        public Criteria andProposerNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROPOSER_NAME >=", value, "proposerName");
            return (Criteria) this;
        }

        public Criteria andProposerNameLessThan(String value) {
            addCriterion("PROPOSER_NAME <", value, "proposerName");
            return (Criteria) this;
        }

        public Criteria andProposerNameLessThanOrEqualTo(String value) {
            addCriterion("PROPOSER_NAME <=", value, "proposerName");
            return (Criteria) this;
        }

        public Criteria andProposerNameLike(String value) {
            addCriterion("PROPOSER_NAME like", value, "proposerName");
            return (Criteria) this;
        }

        public Criteria andProposerNameNotLike(String value) {
            addCriterion("PROPOSER_NAME not like", value, "proposerName");
            return (Criteria) this;
        }

        public Criteria andProposerNameIn(List<String> values) {
            addCriterion("PROPOSER_NAME in", values, "proposerName");
            return (Criteria) this;
        }

        public Criteria andProposerNameNotIn(List<String> values) {
            addCriterion("PROPOSER_NAME not in", values, "proposerName");
            return (Criteria) this;
        }

        public Criteria andProposerNameBetween(String value1, String value2) {
            addCriterion("PROPOSER_NAME between", value1, value2, "proposerName");
            return (Criteria) this;
        }

        public Criteria andProposerNameNotBetween(String value1, String value2) {
            addCriterion("PROPOSER_NAME not between", value1, value2, "proposerName");
            return (Criteria) this;
        }

        public Criteria andUsingStateIsNull() {
            addCriterion("USING_STATE is null");
            return (Criteria) this;
        }

        public Criteria andUsingStateIsNotNull() {
            addCriterion("USING_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andUsingStateEqualTo(Integer value) {
            addCriterion("USING_STATE =", value, "usingState");
            return (Criteria) this;
        }

        public Criteria andUsingStateNotEqualTo(Integer value) {
            addCriterion("USING_STATE <>", value, "usingState");
            return (Criteria) this;
        }

        public Criteria andUsingStateGreaterThan(Integer value) {
            addCriterion("USING_STATE >", value, "usingState");
            return (Criteria) this;
        }

        public Criteria andUsingStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("USING_STATE >=", value, "usingState");
            return (Criteria) this;
        }

        public Criteria andUsingStateLessThan(Integer value) {
            addCriterion("USING_STATE <", value, "usingState");
            return (Criteria) this;
        }

        public Criteria andUsingStateLessThanOrEqualTo(Integer value) {
            addCriterion("USING_STATE <=", value, "usingState");
            return (Criteria) this;
        }

        public Criteria andUsingStateIn(List<Integer> values) {
            addCriterion("USING_STATE in", values, "usingState");
            return (Criteria) this;
        }

        public Criteria andUsingStateNotIn(List<Integer> values) {
            addCriterion("USING_STATE not in", values, "usingState");
            return (Criteria) this;
        }

        public Criteria andUsingStateBetween(Integer value1, Integer value2) {
            addCriterion("USING_STATE between", value1, value2, "usingState");
            return (Criteria) this;
        }

        public Criteria andUsingStateNotBetween(Integer value1, Integer value2) {
            addCriterion("USING_STATE not between", value1, value2, "usingState");
            return (Criteria) this;
        }

        public Criteria andApproveStateIsNull() {
            addCriterion("APPROVE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andApproveStateIsNotNull() {
            addCriterion("APPROVE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andApproveStateEqualTo(Integer value) {
            addCriterion("APPROVE_STATE =", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateNotEqualTo(Integer value) {
            addCriterion("APPROVE_STATE <>", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateGreaterThan(Integer value) {
            addCriterion("APPROVE_STATE >", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("APPROVE_STATE >=", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateLessThan(Integer value) {
            addCriterion("APPROVE_STATE <", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateLessThanOrEqualTo(Integer value) {
            addCriterion("APPROVE_STATE <=", value, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateIn(List<Integer> values) {
            addCriterion("APPROVE_STATE in", values, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateNotIn(List<Integer> values) {
            addCriterion("APPROVE_STATE not in", values, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateBetween(Integer value1, Integer value2) {
            addCriterion("APPROVE_STATE between", value1, value2, "approveState");
            return (Criteria) this;
        }

        public Criteria andApproveStateNotBetween(Integer value1, Integer value2) {
            addCriterion("APPROVE_STATE not between", value1, value2, "approveState");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("IS_DELETE =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("IS_DELETE <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("IS_DELETE >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_DELETE >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("IS_DELETE <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("IS_DELETE <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("IS_DELETE in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("IS_DELETE not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("IS_DELETE between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_DELETE not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Timestamp value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Timestamp value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Timestamp> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Timestamp> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Timestamp value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Timestamp value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Timestamp value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Timestamp value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Timestamp> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Timestamp> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCnCityIsNull() {
            addCriterion("CN_CITY is null");
            return (Criteria) this;
        }

        public Criteria andCnCityIsNotNull() {
            addCriterion("CN_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCnCityEqualTo(String value) {
            addCriterion("CN_CITY =", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotEqualTo(String value) {
            addCriterion("CN_CITY <>", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityGreaterThan(String value) {
            addCriterion("CN_CITY >", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityGreaterThanOrEqualTo(String value) {
            addCriterion("CN_CITY >=", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityLessThan(String value) {
            addCriterion("CN_CITY <", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityLessThanOrEqualTo(String value) {
            addCriterion("CN_CITY <=", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityLike(String value) {
            addCriterion("CN_CITY like", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotLike(String value) {
            addCriterion("CN_CITY not like", value, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityIn(List<String> values) {
            addCriterion("CN_CITY in", values, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotIn(List<String> values) {
            addCriterion("CN_CITY not in", values, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityBetween(String value1, String value2) {
            addCriterion("CN_CITY between", value1, value2, "cnCity");
            return (Criteria) this;
        }

        public Criteria andCnCityNotBetween(String value1, String value2) {
            addCriterion("CN_CITY not between", value1, value2, "cnCity");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("PROVINCE like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("PROVINCE not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("COUNTRY =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("COUNTRY <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("COUNTRY >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("COUNTRY <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("COUNTRY like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("COUNTRY not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("COUNTRY in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("COUNTRY not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("COUNTRY between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("COUNTRY not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIsNull() {
            addCriterion("TIME_ZONE is null");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIsNotNull() {
            addCriterion("TIME_ZONE is not null");
            return (Criteria) this;
        }

        public Criteria andTimeZoneEqualTo(String value) {
            addCriterion("TIME_ZONE =", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotEqualTo(String value) {
            addCriterion("TIME_ZONE <>", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneGreaterThan(String value) {
            addCriterion("TIME_ZONE >", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_ZONE >=", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneLessThan(String value) {
            addCriterion("TIME_ZONE <", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneLessThanOrEqualTo(String value) {
            addCriterion("TIME_ZONE <=", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneLike(String value) {
            addCriterion("TIME_ZONE like", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotLike(String value) {
            addCriterion("TIME_ZONE not like", value, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneIn(List<String> values) {
            addCriterion("TIME_ZONE in", values, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotIn(List<String> values) {
            addCriterion("TIME_ZONE not in", values, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneBetween(String value1, String value2) {
            addCriterion("TIME_ZONE between", value1, value2, "timeZone");
            return (Criteria) this;
        }

        public Criteria andTimeZoneNotBetween(String value1, String value2) {
            addCriterion("TIME_ZONE not between", value1, value2, "timeZone");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Timestamp value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Timestamp value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Timestamp value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Timestamp value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Timestamp> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Timestamp> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andIsInitalDataIsNull() {
            addCriterion("IS_INITAL_DATA is null");
            return (Criteria) this;
        }

        public Criteria andIsInitalDataIsNotNull() {
            addCriterion("IS_INITAL_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andIsInitalDataEqualTo(Integer value) {
            addCriterion("IS_INITAL_DATA =", value, "isInitalData");
            return (Criteria) this;
        }

        public Criteria andIsInitalDataNotEqualTo(Integer value) {
            addCriterion("IS_INITAL_DATA <>", value, "isInitalData");
            return (Criteria) this;
        }

        public Criteria andIsInitalDataGreaterThan(Integer value) {
            addCriterion("IS_INITAL_DATA >", value, "isInitalData");
            return (Criteria) this;
        }

        public Criteria andIsInitalDataGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_INITAL_DATA >=", value, "isInitalData");
            return (Criteria) this;
        }

        public Criteria andIsInitalDataLessThan(Integer value) {
            addCriterion("IS_INITAL_DATA <", value, "isInitalData");
            return (Criteria) this;
        }

        public Criteria andIsInitalDataLessThanOrEqualTo(Integer value) {
            addCriterion("IS_INITAL_DATA <=", value, "isInitalData");
            return (Criteria) this;
        }

        public Criteria andIsInitalDataIn(List<Integer> values) {
            addCriterion("IS_INITAL_DATA in", values, "isInitalData");
            return (Criteria) this;
        }

        public Criteria andIsInitalDataNotIn(List<Integer> values) {
            addCriterion("IS_INITAL_DATA not in", values, "isInitalData");
            return (Criteria) this;
        }

        public Criteria andIsInitalDataBetween(Integer value1, Integer value2) {
            addCriterion("IS_INITAL_DATA between", value1, value2, "isInitalData");
            return (Criteria) this;
        }

        public Criteria andIsInitalDataNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_INITAL_DATA not between", value1, value2, "isInitalData");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(String value) {
            addCriterion("FILE_ID =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(String value) {
            addCriterion("FILE_ID <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(String value) {
            addCriterion("FILE_ID >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_ID >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(String value) {
            addCriterion("FILE_ID <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(String value) {
            addCriterion("FILE_ID <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLike(String value) {
            addCriterion("FILE_ID like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotLike(String value) {
            addCriterion("FILE_ID not like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<String> values) {
            addCriterion("FILE_ID in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<String> values) {
            addCriterion("FILE_ID not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(String value1, String value2) {
            addCriterion("FILE_ID between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(String value1, String value2) {
            addCriterion("FILE_ID not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andCorporateDiscountIsNull() {
            addCriterion("CORPORATE_DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCorporateDiscountIsNotNull() {
            addCriterion("CORPORATE_DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCorporateDiscountEqualTo(Integer value) {
            addCriterion("CORPORATE_DISCOUNT =", value, "corporateDiscount");
            return (Criteria) this;
        }

        public Criteria andCorporateDiscountNotEqualTo(Integer value) {
            addCriterion("CORPORATE_DISCOUNT <>", value, "corporateDiscount");
            return (Criteria) this;
        }

        public Criteria andCorporateDiscountGreaterThan(Integer value) {
            addCriterion("CORPORATE_DISCOUNT >", value, "corporateDiscount");
            return (Criteria) this;
        }

        public Criteria andCorporateDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("CORPORATE_DISCOUNT >=", value, "corporateDiscount");
            return (Criteria) this;
        }

        public Criteria andCorporateDiscountLessThan(Integer value) {
            addCriterion("CORPORATE_DISCOUNT <", value, "corporateDiscount");
            return (Criteria) this;
        }

        public Criteria andCorporateDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("CORPORATE_DISCOUNT <=", value, "corporateDiscount");
            return (Criteria) this;
        }

        public Criteria andCorporateDiscountIn(List<Integer> values) {
            addCriterion("CORPORATE_DISCOUNT in", values, "corporateDiscount");
            return (Criteria) this;
        }

        public Criteria andCorporateDiscountNotIn(List<Integer> values) {
            addCriterion("CORPORATE_DISCOUNT not in", values, "corporateDiscount");
            return (Criteria) this;
        }

        public Criteria andCorporateDiscountBetween(Integer value1, Integer value2) {
            addCriterion("CORPORATE_DISCOUNT between", value1, value2, "corporateDiscount");
            return (Criteria) this;
        }

        public Criteria andCorporateDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("CORPORATE_DISCOUNT not between", value1, value2, "corporateDiscount");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleIsNull() {
            addCriterion("SETTLEMENT_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleIsNotNull() {
            addCriterion("SETTLEMENT_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleEqualTo(String value) {
            addCriterion("SETTLEMENT_CYCLE =", value, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleNotEqualTo(String value) {
            addCriterion("SETTLEMENT_CYCLE <>", value, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleGreaterThan(String value) {
            addCriterion("SETTLEMENT_CYCLE >", value, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_CYCLE >=", value, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleLessThan(String value) {
            addCriterion("SETTLEMENT_CYCLE <", value, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_CYCLE <=", value, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleLike(String value) {
            addCriterion("SETTLEMENT_CYCLE like", value, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleNotLike(String value) {
            addCriterion("SETTLEMENT_CYCLE not like", value, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleIn(List<String> values) {
            addCriterion("SETTLEMENT_CYCLE in", values, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleNotIn(List<String> values) {
            addCriterion("SETTLEMENT_CYCLE not in", values, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_CYCLE between", value1, value2, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andSettlementCycleNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_CYCLE not between", value1, value2, "settlementCycle");
            return (Criteria) this;
        }

        public Criteria andStatementDateIsNull() {
            addCriterion("STATEMENT_Date is null");
            return (Criteria) this;
        }

        public Criteria andStatementDateIsNotNull() {
            addCriterion("STATEMENT_Date is not null");
            return (Criteria) this;
        }

        public Criteria andStatementDateEqualTo(Timestamp value) {
            addCriterion("STATEMENT_Date =", value, "statementDate");
            return (Criteria) this;
        }

        public Criteria andStatementDateNotEqualTo(Timestamp value) {
            addCriterion("STATEMENT_Date <>", value, "statementDate");
            return (Criteria) this;
        }

        public Criteria andStatementDateGreaterThan(Timestamp value) {
            addCriterion("STATEMENT_Date >", value, "statementDate");
            return (Criteria) this;
        }

        public Criteria andStatementDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("STATEMENT_Date >=", value, "statementDate");
            return (Criteria) this;
        }

        public Criteria andStatementDateLessThan(Timestamp value) {
            addCriterion("STATEMENT_Date <", value, "statementDate");
            return (Criteria) this;
        }

        public Criteria andStatementDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("STATEMENT_Date <=", value, "statementDate");
            return (Criteria) this;
        }

        public Criteria andStatementDateIn(List<Timestamp> values) {
            addCriterion("STATEMENT_Date in", values, "statementDate");
            return (Criteria) this;
        }

        public Criteria andStatementDateNotIn(List<Timestamp> values) {
            addCriterion("STATEMENT_Date not in", values, "statementDate");
            return (Criteria) this;
        }

        public Criteria andStatementDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("STATEMENT_Date between", value1, value2, "statementDate");
            return (Criteria) this;
        }

        public Criteria andStatementDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("STATEMENT_Date not between", value1, value2, "statementDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}