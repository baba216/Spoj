import java.util.*;
import java.io.*;

public class App8 {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		char[] chars = input.toCharArray();
		int testCases = Integer.parseInt(reader.readLine());
		int length = input.length();
		for(int testCase = 0 ; testCase < testCases ; testCase++){
			String[] input_array = reader.readLine().split("\\s");
			int r1 = Integer.parseInt(input_array[0])-1;
			int l1 = Integer.parseInt(input_array[1])-1;
			int r2 = Integer.parseInt(input_array[2])-1;
			int l2 = Integer.parseInt(input_array[3])-1;
			/*Forgot to put the check for the last character */
			if(r1 == l1){
				l1++;
			}
			if(r2 == l2){
				l2++;
			}
			System.out.println("r1:"+r1+",l1:"+l1+" and r2:"+r2+",l2:"+l2);
			boolean isEqual = false;
			int difference1 = l1 - r1 ;
			int difference2 = l2 - r2;
			//System.out.println("Difference:"+difference1);
			if(difference1 == difference2){
				isEqual = true;
				int ptr1 = r1;
				int ptr2 = r2;
				for(int i = 0 ; i < difference1 ; i++){
					if(input.charAt(ptr1)!=input.charAt(ptr2)){
						System.out.println("char a:"+input.charAt(ptr1)+",char b:"+input.charAt(ptr2));
						isEqual = false;
						break;		
					}else{
						ptr1++;
						ptr2++;
						continue;
					}
			}
		}
		if(isEqual){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
   }
}
