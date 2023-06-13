package com.request.requestapp.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {

	private String ip;
	private String agent;
	private String requestId;
	
}
