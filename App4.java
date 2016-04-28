import java.util.*;

public class App4 {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		scanner.nextLine();
		Set<String> customer_names = new TreeSet<String>();
		for(int testCase = 0; testCase < testCases ; testCase++){
			String customer_name = scanner.nextLine();
			//System.out.println(customer_name);
			customer_names.add(customer_name);
		}
		for(String customer_name : customer_names)
			System.out.println(customer_name);
	}
}
