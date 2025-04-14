package ProgrammingPractice;

public class StringPallindrome {
	public static boolean swadhin(String s) {

		int i= 0;
		int j=s.length()-1;
		for(int s1=0;s1<s.length()-1;s1++) {
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.println("HI");
		System.out.println(swadhin("MALAYALAM"));

	}

}
