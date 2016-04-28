import java.util.*;
import java.io.*;

public class App14{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		String input = reader.readLine();
		int size = input.length();
		Map<Character,Integer> employeeCount = new HashMap<Character,Integer>();
		employeeCount.put('V',0);
		employeeCount.put('N',0);
		employeeCount.put('G',0);
		employeeCount.put('T',0);
		employeeCount.put('S',0);
		employeeCount.put('B',0);
		employeeCount.put('P',0);
		for(int i = 0 ; i < size ; i++){
			Character ch = input.charAt(i);
			int value = employeeCount.get(ch);
			employeeCount.put(ch,++value);
		}
		for(Map.Entry<Character,Integer> entry : employeeCount.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}

		int testCases = Integer.parseInt(reader.readLine());
		for(int testCase = 0 ; testCase < testCases ; testCase++){
			String order = reader.readLine();
			int result = 1 ;
			for(int i = 0 ; i < 3 ; i++){
				Character worker = order.charAt(i);
				int val = employeeCount.get(worker);
				result *= val;
				employeeCount.put(worker,--val);
			}
			System.out.println(result);
		}
	}
}
