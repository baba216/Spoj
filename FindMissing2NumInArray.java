import java.util.*;
import java.io.*;

public class Interview1{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		String[] input_number = reader.readLine().split("\\s");
		int[] input_number_int = new int[N];
		int sum = 0;
		int sum_sq = 0 ;
		for(int i = 0 ; i<N ; i++){
			int a = Integer.parseInt(input_number[i]);
			sum += a;
			sum_sq += a*a;
			//System.out.println(sum_sq);
		}
		int M = Integer.parseInt(reader.readLine());
		String[] missing_number_array = reader.readLine().split("\\s");
		int sum1 = 0 ;
		int sum_sq1 = 0;
		for(int i = 0 ; i < M ; i++){
			int a = Integer.parseInt(missing_number_array[i]);
			sum1 += a;
			sum_sq1 += a*a;
		}

		double aPlusB =(double) sum - sum1 ;
		double a2PlusB2 = (double) sum_sq - sum_sq1;
		System.out.println("A+B="+aPlusB+", A2+B2 = "+a2PlusB2);
		double ab = (double) (aPlusB*aPlusB - a2PlusB2)/2;
		System.out.println("AB="+ab);		
            	double aMinusB = Math.sqrt((a2PlusB2) - (2*ab));
		System.out.println("A-B:"+aMinusB);
		int a = (int) (aPlusB - aMinusB) / 2;
		int b = (int) aPlusB - a;
		System.out.println("A:"+ a +",B:"+b);		

	}
}
