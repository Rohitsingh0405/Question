import java.util.Scanner;

public class ques07 {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = in.nextInt();
		if((a%10==0) && (a>99) && (a<1000)){
			System.out.println("Entered number is 3 digit number and it a multiple of 10 ");
		}
	}	
}
