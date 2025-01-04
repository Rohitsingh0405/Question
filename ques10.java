import java.util.Scanner;

public class ques10 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	char a = in.next().charAt(0);
	int b = a;
	if(b>=65 && b<=90){
		System.out.println("It is Upper case Ascii");
	}
	else{
		System.out.println("The enter character is not in upper case ascii");
	}
	

}	
}
