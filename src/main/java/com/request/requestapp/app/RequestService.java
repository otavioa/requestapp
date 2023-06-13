package com.request.requestapp.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class RequestService {

	private static List<Request> requestsDB = new ArrayList<>();
	
	public boolean addRequest(Request r) {
		return requestsDB.add(r);
	}
	
	public List<Request> getRequests() {
		return new ArrayList<>(requestsDB);
	}

	public Object addAndReturn(Request r) {
		addRequest(r);
		return getRequests();
	}
}
