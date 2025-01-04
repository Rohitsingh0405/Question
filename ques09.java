import java.util.Scanner;

public class ques09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = in.nextInt();
		if(a%10==0){
			System.out.println("The entered number ends with 0 ");
		}
		else{
			System.out.println("The entered does not ends with zero")
		}
	}	
}
