/*
1.1 Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structure? 

*/

//thought: 1 convert s to char array, then sort the array. check the array to see whether has two same letters.
//		   2 check the character of s one by one, and put it into a hash map, see whether it is already existed.
public boolean uniqueString(String s) {
	if(s == null || s == "")
		return false
	int len = s.length();
	HashMap<char, integer> map = new HashMap<char, integer>(); // also can use boolean array [256] ASCII

	for(int i = 0; i < len; ++i) {
		char c = s.charAt(i);
		if(map.containsKey(c))
			return false;
		else
			map.put(c, 1);
	}
	return true;
}