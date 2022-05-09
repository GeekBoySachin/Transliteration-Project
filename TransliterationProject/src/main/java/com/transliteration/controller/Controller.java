package com.transliteration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.transliteration.serviceimp.TransliterationServiceImpl;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	private TransliterationServiceImpl service;

	@GetMapping({"/",""})
	public String welcome() {
		return "index";
	}
	
	@GetMapping("/home")
	public String mainpage() {
		return "home";
	}

	@RequestMapping(value = "/HiToEn", method = RequestMethod.POST, produces = MediaType.TEXT_PLAIN_VALUE, consumes = MediaType.TEXT_PLAIN_VALUE)
	public @ResponseBody String convert(@RequestBody String data) {
		StringBuilder englishData = new StringBuilder();
	
			String[] arrData = data.trim().split(" ");
			for (String temp : arrData)
				englishData.append(" " + service.transliterate(temp));
			String output=englishData.toString();
			
			return output;
			
	}

}
