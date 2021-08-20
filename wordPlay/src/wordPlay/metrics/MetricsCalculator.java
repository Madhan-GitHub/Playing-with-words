package wordPlay.metrics;

public class MetricsCalculator {
	private int wordCount;
	private int sumOfWordsLenght;
	private int sentenceCount;
	private int sumOfWordPerSentense;

	public int getWordCount() {
		return wordCount;
	}

	public void setWordCount(int wordCount) {
		this.wordCount = wordCount;
	}

	public int getSumOfWordsLenght() {
		return sumOfWordsLenght;
	}

	public void setSumOfWordsLenght(int sumOfWordsLenght) {
		this.sumOfWordsLenght = sumOfWordsLenght;
	}

	public int getSentenceCount() {
		return sentenceCount;
	}

	public void setSentenceCount(int sentenceCount) {
		this.sentenceCount = sentenceCount;
	}

	public int getSumOfWordPerSentence() {
		return sumOfWordPerSentense;
	}

	public void setSumOfWordPerSentence(int sumOfWordPerSentence) {
		this.sumOfWordPerSentense = sumOfWordPerSentence;
	}

	public MetricsCalculator(int wordCount, int sumOfWordsLenght, int sentenseCount, int sumOfWordPerSentense) {
		this.wordCount = wordCount;
		this.sumOfWordsLenght = sumOfWordsLenght;
		this.sentenceCount = sentenseCount;
		this.sumOfWordPerSentense = sumOfWordPerSentense;
	}

	/**
	 * Method - To find the average of words per sentence in given file.
	 * @return
	 */
	public Double getAvgWordPerSentence() {
		return (double) (this.sumOfWordPerSentense / (double) this.sentenceCount);
	}

	/**
	 * Method - To find the average of word length per word in given file.
	 * @return
	 */
	public Double getAvgWordLength() {
		return (double) (this.sumOfWordsLenght / (double) this.wordCount);
	}
}
