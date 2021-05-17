package kr.ac.inha.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	
	@RequestMapping("/inha")
	public String inha() {
		return "inha.ac.kr";
	}
	@RequestMapping("/name")
	public String name(String id) {
		return "당신의 학번은 : " + id;
	}
	@RequestMapping("/hello")
	public String hello(String num) {
		int number = Integer.parseInt(num);
		String ret = "";
		for(int i = 1; i<=9; i++) {
			ret += num +"*" + Integer.toString(i) + "=" + Integer.toString(i*number) + " ";
		}
		return ret;
	}
	
}
