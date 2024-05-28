package coreJavaTraining;

public class ReversaStringorPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "madam";
		String t = "";     //bringing the empty string
		for(int i = s.length()-1; i>=0; i--)
		{
			t = t+ s.charAt(i);     //concatenating the string
		}

		System.out.println(t);
		
		if(s.equals(t))
		{
			System.out.println(s + " is a palindrome");
		} else {
			System.out.println(s + " is not a palindrome");
		}
		
	}

}

