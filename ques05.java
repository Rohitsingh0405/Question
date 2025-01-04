import java.util.Scanner;

public class ques05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = a%100;
		if(a%100==a){
			System.out.println("The entered number is 2 digit number");
		}
		System.out.println(b);
	}
}
