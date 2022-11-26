// 8. WAP to find the maximum occurring character in a String.

public class Max_occuring_char {

	public static void main(String[] args) {
		String s1="Ineuron is the best patform for learning because of its best mentors";
		int count =0;
		char charmax='0';
		int max =0;
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			count=0;
			if (ch[i]!= 32) {
			for(int j=i+1;j<ch.length;j++) {
				if (ch[i]==ch[j] ) {
					count++;
				}
			}
			if (count>max) {
				max=count;
				charmax =ch[i];
			}
			}
		}
			System.out.println(charmax +" is the maximum occurring character in a String. And its occurance is "+max + " times");
		}
		
		}
	