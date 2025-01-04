import java.util.Scanner;

public class ques03 {
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = in.nextInt();
		if(a%3==0 && a%5==0){
			System.out.println("Yes it is a multiple of both 3 and 5");
		}
	}
}
