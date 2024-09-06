package com.test1;

public class OneMfaSessionHandlers {
	private String primaryId;
	private String oneMfaSessionId;
	private String handlerName;
	private String multiFactorHandler;
	private String multiFactorFailureHandler;
	private Integer oneMfaSessionInvalidationStrategy;
	private String customAuthenticator;
	private Integer authManager;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public OneMfaSessionHandlers() {

	}

	public OneMfaSessionHandlers(String primaryId, String oneMfaSessionId, String handlerName,
			String multiFactorHandler, String multiFactorFailureHandler, Integer oneMfaSessionInvalidationStrategy,
			String customAuthenticator, Integer authManager, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.primaryId = primaryId;
		this.oneMfaSessionId = oneMfaSessionId;
		this.handlerName = handlerName;
		this.multiFactorHandler = multiFactorHandler;
		this.multiFactorFailureHandler = multiFactorFailureHandler;
		this.oneMfaSessionInvalidationStrategy = oneMfaSessionInvalidationStrategy;
		this.customAuthenticator = customAuthenticator;
		this.authManager = authManager;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getPrimaryId() {
		return primaryId;
	}

	public void setPrimaryId(String primaryId) {
		this.primaryId = primaryId;
	}

	public String getOneMfaSessionId() {
		return oneMfaSessionId;
	}

	public void setOneMfaSessionId(String oneMfaSessionId) {
		this.oneMfaSessionId = oneMfaSessionId;
	}

	public String getHandlerName() {
		return handlerName;
	}

	public void setHandlerName(String handlerName) {
		this.handlerName = handlerName;
	}

	public String getMultiFactorHandler() {
		return multiFactorHandler;
	}

	public void setMultiFactorHandler(String multiFactorHandler) {
		this.multiFactorHandler = multiFactorHandler;
	}

	public String getMultiFactorFailureHandler() {
		return multiFactorFailureHandler;
	}

	public void setMultiFactorFailureHandler(String multiFactorFailureHandler) {
		this.multiFactorFailureHandler = multiFactorFailureHandler;
	}

	public Integer getOneMfaSessionInvalidationStrategy() {
		return oneMfaSessionInvalidationStrategy;
	}

	public void setOneMfaSessionInvalidationStrategy(Integer oneMfaSessionInvalidationStrategy) {
		this.oneMfaSessionInvalidationStrategy = oneMfaSessionInvalidationStrategy;
	}

	public String getCustomAuthenticator() {
		return customAuthenticator;
	}

	public void setCustomAuthenticator(String customAuthenticator) {
		this.customAuthenticator = customAuthenticator;
	}

	public Integer getAuthManager() {
		return authManager;
	}

	public void setAuthManager(Integer authManager) {
		this.authManager = authManager;
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
