package week2.day3;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner scan = new Scanner(System.in);
		//scan.next();
		//Declare a string and assign the value
		String name = "madam";
		//Declare an empty string
		String rev = "";
		
		//Convert the string into character array
		char[] arr1 = name.toCharArray();
		//Iterate a reverse for loop
		 for(int i=arr1.length-1;i>=0;i--) {
		//Add the elements of the array in the empty string	
				rev+=arr1[i];
				
		 }
		 //print the array
		 System.out.println(rev);
		 
		// char[] arr2 = rev.toCharArray();
		 
		 if(name.equals(rev)) {
			 System.out.println("Its a palindrome");
		 }
		else {
				 System.out.println("Not a palindrome");
			 }
		 }
	}
	

