package week2.day3;

public class LearnSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //split the sentence into words
     String text = "I like chicken biriyani";
     String[] split = text.split(" ");
     
    /* int len =split.length;
     System.out.println(len);*/
     
     //initialize temp variable as count
     int count =0;
     
     
     //iterate the words from split
     for(int i =0;i<split.length;i++) {
    	 System.out.println(split[i]);
    	 count++;
     }
     System.out.println(count);
     
     
	}

}
