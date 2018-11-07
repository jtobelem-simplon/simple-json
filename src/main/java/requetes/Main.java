package requetes;

public class Main {

	public final static String GIT = "https://api.github.com/search/users?q=followers%3E100";
	
	public final static String WIKI = "https://fr.wikipedia.org/w/api.php?action=opensearch&search={0}&format=json";

	public final static String WEATHER = "http://api.openweathermap.org/data/2.5/weather?q=Paris,fr&units=metric&appid=XXXX";
	
	public final static String YOUTUBE = "https://www.googleapis.com/youtube/v3/videos?part=statistics,snippet&id=yKP7jQknGjs&key=XXXX";
}
