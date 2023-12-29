package com.zeus.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.zeus.domain.Address;
import com.zeus.domain.Card;
import com.zeus.domain.Member;

import lombok.extern.java.Log;

@Log
@Controller
public class MemberController {

	@RequestMapping(value = "/registerbeans01", method = RequestMethod.POST)
	public String registerbeans01(Member member) {
		log.info("registerBeans");
		log.info("member.getUserId() = " + member.getUserId());
		log.info("member.getPassword() = " + member.getPassword());
		log.info("member.getCoin() = " + member.getCoin());
		return "success";
	}

	@RequestMapping(value = "/registerForm", method = RequestMethod.GET)
	public String registerForm() {
		log.info("registerForm");
		return "registerForm";
	}

	@RequestMapping(value = "/register/{userId}", method = RequestMethod.GET)
	public String registerByPath(@PathVariable("userId") String userId) {
		log.info("registerByPath : /register/{userId} ");
		log.info("userId = " + userId);
		return "success";
	}

	@RequestMapping(value = "/register/{userId}/{coin}", method = RequestMethod.GET)
	public String registerByPath(@PathVariable("userId") String userId, @PathVariable("coin") int coin) {
		log.info("registerByPath : /register/{userId}/{coin}");
		log.info("userId = " + userId);
		log.info("coin = " + coin);
		return "success";
	}

	@RequestMapping(value = "/register01", method = RequestMethod.POST)
	public String register01(String userId) {
		log.info("register01 : userId");
		log.info("userId = " + userId);
		return "success";
	}

	@RequestMapping(value = "/register02", method = RequestMethod.POST)
	public String register02(@RequestParam("userId") String username) {
		log.info("register02 : @RequestParam");
		log.info("userId = " + username);
		return "success";
	}

	@RequestMapping(value = "/registerdate", method = RequestMethod.POST)
	public String registerdate(Member member) {
		log.info("registerByDate");
		log.info("member.getUserId() = " + member.getUserId());
		log.info("member.getPassword() = " + member.getPassword());
		log.info("member.getDateOfBirth() = " + member.getDateOfBirth());
		return "success";
	}

//	@RequestMapping(value = "/register", method = RequestMethod.POST)
//	public String register(Member member) {
//		log.info("register");
//		log.info("member.getUserId() = " + member.getUserId());
//		log.info("member.getPassword() = " + member.getPassword());
//		log.info("member.getDateOfBirth() = " + member.getDateOfBirth());
//		return "success";
//	}

	@RequestMapping(value = "/registerByDateFormat", method = RequestMethod.GET)
	public String registerByDateFormat(String userId, @DateTimeFormat(pattern = "yyyyMMdd") Date dateOfBirth) {
		log.info("registerByDateFormat");
		log.info("userId = " + userId);
		log.info("dateOfBirth = " + dateOfBirth);
		return "success";
	}

	@RequestMapping(value = "/registerAllForm", method = RequestMethod.GET)
	public String registerAllForm() {
		log.info("registerAllForm");
		return "registerAllForm";
	}

	@RequestMapping(value = "/registerMemberUserId", method = RequestMethod.POST)
	public String registerUserId(Member member) {
		log.info("registerUserId");
		log.info("member.getUserId() :" + member.getUserId());
		return "success";
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String registerUser(Member member) {
		log.info("registerUser");
		log.info("member.getUserId() = " + member.getUserId());
		log.info("member.getGender() = " + member.getGender());
		log.info("member.getHobby() = " + member.getHobby());
		log.info("member.isForeigner() = " + member.isForeigner());
		log.info("member.getDeveloper() = " + member.getDeveloper());
		log.info("member.getBirthDate() = " + member.getDateOfBirth());
		log.info("member.getCars() = " + member.getCars());
		log.info("member.getIntroduction() = " + member.getIntroduction());

		String[] hobbyArray = member.getHobbyArray();
		if (hobbyArray != null) {
			log.info("hobbyArray.length: " + hobbyArray.length);

			for (int i = 0; i < hobbyArray.length; i++) {
				log.info("hobbyArray[" + i + "] = " + hobbyArray[i]);
			}
		} else {
			log.info("hobbyArray == null");
		}
		List<String> hobbyList = member.getHobbyList();

		if (hobbyList != null) {
			log.info("hobbyList.size(): " + hobbyList.size());

			for (int i = 0; i < hobbyList.size(); i++) {
				log.info("hobbyList(" + i + "): " + hobbyList.get(i));
			}
		} else {
			log.info("hobbyList == null");
		}
		Address address = member.getAddress();

		if (address != null) {
			log.info("address.getPostCode(): " + address.getPostCode());
			log.info("address.getLocation(): " + address.getLocation());
		} else {
			log.info("address == null");
		}

		List<Card> cardList = member.getCardList();

		if (cardList != null) {
			log.info("cardList.size(): " + cardList.size());

			for (int i = 0; i < cardList.size(); i++) {
				Card card = cardList.get(i);
				log.info("card.getNo(): " + card.getNo());
				log.info("card.getValidMonth(): " + card.getValidMonth());
			}
		} else {
			log.info("cardList == null");
		}
		String[] carArray = member.getCarArray();

		if (carArray != null) {
			log.info("carArray.length: " + carArray.length);

			for (int i = 0; i < carArray.length; i++) {
				log.info("carArray[" + i + "]: " + carArray[i]);
			}
		} else {
			log.info("carArray == null");
		}
		List<String> carList = member.getCarList();

		if (carList != null) {
			log.info("carList.size(): " + carList.size());
			for (int i = 0; i < carList.size(); i++) {
				log.info("hobbyList(" + i + "): " + carList.get(i));
			}
		} else {
			log.info("carList == null");
		}
		return "success";
	}

	@RequestMapping(value = "/registerUserId", method = RequestMethod.POST)
	public String registerUserId(String userId) {
		log.info("registerUserId");
		log.info("userId: " + userId);
		return "success";
	}

	@RequestMapping(value = "/registerPassword", method = RequestMethod.POST)
	public String registerPassword(String password) {
		log.info("registerPassword");
		log.info("password: " + password);
		return "success";
	}

	@RequestMapping(value = "/registerTextArea", method = RequestMethod.POST)
	public String registerTextArea(String introduction) {
		log.info("registerTextArea");
		log.info("introduction: " + introduction);
		return "success";
	}

	@RequestMapping(value = "/registerRadio", method = RequestMethod.POST)
	public String registerRadio(String gender) {
		log.info("registerRadio");
		log.info("gender: " + gender);
		return "success";
	}

	@RequestMapping(value = "/registerCheckbox01", method = RequestMethod.POST)
	public String registerCheckbox01(String hobby) {
		log.info("registerCheckbox01");
		log.info("hobby: " + hobby);
		return "success";
	}

	@RequestMapping(value = "/registerCheckbox02", method = RequestMethod.POST)
	public String registerCheckbox02(String[] hobbyArray) {
		log.info("registerCheckbox01");
		if (hobbyArray != null) {
			log.info("hobbyArray.length: " + hobbyArray.length);
			for (int i = 0; i < hobbyArray.length; i++) {
				log.info("hobbyArray[" + i + "]: " + hobbyArray[i]);
			}
		} else {
			log.info("hobbyArray == null");
		}
		return "success";
	}

	@RequestMapping(value = "/registerCheckbox03", method = RequestMethod.POST)
	public String registerCheckbox03(String developer) {
		log.info("registerCheckbox03");
		log.info("developer: " + developer);
		return "success";
	}

	@RequestMapping(value = "/registerCheckbox04", method = RequestMethod.POST)
	public String registerCheckbox04(boolean foreigner) {
		log.info("registerCheckbox04");
		log.info("foreigner:" + foreigner);
		return "success";
	}

	@RequestMapping(value = "/registerSelect", method = RequestMethod.POST)
	public String registerSelect(String nationality) {
		log.info("registerSelect");
		log.info("nationality = " + nationality);
		return "success";
	}

	@RequestMapping(value = "/registerAddress", method = RequestMethod.POST)
	public String registerAddress(Address address) {
		log.info("registerAddress");
		if (address != null) {
			log.info("address.getPostCode() = " + address.getPostCode());
			log.info("address.getLocation() = " + address.getLocation());
		} else {
		}
		log.info("address == null");
		return "success";
	}

	@RequestMapping(value = "/registerUserAddress", method = RequestMethod.POST)
	public String registerUserAddress(Member member) {
		log.info("registerUserAddress");
		Address address = member.getAddress();
		if (address != null) {
			log.info("address.getPostCode() = " + address.getPostCode());
			log.info("address.getLocation() = " + address.getLocation());
		} else {
		}
		log.info("address == null");
		return "success";
	}

	@RequestMapping(value = "/registerUserCardList", method = RequestMethod.POST)
	public String registerUserCardList(Member member) {
		log.info("registerUserCardList");
		List<Card> cardList = member.getCardList();
		if (cardList != null) {
			log.info("cardList.size() = " + cardList.size());
			for (int i = 0; i < cardList.size(); i++) {
				Card card = cardList.get(i);
				log.info("card.getNo() = " + card.getNo());
				log.info("card.getValidMonth() = " + card.getValidMonth());
			}
		} else {
			log.info("cardList == null");
		}
		return "success";
	}

	@PostMapping(value = "/uploadAjax", produces="text/plain;charset=UTF-8")
	public ResponseEntity<String> uploadAjax(MultipartFile file) throws Exception {
		String originalFileName = file.getOriginalFilename();
		log.info("originalFileName: " + originalFileName);
		ResponseEntity<String> entity = new ResponseEntity<String>("UPLOAD SUCCESS " + originalFileName, HttpStatus.OK);
		return entity;
	}
	
	@GetMapping(value="/model03")
	public String model03(Model model) {
		log.info("model03");
		String[] carArray = {"car1", "car2"};
		List<String> carList = new ArrayList<String>();
		carList.add("car1");
		carList.add("car2");
		
		String[] hobbyArray = {"Eat", "Sleep"};
		List<String> hobbyList = new ArrayList<String>();
		hobbyList.add("Eat");
		hobbyList.add("Sleep");
		
		model.addAttribute("carArray", carArray);
		model.addAttribute("carList", carList);
		
		model.addAttribute("hobbyArray", hobbyArray);
		model.addAttribute("hobbyList", hobbyList);
		
		return "model03";
	}
}