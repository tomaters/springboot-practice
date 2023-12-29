package com.zeus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.extern.java.Log;

@Log
@Controller
public class BoardController {

	@GetMapping("/board/register")
	public void registerForm() {
		log.info("registerForm()");
	}
	
	@GetMapping("/board/modify")
	public void modifyForm() {
		log.info("modify");
	}

	@GetMapping("board/list")
	public void list() {
		log.info("list");
	}
	
	@GetMapping("/read/{boardNo}")
	public String read(@PathVariable("boardNo") int boardNo) {
		log.info("boardNo: " + boardNo);
		return "board/read";
	}

	@GetMapping("/read2/{no}")
	public String read2(@PathVariable("no") int boardNo) {
		log.info("Second number: " + boardNo);
		return "board/read";
	}
	
	@GetMapping(value="/home_index")
	public String home_index() {
		log.info("GET home_index()");
		return "home_index";
	}
}
