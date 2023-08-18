package week2.day3;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {33,77,999,22,10,5};
		
		Arrays.sort(arr);
		int len =arr.length;
		
		for(int i=0;i<len;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[len-1]);
		System.out.println(arr[arr.length-1]);

	}

}
