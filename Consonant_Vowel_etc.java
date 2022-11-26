//4. WAP to count the number of consonants, vowels, special characters in a String.
public class Consonant_Vowel_etc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abcdefghijklmnopqrstuvwxyz*%$#@&abcdefghijklmnopqrstuvwxyz";
		String s2="";
		String Vowels="aeiou";
		int nov=0;
		int nosc=0;
		int noconso=0;
		char[] ch=s1.toCharArray();
		char[] v=Vowels.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<v.length;j++) {
				if (ch[i]==v[j] ) {
					s2=s2+ch[i];
					nov++;
				}
			}
			if(ch[i]<65 ){
					nosc++;
				}else {
					noconso++;
				}
			
		}
		int conso=noconso-nov;
		System.out.println("Total no. of Vowels are "+nov + " and those vowels are : "+s2);
		System.out.println();
		System.out.println("Total no. of special characters are "+nosc);
		System.out.println();
		System.out.println("Total no. of consonants are "+conso);
		}
	}
