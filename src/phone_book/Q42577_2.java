package phone_book;

import java.util.HashMap;
import java.util.Map;

public class Q42577_2 {

	public static void main(String[] args) {
		String[] p = { "97674223","119",  "1195524421" };

		System.out.println(solution(p));
	}

	public static boolean solution(String[] phoneBook) {
		boolean answer = true;

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < phoneBook.length; i++) {
        	System.out.println(phoneBook[i]);
            map.put(phoneBook[i], i);
        }
        	
        

        for(int i = 0; i < phoneBook.length; i++) {
            for(int j = 0; j < phoneBook[i].length(); j++) {
            	System.out.println(phoneBook[i].substring(0,j));
                if(map.containsKey(phoneBook[i].substring(0,j))) {
                    answer = false;
                    return answer;
                }
            }
        }




        return answer;
	}

	
}
