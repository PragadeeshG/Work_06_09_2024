package com.test1;

public class OneMfaSessionControls {
	private Integer sessionControlModel;
	private String requestMatchersToPermit;
	private String requestMatchersToAuthenticate;
	private boolean formLogin;
	private String loginProcessingURL;
	private boolean loginURLPermit;
	private String header;
	private Integer logOutURL;
	private String invalidationMfaSessionOnTimeout;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public OneMfaSessionControls() {

	}

	public OneMfaSessionControls(Integer sessionControlModel, String requestMatchersToPermit,
			String requestMatchersToAuthenticate, boolean formLogin, String loginProcessingURL, boolean loginURLPermit,
			String header, Integer logOutURL, String invalidationMfaSessionOnTimeout, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.sessionControlModel = sessionControlModel;
		this.requestMatchersToPermit = requestMatchersToPermit;
		this.requestMatchersToAuthenticate = requestMatchersToAuthenticate;
		this.formLogin = formLogin;
		this.loginProcessingURL = loginProcessingURL;
		this.loginURLPermit = loginURLPermit;
		this.header = header;
		this.logOutURL = logOutURL;
		this.invalidationMfaSessionOnTimeout = invalidationMfaSessionOnTimeout;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getSessionControlModel() {
		return sessionControlModel;
	}

	public void setSessionControlModel(Integer sessionControlModel) {
		this.sessionControlModel = sessionControlModel;
	}

	public String getRequestMatchersToPermit() {
		return requestMatchersToPermit;
	}

	public void setRequestMatchersToPermit(String requestMatchersToPermit) {
		this.requestMatchersToPermit = requestMatchersToPermit;
	}

	public String getRequestMatchersToAuthenticate() {
		return requestMatchersToAuthenticate;
	}

	public void setRequestMatchersToAuthenticate(String requestMatchersToAuthenticate) {
		this.requestMatchersToAuthenticate = requestMatchersToAuthenticate;
	}

	public boolean isFormLogin() {
		return formLogin;
	}

	public void setFormLogin(boolean formLogin) {
		this.formLogin = formLogin;
	}

	public String getLoginProcessingURL() {
		return loginProcessingURL;
	}

	public void setLoginProcessingURL(String loginProcessingURL) {
		this.loginProcessingURL = loginProcessingURL;
	}

	public boolean isLoginURLPermit() {
		return loginURLPermit;
	}

	public void setLoginURLPermit(boolean loginURLPermit) {
		this.loginURLPermit = loginURLPermit;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public Integer getLogOutURL() {
		return logOutURL;
	}

	public void setLogOutURL(Integer logOutURL) {
		this.logOutURL = logOutURL;
	}

	public String getInvalidationMfaSessionOnTimeout() {
		return invalidationMfaSessionOnTimeout;
	}

	public void setInvalidationMfaSessionOnTimeout(String invalidationMfaSessionOnTimeout) {
		this.invalidationMfaSessionOnTimeout = invalidationMfaSessionOnTimeout;
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