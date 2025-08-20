package zoho;

class StringCompression {
public static void main(String[] args) {
	String s1="aaabbc";
	String s2="";
	int count=1;
	System.out.println(s1.length());
	for(int i=1;i<s1.length();i++) {
		if(s1.charAt(i)==s1.charAt(i-1)) {
			count++;
		}
		else {
			
			s2+=s1.charAt(i-1)+String.valueOf(count);
			count=1;
		}
	}
	s2+=s1.charAt(s1.length()-1)+String.valueOf(count);
	System.out.println(s2);
}
}
