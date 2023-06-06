package com.request.requestapp.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping
public class RequestController {
	
	@Autowired
	private RequestService requestService;

	@GetMapping("/requests")
	public String logRequest(Model model, HttpServletRequest request) {
		
		Request r = prepareRequestFrom(request);
		model.addAttribute("requests", requestService.addAndReturn(r));
		
		return "requests/list";
	}

	private Request prepareRequestFrom(HttpServletRequest request) {
		String so = request.getHeader("sec-ch-ua-platform");
		String ip = request.getHeader("X-Forwarded-For");
		String agent = request.getHeader("User-Agent");
		
		return new Request(so, ip, agent);
	}

}
