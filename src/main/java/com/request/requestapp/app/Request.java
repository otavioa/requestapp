package com.request.requestapp.app;

public class Request {

	private String ip;
	private String agent;
	private String so;
	
	public Request(String so, String ip, String agent) {
		this.so = so;
		this.ip = ip;
		this.agent = agent;
	}
	
	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	
}
