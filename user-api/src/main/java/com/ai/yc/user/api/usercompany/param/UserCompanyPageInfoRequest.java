package com.ai.yc.user.api.usercompany.param;

import java.sql.Timestamp;


public class UserCompanyPageInfoRequest {
		/**
		 * 企业Id
		 */
	    private String companyId;
	    /**
	     * 用户Id
	     */
	    private String userId;
	    
		/**
		 * 昵称
		 */
		private String nickName;
		/**
		 * 手机
		 */
		private String moblePhone;
		/**
		 * 企业名称
		 */
		private String companyName;
		/**
		 * 审核人
		 */
		private String checkName;
		/**
		 * 申请来源
		 */
		private String applicationSource;
		/**
		 * 创建时间
		 */
		private Timestamp createTime;
		/**
		 * 审核状态
		 */
		private Integer state;
	
	    /**
	     * 当前第几页,必填
	     */
	    private Integer pageNo;

	    /**
	     * 每页数据条数,必填
	     */
	    private Integer pageSize;
		
	    /**
	     * 申请来源
	     */
	    private String userSource;
	    
	    
	    /**
		 * 创建开始时间
		 */
		private String createStartTime;
		
		/**
		 * 创建结束时间
		 */
		private String createEndTime;
	    
		public Integer getPageNo() {
			return pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public String getNickName() {
			return nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public String getMoblePhone() {
			return moblePhone;
		}

		public void setMoblePhone(String moblePhone) {
			this.moblePhone = moblePhone;
		}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getCheckName() {
			return checkName;
		}

		public void setCheckName(String checkName) {
			this.checkName = checkName;
		}

		public String getApplicationSource() {
			return applicationSource;
		}

		public void setApplicationSource(String applicationSource) {
			this.applicationSource = applicationSource;
		}

		public Timestamp getCreateTime() {
			return createTime;
		}

		public void setCreateTime(Timestamp createTime) {
			this.createTime = createTime;
		}

		public Integer getState() {
			return state;
		}

		public void setState(Integer state) {
			this.state = state;
		}

		public String getUserSource() {
			return userSource;
		}

		public void setUserSource(String userSource) {
			this.userSource = userSource;
		}

		public String getCreateStartTime() {
			return createStartTime;
		}

		public void setCreateStartTime(String createStartTime) {
			this.createStartTime = createStartTime;
		}

		public String getCreateEndTime() {
			return createEndTime;
		}

		public void setCreateEndTime(String createEndTime) {
			this.createEndTime = createEndTime;
		}

		public String getCompanyId() {
			return companyId;
		}

		public void setCompanyId(String companyId) {
			this.companyId = companyId;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}
}
