package apache;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;


public class Main {
	
	public static String jsonTextFromUrl(String url) 
			throws MalformedURLException, IOException {
		
		return IOUtils.toString(new URL(url), Charset.forName("UTF-8"));
		
	}
	
	
	public static String getField(String query, String fieldName) 
			throws MalformedURLException, IOException, JSONException  {
		
		String jsonText = jsonTextFromUrl(query);
		
		JSONObject json = new JSONObject(jsonText);

		return json.get(fieldName).toString();
	}
	
	
	
}
