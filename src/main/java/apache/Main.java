package apache;

import java.net.URL;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;


public class Main {
	public static String jsonTextFromUrl(String url) throws Exception {
		return IOUtils.toString(new URL(url), Charset.forName("UTF-8"));

	}
}
