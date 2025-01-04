import java.util.Scanner;

public class ques04 {
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = in.nextInt();
		if(a%3==0 && a%5==0 && a%7==0){
			System.out.println("Yes the number is divisible by 3,5,7 ");
		}
		

	}
}
