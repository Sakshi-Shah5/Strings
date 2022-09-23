import java.util.HashSet;

//leetcode 3

public class lengthOfLongestSubstring {
  public static int longestSubstring(String s) {
	  
	  int n = s.length();
	  
	  int max = 0;
	  int left = 0;
	  int right = 0;
	  
	  HashSet<Character> set = new HashSet<>();
	  
	  while(right < n) {
		  if(!set.contains(s.charAt(right))) {
			  set.add(s.charAt(right));
			  right++;
			  
			  max = Math.max(max, set.size());
		  }
		  
		  else {
			  set.remove(s.charAt(left));
			  left++;
		  }
	  }

	  return max;
  }
  
  public static void main(String args[]) {
	  String s ="abcabcbb";
	 
	  System.out.print(longestSubstring(s));
  }
}
