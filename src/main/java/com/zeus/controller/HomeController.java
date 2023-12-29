package com.zeus.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zeus.domain.Board;
import com.zeus.domain.Card;
import com.zeus.domain.Member;

import lombok.extern.java.Log;

@Log
@Controller
public class HomeController {

//	@RequestMapping(value="/", method = RequestMethod.GET)
	@GetMapping(value="/")
	public String homeIndex(Locale locale, Model model) {
		log.info("Your locale: " + locale);
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy, m, d (E) a h:m:s");
		String formattedNow = now.format(formatter);
		model.addAttribute("serverTime", formattedNow);
		return "home";
	}
	
	@GetMapping("/home01")
	public String home01(Locale locale, Model model) {
		log.info("Locale: " + locale);
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy, m, d, (E) a h:m:s");
		String formattedNow = now.format(formatter);
		model.addAttribute("serverTime", formattedNow);
		return "home01";
	}
	
	@GetMapping("/home03")
	public String home03(Locale locale, Model model) {
		log.info("Locale: " + locale);
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy, m, d, (E) a h:m:s");
		String formattedNow = now.format(formatter);
		model.addAttribute("serverTime", formattedNow);
		return "home03";
	}
	
	@GetMapping("/home0102")
	public String home0102(Model model) {
		Member member = new Member();
		String[] hobbyArray = {"Music", "Movie"};
		member.setHobbyArray(hobbyArray);
		
		List<String> hobbyList = new ArrayList<String>();
		hobbyList.add("Music");
		hobbyList.add("Movie");
		
		member.setHobbyList(hobbyList);
		model.addAttribute(member);
		
		return "home0102";
		}
	
	@GetMapping("/home0104")
	public String home0104(Model model) {
		Member member = new Member();
		List<Card> cardList = new ArrayList<Card>();
		
		Card card1 = new Card();
		card1.setNo("123456");
		
		Date validMonth = new Date(202009);
		card1.setValidMonth(validMonth);
		cardList.add(card1);
		
		Card card2 = new Card();
		card2.setNo("456789");
		Date validMonth2 = new Date(201511);
		card2.setValidMonth(validMonth2);
		cardList.add(card2);
		
		member.setCardList(cardList);
		model.addAttribute(member);
		
		return "home0104";
	}
	
	@GetMapping("/home0105")
	public String home0105(Model model) {
		Map memberMap = new HashMap();
		
		memberMap.put("userId",  "pp");
		memberMap.put("password",  "123");
		memberMap.put("email",  "abc@def.com");
		memberMap.put("userName",  "Pepe");
		
		LocalDate dateOfBirth = LocalDate.of(1995, 11, 15);
		
		memberMap.put("dateOfBirth", dateOfBirth);
		
		model.addAttribute("memberMap", memberMap);
		
		return "home0105";
	}
	
	
	@GetMapping("/home0201")
	public String home0201(Model model) {
		int coin = 1000;
		model.addAttribute("coin", coin);
		
		return "home0201";
	}
	
	@GetMapping("/home0310")
	public String home0310(Model model) {
		Member member = new Member();
		
		List<String> hobbyList = new ArrayList<String>();
		hobbyList.add("Music");
		hobbyList.add("Movie");
		
		member.setHobbyList(hobbyList);
		model.addAttribute(member);
		return "home0310";
	}
	
	@GetMapping("/home0312")
	public String home0312(Model model) {
		Map memberMap = new HashMap();
		memberMap.put("userId",  "gg");
		memberMap.put("password", "321");
		memberMap.put("email", "1@2.com");
		memberMap.put("userName", "Gigi");
		
		LocalDate dateOfBirth = LocalDate.of(2001, 1, 5);
		
		memberMap.put("dateOfBirth", dateOfBirth);
		model.addAttribute("memberMap", memberMap);
		
		return "home0312";
	}
	
	@GetMapping("/home0401")
	public String home0401(Model model) {
		int coin = 1000;
		String userId = "yes";
		Member member = new Member();
		
		model.addAttribute("coin", coin);
		model.addAttribute("userId", userId);
		model.addAttribute("member", member);
		
		return "home0401";
	}
	
	@GetMapping("/board/read/{boardNo}")
	public String home(@PathVariable("boardNo") int boardNo) {
		log.info("boardNo: " + boardNo);
		return "home";
	}
	
	@GetMapping(value = "/ajaxHome")
	public String ajaxHome() {
		log.info("headers mapping");
		return "ajaxHome";
	}

	@PutMapping(value = "/board/{boardNo}")
	public ResponseEntity<String> modify(@PathVariable("boardNo") int boardNo, 
			@RequestBody Board board) {
		log.info("modify: " + board.toString());
		ResponseEntity<String> entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		return entity;
	}

	@GetMapping(value = "/board/{boardNo}")
	public ResponseEntity<Board> select(@PathVariable("boardNo") int boardNo) {
		log.info("select");
		Board board = new Board();
		board.setBoardNo(20);
		board.setContent("AAA");
		board.setTitle("BBB");
		board.setWriter("CCC");
		ResponseEntity<Board> entity = new ResponseEntity<Board>(board, HttpStatus.OK);
		return entity;
	}
	
	@GetMapping("/registerAjaxFileUpForm")
	public String registerAjaxFileUpForm() {
		log.info("registerAjaxFileUpForm");
		return "registerAjaxFileUpForm";
	}
	
	@GetMapping("/registerModelForm")
	public String registerModelForm() {
		log.info("registerModelForm()");
		return "registerModelForm";
	}
	@PostMapping("/registerModelForm01")
	public String registerModelForm01(@ModelAttribute("userId") String userId) {
		log.info("registerModelForm01()");
		return "registerModelForm01";
	}
	
	@GetMapping("/registerSpringForm")
	public String registerSpringForm(Model model) {
		log.info("registerSpringForm()");
		model.addAttribute("member", new Member());
		return "registerSpringForm";
	}

	@PostMapping("/register")
	public String register(@Validated Member member, BindingResult result) {
		log.info("register()");
		if(result.hasErrors()) {
			log.info("errors: " + result.getAllErrors());
			return "registerSpringForm";
		}
		return "register";
	}
}