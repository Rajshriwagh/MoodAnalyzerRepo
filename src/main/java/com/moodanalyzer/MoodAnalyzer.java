package com.moodanalyzer;

public class MoodAnalyzer {
	String message;

	MoodAnalyzer() {

	}

	MoodAnalyzer(String message) {
		this.message = message;
	}

	String analyseMood() {
		if (message.equalsIgnoreCase("I am in Happy mood")) {
			return "HAPPY";
		} else {
			return "SAD";
		}
	}
}
