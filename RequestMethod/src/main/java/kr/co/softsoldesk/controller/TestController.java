package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(value="/test1", method=RequestMethod.GET)
	public String test1() {
		return "test1";
	}
	
	@RequestMapping(value="/test2", method=RequestMethod.POST)
	public String test2() {
		return "test2";
	}
	
	//============================================================
	
	@RequestMapping(value="/test3_get", method=RequestMethod.GET)
	public String test3_get() {
		return "test3_get";
	}
	
	@RequestMapping(value="/test3_post", method=RequestMethod.POST)
	public String test3_post() {
		return "test3_post";
	}
	
	//============================================================
	
	@GetMapping("/test4")
	public String test4() {
		return "test4";
	}

	@PostMapping("/test5")
	public String test5() {
		return "test5";
	}
	
	//============================================================
	
	@GetMapping("/test6")
	public String test6_get() {
		return "test6_get";
	}

	@PostMapping("/test6")
	public String test6_post() {
		return "test6_post";
	}
	
	//============================================================
	
	@RequestMapping(value="/test7",method= {RequestMethod.GET, RequestMethod.POST})
	public String test7() {
		return "test7";
	}
	
}
