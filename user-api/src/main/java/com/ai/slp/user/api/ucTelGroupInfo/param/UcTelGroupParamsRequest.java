package com.ai.slp.user.api.ucTelGroupInfo.param;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.ai.slp.user.api.ucTelGroupInfo.interfaces.IUcTelGroupSV;




public class UcTelGroupParamsRequest {
	/**
	 * 租户ID
	 */
	@NotNull(message="租户ID不能为空",groups={IUcTelGroupSV.InsertUcTelGroupInfo.class,IUcTelGroupSV.UpdateGroupInfo.class})
    @Size(max=32,groups={IUcTelGroupSV.InsertUcTelGroupInfo.class,IUcTelGroupSV.UpdateGroupInfo.class})
	private String tenantId;
	
	/**
	 * 用户ID
	 */
	@NotNull(message="用户ID不能为空",groups={IUcTelGroupSV.InsertUcTelGroupInfo.class,IUcTelGroupSV.UpdateGroupInfo.class})
    @Size(max=18,groups={IUcTelGroupSV.InsertUcTelGroupInfo.class,IUcTelGroupSV.UpdateGroupInfo.class})
	private Long userId;
	
	/**
	 * 通讯录组ID
	 */
	@NotNull(message="通讯录组ID不能为空",groups={IUcTelGroupSV.InsertUcTelGroupInfo.class,IUcTelGroupSV.UpdateGroupInfo.class})
    @Size(max=32,groups={IUcTelGroupSV.InsertUcTelGroupInfo.class,IUcTelGroupSV.UpdateGroupInfo.class})
	private String telGroupId;
	
	/**
	 * 序号
	 */
    @Size(max=10,groups={IUcTelGroupSV.InsertUcTelGroupInfo.class,IUcTelGroupSV.UpdateGroupInfo.class})
	private long seq;
	
    /**
     * 通讯录名称
     */
    @NotNull(message="通讯录组NAME不能为空",groups={IUcTelGroupSV.InsertUcTelGroupInfo.class,IUcTelGroupSV.UpdateGroupInfo.class})
    @Size(max=128,groups={IUcTelGroupSV.InsertUcTelGroupInfo.class,IUcTelGroupSV.UpdateGroupInfo.class})
	private String telGroupName;
    
    /**
     * 创建时间
     */
    private Date createTime;
    
    /**
     * 创建渠道
     */
    @Size(max=7,groups={IUcTelGroupSV.InsertUcTelGroupInfo.class,IUcTelGroupSV.UpdateGroupInfo.class})
    private String createChlId;
    
    /**
     * 创建员工
     */
    @Size(max=10,groups={IUcTelGroupSV.InsertUcTelGroupInfo.class,IUcTelGroupSV.UpdateGroupInfo.class})
    private long createOperId;
    
    /**
     * 修改时间
     */
    private Date updateTime;
    
    /**
     * 创建渠道
     */
    @Size(max=7,groups={IUcTelGroupSV.InsertUcTelGroupInfo.class,IUcTelGroupSV.UpdateGroupInfo.class})
    private String updateChlId;
    
    /**
     * 创建员工
     */
    @Size(max=10,groups={IUcTelGroupSV.InsertUcTelGroupInfo.class,IUcTelGroupSV.UpdateGroupInfo.class})
    private long updateOperId;

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getTelGroupId() {
		return telGroupId;
	}

	public void setTelGroupId(String telGroupId) {
		this.telGroupId = telGroupId;
	}

	public long getSeq() {
		return seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}

	public String getTelGroupName() {
		return telGroupName;
	}

	public void setTelGroupName(String telGroupName) {
		this.telGroupName = telGroupName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateChlId() {
		return createChlId;
	}

	public void setCreateChlId(String createChlId) {
		this.createChlId = createChlId;
	}

	public long getCreateOperId() {
		return createOperId;
	}

	public void setCreateOperId(long createOperId) {
		this.createOperId = createOperId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateChlId() {
		return updateChlId;
	}

	public void setUpdateChlId(String updateChlId) {
		this.updateChlId = updateChlId;
	}

	public long getUpdateOperId() {
		return updateOperId;
	}

	public void setUpdateOperId(long updateOperId) {
		this.updateOperId = updateOperId;
	}
}