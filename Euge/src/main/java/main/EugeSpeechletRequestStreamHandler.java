package main;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

/**
 * 
 *
 */
public class EugeSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
	private static final Set<String> supportedApplicationIds = new HashSet<String>();

	static {
		//	skill id; ID of Amazon skill
		supportedApplicationIds.add("INSERT AMAZON SKILL ID HERE");

	}

	public EugeSpeechletRequestStreamHandler() {
		super(new EugeSpeechlet(), supportedApplicationIds);
	}
}
