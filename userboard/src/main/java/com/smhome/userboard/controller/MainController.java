package com.smhome.userboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// response body에 직접 데이터를 담아 응답해준다
//@RequestMapping("apis/")
public class MainController {
	
	static final String HIYO = "Hiyo";
	// 반복작업 간편화, 상수선언

	@GetMapping("/")
	// http://호스트:포트/~ (여기선 ~위치가 end-point)
	public String hello() {
		return "Hello Spring Boot World!";
	}
	// 같은 메소드명에 같은 end-point가 지정되면 작동하지 않음
	
	@GetMapping(HIYO)
	public String getHiyo(@RequestParam(name = "name", required = false, defaultValue = "james")String name) {
	// @RequestParam(name="",value="",require=true/false,defaultValue="")
		return "This is get method, end-point '/hello' " + name;
	}
	
	@GetMapping(HIYO + "/{name}/spring")
	public String getHiyoName(@PathVariable("name") String name) {
//		name이라는 변수로 받음, URL데이터를 받을 경우엔 @PathVariable("path값")
//		http://호스트:포트/end-point/Variable
		return "This is get method, end-point '/hello' " + name;
		
	}
	
	
	
	
}
