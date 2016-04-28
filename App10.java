import java.util.*;
import java.io.*;

public class App10{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(reader.readLine());
		String[] input = reader.readLine().split("\\s");
		int[] inputArray = new int[size];
		for(int i = 0 ; i < size ; i++){
			inputArray[i] = Integer.parseInt(input[i]);
		}
		int[] prefixSum = new int[size];
		int sum = 0 ;
		for(int i = 0; i < size ; i++){
			 sum += inputArray[i];
		 	 prefixSum[i] = sum ;	 
		}

		System.out.println(Arrays.toString(prefixSum));
		int numberOfQueries = Integer.parseInt(reader.readLine());
		for(int i = 0 ; i < numberOfQueries ; i++){
			String[] query = reader.readLine().split("\\s");
			int l = Integer.parseInt(query[0])-1;
			int r = Integer.parseInt(query[1])-1;
			if(l == 0) 
			  	System.out.println(prefixSum[r]);
			else{
				System.out.println(prefixSum[r] + "-" + prefixSum[l] + " = " +  (prefixSum[r]-prefixSum[l]));
			    }
		}
	}
}
