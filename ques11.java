import java.util.*;
public class ques11 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the Character");
	char a = in.next().charAt(0);
	int b = a;
	if(b>=97 && b<=122){
		System.out.println("It is Lower case Ascii");
	}
	else{
		System.out.println("The enter character is not in lower case ascii");
	}
	

}	
}

