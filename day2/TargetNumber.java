package week2.day2;

public class TargetNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare an integer array and assign the values
		int[] num  = {1,5,4,2,3,0};
		
		//iterate a for loop from 0 to the length of the array
		for(int i=0;i<=num.length-1;i++) {
			//iterate another for loop from j[i+1] to the length of the array 
			for(int j=i+1;j<=num.length-1;j++) {
				//add the elements and assign to the variable temp
				int temp = num[i]+ num[j];
				//if the value of the temporary variable is equal to 7, then print the value of temporary variable
				if(temp==7) {
					System.out.println(temp);
				}
			}
		}

	}

}
