package main;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

public class EugeSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {
	private static final Set<String> supportedApplicationIds = new HashSet<String>();

	static {
		supportedApplicationIds.add("INSERT SKILL ID HERE");

	}

	public EugeSpeechletRequestStreamHandler() {
		super(new EugeSpeechlet(), supportedApplicationIds);
	}
}
