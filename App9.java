import java.util.*;
import java.io.*;

public class App9{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(reader.readLine());
		for(int testCase = 0 ; testCase < testCases ; testCase++){
			String input = reader.readLine();
			int i = 0 ;
			int j = input.length() - 1;
			int result = 0;
			while(i<j){
				while((i<j) && input.charAt(i) != 'R'){
					i++;
				}
				while((i<j) && input.charAt(j) != 'K'){
					j--;
				}
				if(i<j){
					result += 2;
				}
				i++;
				j--;

			}
			System.out.println(result);
		}
	}
}
