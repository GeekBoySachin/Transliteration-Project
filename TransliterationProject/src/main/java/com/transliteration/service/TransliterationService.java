package com.transliteration.service;

import org.springframework.stereotype.Component;

@Component
public interface TransliterationService {

	public String transliterate(String data);
}
