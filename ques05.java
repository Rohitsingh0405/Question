import java.util.Scanner;

public class ques05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to check");
		int a = in.nextInt();
		if(a>9 && a<100){
			System.out.println("The entered number is 2 digit number");
		}
		else{
			System.out.println("The entered number is not 2 digit number");
		}
		
	
	}
}
