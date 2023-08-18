package week2.day4;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stubt
		
		String text = "testleaf";
		
		String upperCase = text.toUpperCase();
		System.out.println(upperCase);
		
		char[] charArray = text.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			if(i%2!=0) {
				System.out.print(Character.toUpperCase(charArray[i]));
			}
			else {
				System.out.print(charArray[i]);
			}
		}

	}

}
