package com.transliteration.serviceimp;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.transliteration.mapping.Mapping;
import com.transliteration.service.TransliterationService;
@Component
public class TransliterationServiceImpl implements TransliterationService {


	@Override
	public String transliterate(String s) {
		HashMap<Character, String> map=Mapping.getMap();
		String englishWord = "";
		int c = s.length();
		for (int i = 0; i < s.length(); i++) {
			if ((String.valueOf(s.charAt(i)).equalsIgnoreCase("ा") || String.valueOf(s.charAt(i)).equalsIgnoreCase("ि")
					|| String.valueOf(s.charAt(i)).equalsIgnoreCase("्")
					|| String.valueOf(s.charAt(i)).equalsIgnoreCase("ी")
					|| String.valueOf(s.charAt(i)).equalsIgnoreCase("ु")
					|| String.valueOf(s.charAt(i)).equalsIgnoreCase("ॄ")
					|| String.valueOf(s.charAt(i)).equalsIgnoreCase("ू")
					|| String.valueOf(s.charAt(i)).equalsIgnoreCase("ृ")
					|| String.valueOf(s.charAt(i)).equalsIgnoreCase("ॅ")
					|| String.valueOf(s.charAt(i)).equalsIgnoreCase("े")
					|| String.valueOf(s.charAt(i)).equalsIgnoreCase("ॉ")
					|| String.valueOf(s.charAt(i)).equalsIgnoreCase("ो")
					|| String.valueOf(s.charAt(i)).equalsIgnoreCase("ौ"))
					|| String.valueOf(s.charAt(i)).equalsIgnoreCase("्")
							&& englishWord.charAt(englishWord.length() - 1) == 'a') {
				englishWord = englishWord.substring(0, englishWord.length() - 1);
				
			}

			englishWord = englishWord + String.valueOf(map.get(s.charAt(i)));
			if (c == (i + 1) && s.charAt(i) != 'ा' && englishWord.charAt(englishWord.length() - 1) == 'a') {
				englishWord = englishWord.substring(0, englishWord.length() - 1);
			}
		}
		
		return englishWord;
	}

}
