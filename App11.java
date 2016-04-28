import java.util.*;
import java.io.*;

public class App11 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(reader.readLine());
		for(int testCase = 0; testCase < testCases ; testCase++){
			int N = Integer.parseInt(reader.readLine());
			int current_time = 0;
			int current_pos = 0;
			while(true){
			    if((N-(current_pos+current_time)) > current_time){
				current_pos += current_time;	
				current_time++;	
			    }else{
			    	current_time = N-current_pos;	
			    	break;
			    }    
			}
		   System.out.println(current_time);	
		}
	}
}
