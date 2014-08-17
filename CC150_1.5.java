/*
Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. if the "compressed" string would not become smaller than the original string, your method should return the original string.
*/

String void compressionString(String str) {
	if(str == null || str.length() == 0)
		return str;
	int len = str.length();
	int newLen = 0;
	char last = str.charAt(0);

	for(int i = 1; i < len; ++i) {
		if(str.charAt(i) != last) {
			last = str.charAt(i)
			newLen += 2;
		}
		//else do nothing
	}
	//note should do one more time add cause no check for the last character (whether it is same for the previous)

	newLen += 2;

	if(newLen > len)
		return str;

	char[] result = new char[newLen];
	int t = 0;
	int count = 1;
	int last = str.charAt(0);
	for(int i = 1; i < len; ++i) {
		if(last != str.charAt(i)) {
			result[t++] = last;
			result[t++] = count;
			last = str.charAt(i);
			count = 1;
		}
		else
			count++;
	}
	result[t++] = last;
	result[t] = count;
	return result.toString();
}