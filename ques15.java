import java.util.Scanner;

public class ques15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = in.nextInt();
		System.out.println("Enter the second number");
		int b = in.nextInt();
		if(a%2==0 && b%2==0){
			System.out.println("The multiplication of both are "+(a*b));
		}
		else{
			System.out.println("The sum of both number is "+(a+b));
		}
	}
}
