package gson;

import java.io.IOException;
import java.io.InputStreamReader;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import gson.model.git.UserList;

public class Main {
	
	public static String getField(String query, String fieldName) throws IOException {
		InputStreamReader jsonReader = standard.Main.jsonStreamFromUrl(query);

		// Convert to a JSON object to print data
		JsonParser jp = new JsonParser(); //from gson


		JsonElement root = jp.parse(jsonReader); //Convert the input stream to a json element
		JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object. 
		return rootobj.get(fieldName).getAsString(); //just grab the fieldName
	}
	
	
	public static UserList buildModel(String query) throws IOException {
		InputStreamReader jsonReader = standard.Main.jsonStreamFromUrl(query);
		
		// Now do the magic.
		UserList result = new Gson().fromJson(jsonReader, UserList.class);
		return result;
	}
	
	public static void printGitResults() throws IOException {
		UserList list = buildModel(requetes.Main.GIT);
		System.out.println(list);
	}
	
	public static void main(String[] args) throws IOException {
		printGitResults();
	}
}
