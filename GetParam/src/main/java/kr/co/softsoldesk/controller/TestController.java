package kr.co.softsoldesk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {

		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String[] data3 = request.getParameterValues("data3");

		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);

		for (String str1 : data3) {
			System.out.println("data3 : " + str1);
		}

		return "result";

	}

	// =============================================================

	@PostMapping("/test2")
	public String test2(HttpServletRequest requset) {

		String data1 = requset.getParameter("data1");
		String data2 = requset.getParameter("data2");
		String[] data3 = requset.getParameterValues("data3");

		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);

		if (data3 != null) {
			for (String str1 : data3) {
				System.out.println("data3 : " + str1);
			}
		}
		return "result";
	}
	// =============================================================

	// 포틀릿은 복합페이지면서 API에 종속되지 않는 타입
	// HttpServletRequest + 포틀릿 양쪽 모두를 사용할 수 있도록 고안됨
	@GetMapping("/test3")
	public String test3(WebRequest request) {

		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String[] data3 = request.getParameterValues("data3");

		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);

		for (String str1 : data3) {
			System.out.println("data3 : " + str1);
		}

		return "result";
	}

	// =============================================================
	@GetMapping("/test4/{data1}/{data2}/{data3}")
	public String test4(@PathVariable int data1, // @PathVariable String data1에서 자동 형변환 가능
			@PathVariable int data2, @PathVariable int data3) {
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data3 : " + data3);

		int add = data1 + data2 + data3;
		System.out.println("add : " + add);

		return "result";

	}

	// =============================================================
	@GetMapping("/test5")
	public String test5(@RequestParam int data1, @RequestParam int data2, @RequestParam int[] data3) {

		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);

		for (int str1 : data3) {
			System.out.println("data3 : " + str1);
		}

		return "result";

	}

	// =============================================================

	// Param에 있는 값을 안받을때는 오류가 없으나 Param에 없는 값을 호출하면 ERROR발생
	@GetMapping("/test6") // 파라미터 이름과 변수의 이름을 다르게 지정할 경우 사용
	public String test6(@RequestParam(value = "data1") int value1,
					  //@RequestParam(value = "data2") int value2,
						@RequestParam(value = "data3") int[] value3) {

		System.out.println("data1 : " + value1);
		// System.out.println("data2 : "+value2);

		for (int str1 : value3) {
			System.out.println("data3 : " + str1);
		}

		return "result";

	}

	// =============================================================
	// 지도API 또는 결제 API 사용시 많이 적용됨
	@GetMapping("/test7")
	public String test7(@RequestParam int data1, 
						@RequestParam(required = false) String data2,
						@RequestParam(defaultValue = "0") int data3) {

		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data3 : " + data3);

		return "result";

	}

}
