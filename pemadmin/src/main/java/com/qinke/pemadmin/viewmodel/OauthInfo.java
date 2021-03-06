package com.qinke.pemadmin.viewmodel;




public class OauthInfo {

	private String client_id;

	private String client_secret;

	private String oauth_accesstoken_rul;

	private String user_resources_rul;

	private String grant_type;

	private String response_type;

	private String redirect_uri;

	private String login_resources_rul;

	private String sys_rul;

	public String getClient_id() {
		return client_id;
	}

	public String getClient_secret() {
		return client_secret;
	}

	public String getOauth_accesstoken_rul() {
		return oauth_accesstoken_rul;
	}

	public String getUser_resources_rul() {
		return user_resources_rul;
	}

	public String getGrant_type() {
		return grant_type;
	}

	public String getResponse_type() {
		return response_type;
	}

	public String getRedirect_uri() {
		return redirect_uri;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}

	public void setOauth_accesstoken_rul(String oauth_accesstoken_rul) {
		this.oauth_accesstoken_rul = oauth_accesstoken_rul;
	}

	public void setUser_resources_rul(String user_resources_rul) {
		this.user_resources_rul = user_resources_rul;
	}

	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}

	public void setResponse_type(String response_type) {
		this.response_type = response_type;
	}

	public void setRedirect_uri(String redirect_uri) {
		this.redirect_uri = redirect_uri;
	}

	public String getLogin_resources_rul() {
		return login_resources_rul;
	}

	public void setLogin_resources_rul(String login_resources_rul) {
		this.login_resources_rul = login_resources_rul;
	}

	public String getSys_rul() {
		return sys_rul;
	}

	public void setSys_rul(String sys_rul) {
		this.sys_rul = sys_rul;
	}
}
