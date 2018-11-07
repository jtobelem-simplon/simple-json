package standard;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {
	
	public final static String FILE_SAMPLE = "src/exple.json";
	
	
	
	public static InputStreamReader jsonStreamFromUrl(String sURL) throws IOException {
	    // Connect to the URL using java's native library
	    URL url = new URL(sURL);
	    URLConnection request = url.openConnection();
	    request.connect();
	    
	    InputStream stream = (InputStream) request.getContent();
	    
	    return new InputStreamReader(stream);
	    
	}
	
	public static String jsonTextFromUrl(String sURL) throws Exception {
		return new Scanner(jsonStreamFromUrl(sURL)).useDelimiter("\\Z").next();
	}
	
	public static String jsonTextFromFile(String file) throws Exception {
		return new Scanner(new File(file)).useDelimiter("\\Z").next();
	}
	
}
