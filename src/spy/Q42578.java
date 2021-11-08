package spy;

import java.util.HashMap;
import java.util.Iterator;

public class Q42578 {

	public static void main(String[] args) {
		String[][] p = 	{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

		System.out.println(solution(p));
	}
	 public static int solution(String[][] clothes) {		 
	        HashMap<String, Integer> hm = new HashMap<>();
	        for(int a = 0; a<clothes.length;a++) {
	        	if(!hm.containsKey(clothes[a][1])) {
	        		hm.put(clothes[a][1], 2);
	        	} else {
	        		hm.put(clothes[a][1], hm.get(clothes[a][1])+1);
	        	}
	        }
	     
	        Iterator<String> i =  hm.keySet().iterator();
	        int w = 1;
	        while(i.hasNext()) {
	        	String wear = i.next();	        	
	        	w *= hm.get(wear);
	        	
	        }
	        
	        return w -1;
	    }
}
