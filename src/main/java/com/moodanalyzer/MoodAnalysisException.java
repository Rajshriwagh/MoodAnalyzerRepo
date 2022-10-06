package com.moodanalyzer;

public class MoodAnalysisException extends Exception {

	enum typeOfExcpetion {
		emptyInput, unmatchedInput

	}

	typeOfExcpetion type;

	public MoodAnalysisException(typeOfExcpetion type, String message) {
		super(message);
		this.type = type;
	}
}
