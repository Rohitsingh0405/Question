import java.util.Scanner;

public class ques06 {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = in.nextInt();
		if(a>99 && a<1000)	{
			System.out.println("The Entered number is a three digit number");
		}
		else{
			System.out.println("The entered number is not a 3 digit number");
		}
	}
}
