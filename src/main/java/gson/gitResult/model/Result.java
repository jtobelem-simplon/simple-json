package gson.gitResult.model;

import java.util.List;
import java.util.stream.Collectors;


public class Result {
	private Integer total_count;
	private Boolean incomplete_results;
	private List<User> items;

	public String toString() {
		String it = String.join(",", items.stream().map(o -> o.toString()).collect(Collectors.toList()));
		return String.format("total count:%d", total_count)+ " items ["+it+"]";
	}
}