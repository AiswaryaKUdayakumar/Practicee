
package Praccttiicee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//write a java8 program it will take a list of strings and returns to a map where each unit have unique string of a key and 
//the value of a number of items appears in a list.
public class Mapping {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> List = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");

        Map<String, Long> Count =List.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(Count);

	}

}
