import java.util.Scanner;

public class ques08 {
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = in.nextInt();
		if((a>99) && (a<1000) && (a%2==0) && (a%5==0) && (a%10==0)){
			System.out.println("Yes");
		}
		else{
			System.out.println("NO");
		}
	}
}
