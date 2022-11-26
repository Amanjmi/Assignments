
public class Duplicate_char_print {

	public static void main(String[] args) {
		String s1="THETT QUICKCK BROWNWN FOXOX";
		String s2="";
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=0;
			if (ch[i]!= 32) {
			for(int j=i+1;j<ch.length;j++) {
				if (ch[i]==ch[j] ) {
					s2=s2+ch[i];
				}
			}
			}
		}
		System.out.println(s2);
		}
	}
