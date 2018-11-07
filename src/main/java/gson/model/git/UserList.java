package gson.model.git;

import java.util.List;
import java.util.stream.Collectors;


public class UserList {
	private Integer total_count;
	private Boolean incomplete_results;
	private List<User> items;

	public String toString() {
		String it = String.join(",", items.stream().map(o -> o.toString()).collect(Collectors.toList()));
		return String.format("total count:%d", total_count)+ " items ["+it+"]";
	}
}