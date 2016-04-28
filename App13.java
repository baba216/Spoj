import java.util.*;
import java.io.*;

public class App13{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] inputLine = br.readLine().split("\\s");
		int[] inputArray = new int[N];
		int max = -1,secondMax=-1,thirdMax = -1;
		for(int i = 0 ; i < N ; i++){
			inputArray[i] = Integer.parseInt(inputLine[i]);	
			if(i == 0 || i == 1 ){
			     	if(i == 1){
			          max = inputArray[0];
		  		  secondMax = inputArray[1];		  
				  if(inputArray[0] < inputArray[1]){
				  	max = inputArray[1];
					secondMax = inputArray[0];
				  }		 
				}
				System.out.println("-1");
			}else if(i == 2){
			     thirdMax = inputArray[2];	
			     if(inputArray[2] > max){
			     	     thirdMax = secondMax;
				     secondMax = max;
				     max = inputArray[2];
			     }else if(inputArray[2] > secondMax){
			     	     thirdMax = secondMax;
				     secondMax = inputArray[2];
			     }	
			     System.out.println(inputArray[0]*inputArray[1]*inputArray[2]);
			}else {
			      int temp = inputArray[i];	
			      if(temp >= max){
				thirdMax = secondMax;
			  	secondMax = max;	
			      	max = temp;
			      }else if(temp >= secondMax){
			      		thirdMax = secondMax;
					secondMax = temp;
			      }
				System.out.println(max*secondMax*thirdMax);
			}
		}
	}
}
