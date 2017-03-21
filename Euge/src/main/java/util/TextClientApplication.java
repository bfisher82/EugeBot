package util;

import ai.api.AIConfiguration;
import ai.api.AIDataService;
import ai.api.model.AIRequest;
import ai.api.model.AIResponse;

/**
 * Text client reads requests line by line from standard input.
 */

public class TextClientApplication {
	public static final String token = "INSERT API.AI TOKEN HERE";

	/**
	 * @param line
	 * @return
	 */
	public String getResponse(String line) {
		try {
			AIConfiguration configuration = new AIConfiguration(token);

			AIDataService dataService = new AIDataService(configuration);

			AIRequest request = new AIRequest(line);

			AIResponse response = dataService.request(request);

			if (response.getStatus().getCode() == 200) {
				System.out.println(response.getResult().getFulfillment().getSpeech());
			} else {
				System.err.println(response.getStatus().getErrorDetails());
			}
			return response.getResult().getFulfillment().getSpeech();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}
}
