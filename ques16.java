import java.util.Scanner;

public class ques16 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter the number");
		int a = in.nextInt();
		if(a==0){
			System.out.println("The entered number is zero");
		}
		else if(a>0){
			System.out.println("The entered number is positive");
		}
		else{
			System.out.println("The entered number is negative");
		}
	}
}
