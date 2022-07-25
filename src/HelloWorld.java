import java.lang.*;
import java.util.*;

public class HelloWorld {
	public static void main(String[] args) {
//		int num1 = 10;
//		int num2 = 20;
//		System.out.println("Hello, World!");
//		System.out.println(num1+" "+num2+" "+(num1+num2));
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 ?:");
		String src = sc.nextLine();
		System.out.println("귀하의 이름은? " + src + " 이군요.");
		}
}
