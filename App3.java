import java.util.*;

public class App3 {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		scanner.nextLine();
		int numBubblyWords = 0;
		for(int testCase = 0; testCase < testCases ; testCase++){
			String input = scanner.nextLine();
			int length = input.length();
			Stack<Character> pair_stack = new Stack<Character>();
			//pair_stack.push(input.charAt(0));
			for(int i = 0 ; i < length ; i++){
				char current_char = input.charAt(i);
				if(!pair_stack.empty()){
					char top_elem = pair_stack.peek();
					if(top_elem == current_char)
						pair_stack.pop();
					else
						pair_stack.push(current_char);
				}else
					pair_stack.push(current_char);
			}
			if(pair_stack.empty())
				numBubblyWords++ ;
		}
		System.out.println(numBubblyWords);
	}
}
