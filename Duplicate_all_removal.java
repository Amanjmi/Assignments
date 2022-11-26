//1. WAP to remove Duplicates from a String.(Take any String ex with duplicates
//character)
//after giving 2 hours dedicatedly finally done.
public class Duplicate_all_removal {

	public static void main(String[] args) {
		String s1="QUICKQQQ TTHE CKQUICK OXBROWN F0X JUMPS";
		String s2="";
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=0;
			if (ch[i]!= 32) {
			for(int j=i+1;j<ch.length;j++) {
				if (ch[i]==ch[j] ) {
					count++;
				}
			}
			}
			if(count==0) {
				s2=s2+ch[i];
			}
		}
		System.out.println(s2);
		}
	}