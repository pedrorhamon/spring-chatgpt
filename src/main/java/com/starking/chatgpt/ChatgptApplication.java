package com.starking.chatgpt;

import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.completion.CompletionRequest;

public class ChatgptApplication {
	
	private static final String API_KEY = "chaveKey";

	public static void main(String[] args) {
		OpenAiService service = new OpenAiService(API_KEY);
		
		CompletionRequest request = CompletionRequest.builder()
				.model("text-davinci-003")
				.prompt("Escreva uma história do Batman")
				.maxTokens(100)
				.temperature(0.10)
				.build();
		
		System.out.println(service.createCompletion(request).getChoices());
	}

}
