package wordPlay.driver;

import java.io.IOException;
import java.nio.file.InvalidPathException;

import wordPlay.handler.WordRotator;
import wordPlay.metrics.MetricsCalculator;
import wordPlay.util.FileProcessor;
import wordPlay.util.Results;

/**
 * @author John Doe
 *
 */
public class Driver {
	
	
	public static void main(final String[] args) {

		final Results result = new Results();
		/*
		 * As the build.xml specifies the arguments as input,output or metrics, in case
		 * the argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */
		if ((args.length != 3) || (args[0].equals("${input}")) || (args[1].equals("${output}"))
				|| (args[2].equals("${metrics}"))) {
			result.displayException("Error: Incorrect number of arguments. Program accepts 3 arguments.");
			System.exit(0);
		}
		System.out.println("Hello World! Lets get started with the assignment");
		try {
			final FileProcessor fp = new FileProcessor(args[0]);
			final WordRotator wr = new WordRotator(1);
			final MetricsCalculator mc = new MetricsCalculator(0, 0, 0, 0);
			String sentence = ""; 
			String word =  fp.poll();
			while (word != null ) {
				if(!word.isEmpty()){
					sentence += wr.rotateToRight(word,mc);
				}
				word = fp.poll();
			}
			if(sentence.trim().isEmpty()){
				result.displayException("The Given input file is empty...!");
			}else{
			result.writeFile(args[1], sentence);
			result.writeFile(args[2], result.createMetricsContext(mc.getAvgWordPerSentence(), mc.getAvgWordLength()));
			}
		} catch (InvalidPathException | SecurityException | IOException e) {
			result.displayException(e.getMessage());
		}
		System.out.println("Result and computation is stored in output.txt and metrics.txt respectively !!!!! ");
	}
}
