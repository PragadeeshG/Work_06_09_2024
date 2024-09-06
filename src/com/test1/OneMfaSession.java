package com.test1;

public class OneMfaSession {
	private Integer sessionId;
	private String appName;
	private boolean springOneMfaSession;
	private String oneMfaSessionModel;
	private long oneMfasessionTimeOut;
	private String oneMfaSessionValidation;
	private String cors;
	private String csrf;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public OneMfaSession() {

	}

	public OneMfaSession(Integer sessionId, String appName, boolean springOneMfaSession, String oneMfaSessionModel,
			long oneMfasessionTimeOut, String oneMfaSessionValidation, String cors, String csrf, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.sessionId = sessionId;
		this.appName = appName;
		this.springOneMfaSession = springOneMfaSession;
		this.oneMfaSessionModel = oneMfaSessionModel;
		this.oneMfasessionTimeOut = oneMfasessionTimeOut;
		this.oneMfaSessionValidation = oneMfaSessionValidation;
		this.cors = cors;
		this.csrf = csrf;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getSessionId() {
		return sessionId;
	}

	public void setSessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public boolean isSpringOneMfaSession() {
		return springOneMfaSession;
	}

	public void setSpringOneMfaSession(boolean springOneMfaSession) {
		this.springOneMfaSession = springOneMfaSession;
	}

	public String getOneMfaSessionModel() {
		return oneMfaSessionModel;
	}

	public void setOneMfaSessionModel(String oneMfaSessionModel) {
		this.oneMfaSessionModel = oneMfaSessionModel;
	}

	public long getOneMfasessionTimeOut() {
		return oneMfasessionTimeOut;
	}

	public void setOneMfasessionTimeOut(long oneMfasessionTimeOut) {
		this.oneMfasessionTimeOut = oneMfasessionTimeOut;
	}

	public String getOneMfaSessionValidation() {
		return oneMfaSessionValidation;
	}

	public void setOneMfaSessionValidation(String oneMfaSessionValidation) {
		this.oneMfaSessionValidation = oneMfaSessionValidation;
	}

	public String getCors() {
		return cors;
	}

	public void setCors(String cors) {
		this.cors = cors;
	}

	public String getCsrf() {
		return csrf;
	}

	public void setCsrf(String csrf) {
		this.csrf = csrf;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
