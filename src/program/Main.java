package program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
List<String> ls= Arrays.asList("Mrunal","Neelam", "Snehal","Rashi","Jeeva","Mrunal","Neelam");
		
		Set<String> hs= new HashSet<String>();
		 ls.stream().filter(n->!hs.add(n)).forEach(System.out::println);

	}

}
