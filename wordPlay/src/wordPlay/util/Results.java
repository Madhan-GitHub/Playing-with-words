package wordPlay.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {
	
	public static final String AVG_NUM_WORDS_PER_SENTENCE = "AVG_NUM_WORDS_PER_SENTENCE - ";
	
	public static final String AVG_WORD_LENGTH = "AVG_WORD_LENGTH - ";
	
	public static final DecimalFormat df = new DecimalFormat("#.0#");

	@Override
	public void writeFile(String path, String content) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File(path));
			pw.write(content);
		} catch (FileNotFoundException e) {
			displayException(e.getMessage());
		} finally {
			if(pw != null)
				pw.close();
		}
	}
	
	@Override
	public void displayException(String errorMessage) {
		System.err.println(errorMessage);
	}
	
	public String createMetricsContext(Double avgWordPerSentence, Double avgWordLength) {
		String metricContent = AVG_NUM_WORDS_PER_SENTENCE + df.format(avgWordPerSentence) + "\n" + AVG_WORD_LENGTH
				+ df.format(avgWordLength);
		return metricContent;
	}
	
}
