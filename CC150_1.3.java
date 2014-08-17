/*
1.3 Given two strings, write a method to decide if one is a permutation of the other.
*/

// like the 1.1, we can use char array or hash map(better).

boolean isPermutation(String s1, String s2) {
	if(s1 == null || s2 == null)
		return s1 == s2;
	int len1 = s1.length();
	int len2 = s2.length();
	if(len1 != len2)
		return false;

	HashMap<char, Integer> map = new HashMap<char, Integer>();	// use array would be more clear.

	for(int i = 0; i < len1; ++i) {
		char c = s1.charAt(i);
		if(map.containKeys(c))
			map.put(c, map.get(c) + 1);
		else
			map.put(c, 1);
	}

	for(int i = 0; i < len2; ++i) {
		char c = s2.charAt(i);
		if(!map.containKeys(c))
			return false;
		int remain = map.get(c);
		if(remain < 1)
			return false;
		map.put(c, remain - 1);
	}

	return true;
}