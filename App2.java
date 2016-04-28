import java.util.*;
public class App2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		Map<Integer,Integer> numberFrequency = new HashMap<Integer,Integer>();
		for(int i = 0 ; i < n ; i++){
			int num = scanner.nextInt();
			Integer value = numberFrequency.get(num);
			if(value == null){
				numberFrequency.put(num,1);	
			}else{
				numberFrequency.put(num,++value);
			}
		}
		int maxValue = -1;
		for(Map.Entry<Integer,Integer> entry : numberFrequency.entrySet()){
			int key = entry.getKey();
			int value = entry.getValue();
			if(value == 1){
				int current_max_value = key;
				if(current_max_value > maxValue){
					maxValue = key;
				}
			}	
		}
		System.out.println(maxValue);
	}
}
