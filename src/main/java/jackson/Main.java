package jackson;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import jackson.model.wiki.WikiArticle;

public class Main {
	
	public static String getField(String query, String fieldName) throws IOException {
		JsonNode tree = new ObjectMapper().readTree(new URL(query));
		return tree.get(fieldName).asText();
	}
	
	public static List<WikiArticle> buildModel(String query) 
			throws MalformedURLException, IOException {
		
		JsonNode tree = new ObjectMapper().readTree(new URL(query));

	    // get number of results ( length of titles array )
	    int totalResults = tree.get(1).size();
	    // initialize a new ArrayList to store the WikiArticles into
	    List<WikiArticle> results = new ArrayList<>(totalResults);
	    // for each article, create a new object from the data contained in the arrays
	    for (int i = 0; i < totalResults; i++) {
	        results.add(new WikiArticle(
	                tree.get(1).get(i).asText(),
	                tree.get(2).get(i).asText(),
	                tree.get(3).get(i).asText()
	        ));
	    }
	    
	    return results;
	}
	
	
	public static void printWikipediaResults(String search) throws IOException {
		String query = MessageFormat.format(requetes.Main.WIKI, search); // put the search word in the query
		
	    // initialize a new ArrayList to store the WikiArticles into
	    List<WikiArticle> results = buildModel(query);
	    

	    System.out.println("Showing results for: " + search);
	    for (WikiArticle article : results) {
	        System.out.println(article.title + ": " + article.desc);
	    }
	}
	
	public static void main(String[] args) throws IOException {
		printWikipediaResults("soleil");
	}

	
}
