package com.mcdev.apitester;

import com.google.gson.Gson;
import com.mcdev.twitterapikit.response.SpaceListResponse;
import com.mcdev.twitterapikit.response.TweetListResponse;
import com.mcdev.twitterapikit.response.TweetSingleResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

@SpringBootApplication
public class ApitesterApplication {


	final OkHttpClient client = new OkHttpClient();

	String run(String url) throws IOException {
		Request request = new Request.Builder()
				.header("authorization", "Bearer " + ApiCredentialsKt.BEARER_TOKEN)
				.url(url)
				.build();

		try (Response response = client.newCall(request).execute()) {
			return response.body().string();
		}
	}

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ApitesterApplication.class, args);
		ApitesterApplication example = new ApitesterApplication();
//		String response = example.run(UrlConstants.searchSpacesUrl);
		String response = example.run(TweetsUrlConstants.findTweetById);

//		SpaceListResponse spaceResponseList = new Gson().fromJson(response, SpaceListResponse.class);
		TweetSingleResponse spaceResponseList = new Gson().fromJson(response, TweetSingleResponse.class);
		System.out.println(spaceResponseList);
	}

}
