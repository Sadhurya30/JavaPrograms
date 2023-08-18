package week2.day3;

public class LargestNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {33,77,999,22,10,5};
		
		int max = arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
		
	}
}
