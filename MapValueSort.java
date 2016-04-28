import java.util.*;
import java.io.*;
import java.lang.*;
public class MapValueSort{
		
	public static <K, V extends Comparable<? super V>> Map<K,V> sortByValue(Map<K,V> map){
		
		List<Map.Entry<K,V>> list = new LinkedList<>(map.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<K,V>>(){
			@Override
			public int compare(Map.Entry<K,V> o1, Map.Entry<K,V> o2){
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		Map<K,V> result = new LinkedHashMap<>();
		for(Map.Entry<K,V> entry : list){
			result.put(entry.getKey(),entry.getValue());
		}	
		return result;
	}

	public static void main(String[] args){
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"Shubham");
		map.put(2,"Vikram");
		map.put(3,"Abhishek");	
		Map<Integer,String> sortedMap = sortByValue(map);
		for(Map.Entry<Integer,String> entry : sortedMap.entrySet()){
			System.out.println("Key:"+entry.getKey()+", Value:"+entry.getValue());
		}
	}
	

}
