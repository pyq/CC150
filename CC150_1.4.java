/*
1.4 Write a method to replace all spaces in a string with '%20'. You may assure that the string has sufficient space at the end of the string to hold the additional characters, and that you are given the 'true' length of the string. (Note if implementing in Java, please use a character array so that you can perform this operation in place.)

*/

String replaceSpaces(String str) {
	if(str == null)
		return str;
	int len = str.length();

	char[] charArray = str.toCharArray();
	char[] result = new char[len*3];
	int len2 = 0;
	for(int i = 0; i < len; ++i) {
		if(charArray[i] == ' ') {
			result[len2] = '%';
			result[len2+1] = '2';
			result[len2+2] = '0';
			len2 += 3;
		}
		else {
			result[len2] = charArray[i];
			len2++;
		}
	}
	return result.toString().substring(0, len2);
}