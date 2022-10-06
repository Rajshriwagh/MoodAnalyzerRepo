package com.moodanalyzer;

import java.util.Scanner;
import java.util.function.LongFunction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	private static final Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("Mood Analyzer!");
		String inputMessage = null;
		try {
			Scanner scannerObject = new Scanner(System.in);
			inputMessage = scannerObject.nextLine();
			if (inputMessage.isEmpty()) {
				throw new MoodAnalysisException(MoodAnalysisException.typeOfExcpetion.emptyInput,
						"param cannot be null.");
			}
			MoodAnalyzer moodAnalyzerObject = new MoodAnalyzer(inputMessage);
			logger.info(moodAnalyzerObject.analyseMood());
			scannerObject.close();
		} catch (Exception exceptionObject) {
			logger.info(exceptionObject);
		}
	}
}