/*
1.2 Implement a function void reverse(char *str) in C or C++ which reverse a null terminated string.

*/

// I want just write in java
// use two pointer to move from both sides
String reverse(String str) {
	int l = 0;
	int r = str.length();
	//cause str can change, we convert to char array first
	char[] charArray = str.toCharArray();
	while(l < r) { // l == r no need to process
		char temp = charArray[l];
		charArray[l] = charArray[r];
		charArray[r] = temp; 
	}

	return charArray.tostring();
}