package wordPlay.handler;

import wordPlay.metrics.MetricsCalculator;

public class WordRotator {
	
	public static final String DOT = ".";
	public static final String NEW_LINE = "\n";
	public static final String SPACE = " ";
	
	private int index;
	
	public WordRotator(int index){
		this.index = index;
	}
	
	/**
	 * 
	 * @param word
	 * @param mc
	 * @return
	 */
	public String rotateToRight(String word, MetricsCalculator mc) {
		String result = word;
		if (checkForPeriodCharacter(word)) {
			result = removePeriodCharacter(word);
		}
		if(!isAlphaNumeric(result)){
			System.out.println("words in the sentance contains other than alpha numeric...!!");
		}
		addWord(mc, result);
		int rotateindex = index < result.length() ? index : index % result.length();
		result = result.substring(result.length() - rotateindex) + result.substring(0, result.length() - rotateindex);
		if (checkForPeriodCharacter(word)) {
			result = addPeriodCharacter(result);
			addSentence(mc);
			index = 1;
		} else {
			result += SPACE;
			index++;
		}
		return result;
	}

	/**
	 * Method - To check the sentence is alphanumeric
	 * 
	 * @param s
	 */
	public static boolean isAlphaNumeric(String s) {
		return s != null && s.matches("[a-zA-Z0-9]*");
	}

	/**
	 * Method - To calculate the sum of sentence and word per sentence
	 * 
	 * @param mc
	 */
	private void addSentence(MetricsCalculator mc) {
		mc.setSentenceCount(mc.getSentenceCount() + 1);
		mc.setSumOfWordPerSentence(mc.getSumOfWordPerSentence() + index);
	}

	/**
	 * Method - To calculate the sum of words and word Length
	 * 
	 * @param mc
	 * @param result
	 */
	private void addWord(MetricsCalculator mc, String result) {
		mc.setWordCount(mc.getWordCount() + 1);
		mc.setSumOfWordsLenght(mc.getSumOfWordsLenght() + result.length());
	}

	/**
	 * Method - To check period character is present
	 * 
	 * @param word
	 * @return
	 */
	private boolean checkForPeriodCharacter(String word) {
		return word.endsWith(DOT);
	}
	
	/**
	 * Method - To remove period character ( DOT )
	 * 
	 * @param word
	 * @return
	 */
	private String removePeriodCharacter(String word) {
		return word.substring(0, word.indexOf(DOT));
	}
	
	/**
	 * Method - To append dot and new line character for given string
	 * 
	 * @param word
	 * @return
	 */
	private String addPeriodCharacter(String word) {
		return word+DOT+NEW_LINE;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
