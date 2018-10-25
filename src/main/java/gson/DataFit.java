package gson;
import com.google.gson.Gson;

import gson.gitResult.model.Result;


public class DataFit {

	public static void main(String... args) throws Exception {

		String content = apache.Main.jsonTextFromUrl(requetes.Main.GIT);

		// Now do the magic.
		Result result = new Gson().fromJson(content, Result.class);

		// Show it.
		System.out.println(result);
	}
}





