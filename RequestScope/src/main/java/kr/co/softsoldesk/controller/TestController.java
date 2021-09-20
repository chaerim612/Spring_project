package kr.co.softsoldesk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		request.setAttribute("data1", "화요일");
		return "redirect:/result1";
	}
	
	@GetMapping("/result1")
	public String result1(HttpServletRequest request) {
		request.getAttribute("data1");
		return "result1";
	}
}
