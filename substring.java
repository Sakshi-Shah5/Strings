//substring problem 

public class Main
{
	public static void main(String[] args) {
		String str1 = "California";
		String str2 = "for";
		
		boolean present = false;
		for(int i=0; i<str1.length(); i++){
		    
		    if(str1.charAt(i) == str2.charAt(0)){
		        String temp = str1.substring(i, i+str2.length());
		        if(temp.equals(str2)){
		            present = true;
		        }
		    }
		}
		
		System.out.println(present);
	}
}
