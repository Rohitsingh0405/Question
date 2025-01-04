import java.util.Scanner;

public class que02{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to know the multiple of 10 ");
		int a = in.nextInt();
		if(a%10==0){
			System.out.println("Yes it is a multiple of 10 ");
		}
		else{
			System.out.println("No it is not a multiple of 10 ");
		}
	}
}