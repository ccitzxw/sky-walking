package com.ai.cloud.vo.svo;

import java.sql.Timestamp;

public class AlarmRuleSVO {
	
	private String ruleId;
	
	private String appId;
	
	private String uid;
	
	private String isGlobal;
	
	private String todoType;
	
	private String configArgs;
	
	private Timestamp createTime;
	
	private String sts;
	
	private Timestamp modifyTime;

	public String getRuleId() {
		return ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getConfigArgs() {
		return configArgs;
	}

	public void setConfigArgs(String configArgs) {
		this.configArgs = configArgs;
	}

	public String getIsGlobal() {
		return isGlobal;
	}

	public void setIsGlobal(String isGlobal) {
		this.isGlobal = isGlobal;
	}

	public String getTodoType() {
		return todoType;
	}

	public void setTodoType(String todoType) {
		this.todoType = todoType;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getSts() {
		return sts;
	}

	public void setSts(String sts) {
		this.sts = sts;
	}

	public Timestamp getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	@Override
	public String toString() {
		return "AlarmRuleSVO [ruleId=" + ruleId + ", appId=" + appId + ", uid=" + uid + ", isGlobal=" + isGlobal
				+ ", todoType=" + todoType + ", configArgs=" + configArgs + ", createTime=" + createTime + ", sts="
				+ sts + ", modifyTime=" + modifyTime + "]";
	}

}