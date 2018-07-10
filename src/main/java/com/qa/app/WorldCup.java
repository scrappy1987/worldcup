package com.qa.app;

import org.apache.commons.lang3.text.WordUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

public class WorldCup {

	public static void main(String[] args) {
		String initalString = "Hello it's coming home, it's coming home, it's coming home footabll coming homE";
		System.out.println(initalString);
		WordUtils wordUtil = new WordUtils();
		String outputString = wordUtil.capitalize(initalString);
		System.out.println(outputString);
	}

}
