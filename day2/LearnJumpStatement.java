package week2.day2;

public class LearnJumpStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=7;i++) {
			if(i==5) {
				System.out.println("Five");
				continue;
				//to skip the current iteration
			}
			System.out.println(i);
		}

	}

}
