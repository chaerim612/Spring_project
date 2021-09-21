package kr.co.softsoldesk.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.softsoldesk.bean.DataBean;
import kr.co.softsoldesk.bean.DataBean2;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		//data 담기
		//HttpServletRequest : setAttribute 등록하고 getAttribute로 전달
		request.setAttribute("data1", 100);
		request.setAttribute("data2", 200);
		
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3(Model model) {
		//Model 객체로 저장하면 HttpServletRequest 영역에 담김
		model.addAttribute("data1", 300);
		model.addAttribute("data2", 400);
		
		return "test3";
	}
	
	@GetMapping("/test4")
	//ModelAndView : Model과 View 이름을 지정하는 기능
	public ModelAndView test3(ModelAndView mv) {
		//ModelAndView 객체로 저장하면 HttpServletRequest 영역에 담김
		mv.addObject("data1",400);
		mv.addObject("data2",500);
		
		mv.setViewName("test4");
		
		return mv;
	}
}
