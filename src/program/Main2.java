package program;

import java.util.Arrays;
import java.util.List;

import entity.Employee;

public class Main2 {

	public static void main(String[] args) {

		// creting list of employee here
		List<Employee> empl= Arrays.asList(
				new Employee(1, "Madhu", "Nagpur", 100000),
				new Employee(2, "Megha", "Indore", 10000),
				new Employee(3, "Nisha", "Mumbai", 200000),
				new Employee(4, "Vasu", "Patna", 104000)
				
				);

	}

}
