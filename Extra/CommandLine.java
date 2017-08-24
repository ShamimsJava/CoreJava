/*
public class CommandLine{
	public static void main(String[] args){
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println("Total number is: "+( x + y ));
	}
}
*/

/*
public class CommandLine{
	public static void main(String[] args){
		int sum = 0;
		for(int i = 0; i < args.length; i++){
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("The sum is: "+sum);
	}
}
*/

import java.util.Scanner;

public class CommandLine{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Please insert first number: ");
		int x = s.nextInt();
		System.out.print("Please insert second number: ");
		int y = s.nextInt();
		System.out.println("Total is: "+(x+y));
	}
}