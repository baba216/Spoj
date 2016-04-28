import java.util.*;
import java.io.*;

public class App7 {
		public static void main(String[] args) throws IOException{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int testCases = Integer.parseInt(reader.readLine());
			for(int testCase = 0 ; testCase < testCases ; testCase++){
				int arraySize = Integer.parseInt(reader.readLine());
				String[] input = reader.readLine().split("\\s");
				int[] int_input_array = new int[arraySize];
				for(int i = 0 ; i < arraySize ; i++){
					int_input_array[i] = Integer.parseInt(input[i]);
				}
				Arrays.sort(int_input_array);
				for(int i = (arraySize - 1) ; i >= 0 ; i--){
					System.out.print(int_input_array[i]);
				}
				System.out.println();
	      		}
		}
}

