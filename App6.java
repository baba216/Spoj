import java.util.*;
import java.io.*;

public class App6 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(reader.readLine());
		for(int testCase = 0 ; testCase < testCases ; testCase++){
			int totalSub = Integer.parseInt(reader.readLine());
			boolean[] inputArray = new boolean[1000001];
			int maxSub = 0,flagSub = 0;
			//boolean shouldContinue = true;
			for(int submission = 0 ; submission < totalSub ; submission++){
				String[] submission_details = reader.readLine().split("\\s");
				int key = Integer.parseInt(submission_details[0]);
				int value = Integer.parseInt(submission_details[1]);
				if(value == 0 ){
					/*if(flagSub > maxSub)
						maxSub = flagSub;*/
					flagSub = 0 ;
					//shouldContinue = false;
					continue;
				}else if(value == 1 && inputArray[key]){
					continue;
				}else if(value == 1 && ! inputArray[key]){
					inputArray[key] = true;
					flagSub++;
				}
				if(flagSub > maxSub)
					maxSub = flagSub;
				     	
			}
			System.out.println(maxSub);
		}
	}
}
