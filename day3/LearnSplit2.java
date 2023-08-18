package week2.day3;

public class LearnSplit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare a string and assign the values
		String text = "Amazon has 20,000 employees in chennai";
		//Split the string into words
		String split[] = text.split(" ");
		
		//Iterate the words from the split[]
		
		//intiliaze a temp variable as count
		
	
		int count =0;
		for(int i=0;i<split.length;i++) {
			System.out.println(split[i]);
			count++;
		}
		
		System.out.println(count);

	}

}
