package week2.day4;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Sadhurya";
		
		char[] charArray = s.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.println(charArray[i]);
		}

	}

}
