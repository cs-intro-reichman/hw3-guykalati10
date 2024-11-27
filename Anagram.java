/** Functions for checking if a given string is an anagram. */
public class Anagram {
	public static void main(String args[]) {
		// Tests the isAnagram function.
		String mila = "shooter";
		System.out.println(randomAnagram(mila));
		System.out.println(isAnagram("silent","listen"));  // true
		System.out.println(isAnagram("William Shakespeare","I am a weakish speller")); // true
		System.out.println(isAnagram("Madam Curie","Radium came")); // true
		System.out.println(isAnagram("Tom Marvolo Riddle","I am Lord Voldemort")); // true

		String word = "hello";
		if((97 <= word.charAt(0)) && (word.charAt(0)<= 122)){
		System.out.println(word.charAt(0) + 0);}
		String s = preProcess("HellO WoRld!!");
		System.out.println(s);

		// Tests the preProcess function.
		System.out.println(preProcess("What? No way!!!"));
		
		// Tests the randomAnagram function.
		System.out.println("silent and " + randomAnagram("silent") + " are anagrams.");
		
		// Performs a stress test of randomAnagram 
		String str = "1234567";
		Boolean pass = true;
		//// 10 can be changed to much larger values, like 1000
		for (int i = 0; i < 10; i++) {
			String randomAnagram = randomAnagram(str);
			System.out.println(randomAnagram);
			pass = pass && isAnagram(str, randomAnagram);
			if (!pass) break;
		}
		System.out.println(pass ? "test passed" : "test Failed");
	}  

	// Returns true if the two given strings are anagrams, false otherwise.
	public static boolean isAnagram(String str1, String str2) {
		str1 = preProcess(str1);
		str2 = preProcess(str2);

		String str3 = "";
		String str4 = "";

		for(int i = 0 ; i < str1.length() ; i++){
			if(str1.charAt(i) != ' '){
				str3 += str1.charAt(i);
			}
		}

		for(int i = 0 ; i < str2.length() ; i++){
			if(str2.charAt(i) != ' '){
				str4 += str2.charAt(i);
			}
		}

		str1 = str3;
		str2 = str4;






		
		if (str1.length() != str2.length()) {
			return false;
		}
		for(int i = 0 ; i < str1.length() ; i++){
			int index = str2.indexOf(str1.charAt(i));
			if(index==-1){
				return false;
			}
			str2 = str2.substring(0, index) + str2.substring(index + 1);

		}

		return str2.isEmpty();
	}
	   
	// Returns a preprocessed version of the given string: all the letter characters are converted
	// to lower-case, and all the other characters are deleted, except for spaces, which are left
	// as is. For example, the string "What? No way!" becomes "whatnoway"
	public static String preProcess(String str) {
		String newStr = "";
		for(int i = 0 ; i < str.length() ; i++){
			if((97 <= str.charAt(i)) && (str.charAt(i)<= 122)){
				newStr += str.charAt(i);
			}

			else if((65 <= str.charAt(i)) && (str.charAt(i)<= 90)){
				newStr += (char) (str.charAt(i)+32);
			}
			else if(str.charAt(i) == ' '){
				newStr += str.charAt(i);
			}
		}
		return newStr;
	} 
	   
	// Returns a random anagram of the given string. The random anagram consists of the same
	// characters as the given string, re-arranged in a random order. 
	public static String randomAnagram(String str) {
		
		String result = "";
		String remaining = str;
		while(remaining.length()>0){
			int randomIndex = (int) (Math.random() * remaining.length());
			result += remaining.charAt(randomIndex);
			remaining = remaining.substring(0, randomIndex) + remaining.substring(randomIndex + 1);
		}
		return result;
	}
}
