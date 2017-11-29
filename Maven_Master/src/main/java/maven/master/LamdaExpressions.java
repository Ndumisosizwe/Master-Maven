package maven.master;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LamdaExpressions {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>(Arrays.asList("Ndumiso", "Mhlongo", "Lenovo"));
		strings.forEach(string -> System.out.println(string));
	}

}
