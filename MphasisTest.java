import java.util.HashMap;
import java.util.Map;

public class MphasisTest {
	public static void main(String[] args) {
//		in = System.in;
//		String str = in.next();
		
	}
	
	private static Map<Character,Integer> returnCount(String str){
		char[] chars = str.toCharArray();
		Map<Character, Integer> result = new HashMap<>();
		for(int i=0;i< str.length();i++) {
			
			if(result.containsKey(chars[i])) {
				result.put(chars[i], result.get(chars[i])+1);
				
			}else {
				result.put(chars[i],1);
			} 
		}
		return result;
		
	}
}
