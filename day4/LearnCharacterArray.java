package week2.day4;

public class LearnCharacterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Sadhurya";
		int l =s.length();
		System.out.println(l);
		
		
				
		char[] charArray = s.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			System.out.println(charArray[i]);
		}
		

	}

}
