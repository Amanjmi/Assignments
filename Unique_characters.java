// 7. WAP to find if String contains all unique characters.

public class Unique_characters {

	public static void main(String[] args) {
		String s1="THE QUICK BROWN F0X JMPS";
		int count =0;
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if (ch[i]!= 32) {
			for(int j=i+1;j<ch.length;j++) {
				if (ch[i]==ch[j] ) {
					count++;
				}
			}
			}
		}
			if(count==0) {
				System.out.println("String contains all unique characters");
			}
			else {
				System.out.println("String contains duplicate characters");
			}
		}
		
		}
	