package program;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
List<String> ls= Arrays.asList("Mrunal","Neelam", "Snehal","Rashi","Jeeva","Mrunal","Neelam");
		
		Set<String> hs= new HashSet<String>();
		 ls.stream().filter(n->!hs.add(n)).forEach(System.out::println);
		 
		 List<String> dupls=ls.stream().filter(n-> Collections.frequency(ls, n)>1).collect(Collectors.toList());
		 System.out.println(dupls);
	}

}
