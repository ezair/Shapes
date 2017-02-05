//Test out the Rectangle class
public class Client {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10, 10);
		r.draw();

		//fucking with recurrsion
		System.out.println(pow(2, 0));

		//palindrome test
		System.out.println(isPalindrome("Eric"));
		System.out.println(isPalindrome("Bob"));
	}//main


	public static double pow(double base, int exponent) {
		if(exponent == 0)
			return base;
		else
			return (base * pow(base, exponent - 1));
	}

	public static boolean isPalindrome(String s) {
		if(s.length() < 2)
			return true;
		else if(s.toUpperCase().charAt(0) == s.toUpperCase().charAt(s.length()-1))
			return true;
		else
			return false;
	}

}//class