import java.util.*;
import java.io.*;

public class App5{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(reader.readLine());
		for(int testCase = 0 ; testCase < testCases ; testCase++){
			int number_of_elements = Integer.parseInt(reader.readLine());
			//System.out.println(number_of_elements);
			int[] hash_array = new int[100001];
			int maxSum = 0, tempSum = 0;
			String[] input_array = reader.readLine().split("\\s");
			int index = 0;
			for(int i = 0; i < number_of_elements ; i++){
				int number = Integer.parseInt(input_array[i]);
				//System.out.println("Value:" + hash_array[number]);
				++hash_array[number];
				//System.out.println("Value After Increment:" + hash_array[number]+", for number:"+number);
				tempSum = hash_array[number];
				if(tempSum >= maxSum){
					maxSum = tempSum;	
				}	
			}
			for(int i = 100000 ; i >= 0 ; i--)
				if(hash_array[i] == maxSum)
					System.out.print(i);
		}		
	}
}
