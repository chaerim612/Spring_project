package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.bean.DataBean;

@Controller
public class TestController {

	@PostMapping("/test1")
	/*public String test1(@ModelAttribute DataBean bean) {
	  }*/
	public String test1(DataBean bean) {
	
		System.out.println("data1 : "+bean.getData1());
		System.out.println("data2 : "+bean.getData2());
		
		return "test1";
	}
}
