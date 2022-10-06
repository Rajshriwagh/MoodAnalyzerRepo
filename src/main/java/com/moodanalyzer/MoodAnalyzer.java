package com.moodanalyzer;

public class MoodAnalyzer {
	String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	MoodAnalyzer() {
	}

	MoodAnalyzer(String message) {
		this.message = message;
	}

	String analyseMood() {
		if (message.equalsIgnoreCase("I am in Happy mood")) {
			setMessage("HAPPY");
			return "HAPPY";
		} else {
			setMessage("SAD");
			return "SAD";
		}
	}
}
