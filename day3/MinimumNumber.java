package week2.day3;

public class MinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {10,20,13,54,97,};
		
		int maxValue = Integer.MAX_VALUE;
		System.out.println(maxValue);
		
		for(int i=0;i<number.length-1;i++) {
			if(number[i]<maxValue) {
		      maxValue = number[i];
		}
			
}
		System.out.println(maxValue);
}
}