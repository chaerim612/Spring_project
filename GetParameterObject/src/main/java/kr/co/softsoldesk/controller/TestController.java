package kr.co.softsoldesk.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.softsoldesk.bean.DataBean;
import kr.co.softsoldesk.bean.DataBean2;
/*
@Controller
public class TestController {
	//동일한 이름의 key값 즉 data3가 주입될 경우 맨처음값 하나만 주입됨
	@GetMapping("/test1")
	public String test1(@RequestParam Map<String, String> map) {
		
		String data1=map.get("data1");
		String data2=map.get("data2");
		String data3=map.get("data3");
		
		System.out.println("data1 : "+ data1);
		System.out.println("data2 : "+ data2);
		System.out.println("data3 : "+ data3);
		
		return "result";
		
	}*/
	
	@Controller
	public class TestController {
		//동일한 이름의 key값 주입시 @RequestParam List<String> data3으로 사용
		@GetMapping("/test1")
		public String test1(@RequestParam Map<String, String> map, @RequestParam List<String> data3) {
			
			String data1=map.get("data1");
			String data2=map.get("data2");
			
			
			System.out.println("data1 : "+ data1);
			System.out.println("data2 : "+ data2);
			
			
			for(String str:data3) {
				System.out.printf("str : %s\n",str);
			}
			
			return "result";
			
		}
		/*
		//map에서 주입시 배열은 형변환이 불가능 (500번 에러)
		//배열은 List로 주입하여야 자동 형변환이 가능하다
		@Controller
		public class TestController {
			//동일한 이름의 key값 주입시 @RequestParam List<String> data3으로 사용
			@GetMapping("/test1")
			public String test1(@RequestParam Map<String, Integer> map, @RequestParam List<Integer> data3) {
				
				int data1=map.get("data1");
				int data2=map.get("data2");
				//int data33=map.get("data3"); //ERROR
				
				System.out.println("data1 : "+ data1);
				System.out.println("data2 : "+ data2);
				//System.out.println("data33 : "+ data33); //ERROR
				
				for(int str:data3) {
					System.out.printf("str : %s\n",str);
				}
				
				return "result";
				
			}*/
		/*
		//----------------------------------------------------------
		@GetMapping("/test2")
		public String test2(@ModelAttribute DataBean bean1) {
			
			System.out.printf("data1 : %d\n", bean1.getData1());
			System.out.printf("data2 : %d\n", bean1.getData2());
			
			for(int number1 : bean1.getData3()) {
				System.out.printf("data3 : %d\n", number1);
			}
			
			return "result";
			
		}*/
		/*
		//----------------------------------------------------------
		@GetMapping("/test2")
		public String test2(@ModelAttribute DataBean bean1, @ModelAttribute DataBean2 bean2) {
			
			System.out.println("------------DataBean--------------");
			System.out.printf("bean1.data1 : %d\n", bean1.getData1());
			System.out.printf("bean1.data2 : %d\n", bean1.getData2());
			
			for(int number1 : bean1.getData3()) {
				System.out.printf("data3 : %d\n", number1);
			}
			
			System.out.println("------------DataBean2--------------");
			System.out.printf("bean2.data1 : %d\n", bean2.getData1());
			System.out.printf("bean2.data2 : %d\n", bean2.getData2());
			
			return "result";
			
		}*/
		

		//----------------------------------------------------------
		
		//@ModelAttribute생략가능
		@GetMapping("/test2")
		public String test2(DataBean bean1, DataBean2 bean2) {
			
			System.out.println("------------DataBean--------------");
			System.out.printf("bean1.data1 : %d\n", bean1.getData1());
			System.out.printf("bean1.data2 : %d\n", bean1.getData2());
			
			for(int number1 : bean1.getData3()) {
				System.out.printf("data3 : %d\n", number1);
			}
			
			System.out.println("------------DataBean2--------------");
			System.out.printf("bean2.data1 : %d\n", bean2.getData1());
			System.out.printf("bean2.data2 : %d\n", bean2.getData2());
			
			return "result";
			
		}
		
		
		
		
		
		
		

}
