//Check for string rotation in Java

//Given two strings s1 and s2, write a snippet to check whether s2 is a 
//rotation of s1.


public class RotationalString {
	
	public static void main(String[] args) {
		String str1 = "RemitBee";
		String str2 = "BeeRemit";
		
		String temp = str1 + str1;
		
		if(temp.contains(str2) && str1.length() == str2.length()) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
