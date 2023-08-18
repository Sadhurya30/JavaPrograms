package week2.day3;

public class LearnReplaceAll2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "78mjdkbas23uen23";
		
		String replace = text.replaceAll("[0-9]", "");
		
		String replace2 = text.replaceAll("[a-zA-Z]","");
		
		System.out.println(replace);
		System.out.println(replace2);
		
		
		//declare a string and assign the value
		String  text1 = "gmail1234leaf";
		
		//replace the numbers using replaceAll method
		String replace3 = text1.replaceAll("[0-9]", "");
		//replace the letters using replaceAll method
		String replace4 = text1.replaceAll("[a-zA-Z]", "");
		
		//Print the numbers
		System.out.println(replace3);
		//Print the letters
		
		System.out.println(replace4);
		

	}

}
