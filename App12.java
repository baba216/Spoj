import java.util.*;
import java.io.*;

public class App12{
		
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		while(testCases != 0){
			testCases--;
			int N = Integer.parseInt(br.readLine());
			Set<String> inviteList = new TreeSet<String>();
			for(int i = 0 ; i < N; i++){
				String name = br.readLine();
				inviteList.add(name);
			}
			for(String name : inviteList){
				System.out.println(name);
			}
	    	}
	}
}
