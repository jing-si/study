package phone_book;

import java.util.Arrays;

public class Q42577_1 {

	public static void main(String[] args) {
		String[] p = { "97674223","119",  "1195524421" };

		System.out.println(solution(p));
	}

	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		Arrays.sort(phone_book);
		
		for(int a = 0; a < phone_book.length-1;a++) {
			int b= a+1;
			if(phone_book[b].startsWith(phone_book[a])) {
				
				return false;
			}
			
		}

		return answer;
	}

	/*
	 * class phone_number{ private String strNumber; private long longNumber; public
	 * phone_number(String strNumber) { super(); this.strNumber = strNumber;
	 * this.longNumber = Long.valueOf(strNumber); }
	 * 
	 * public String getStrNumber() { return strNumber; } public void
	 * setStrNumber(String strNumber) { this.strNumber = strNumber; } public long
	 * getLongNumber() { return longNumber; } public void setLongNumber(long
	 * longNumber) {
	 * 
	 * this.longNumber = longNumber; }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
}
