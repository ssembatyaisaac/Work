import java.util.Scanner;

public class DD{

	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		int number1,number2;
		
		System.out.print("Enter 1st integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter 2st integer: ");
		number2 = input.nextInt();
		
		if(number1 == number2)
			System.out.printf("%d == %d" ,number1,number2);
		
		if(number1 != number2)
			System.out.printf("%d != %d" ,number1,number2);
		
		if(number1 < number2)
			System.out.printf("%d < %d" ,number1,number2);
		
		if(number1 > number2)
			System.out.printf("%d > %d" ,number1,number2);
		
		if(number1 <= number2)
			System.out.printf("%d <= %d" ,number1,number2);
		
		if(number1 >= number2)
			System.out.printf("%d>= %d" ,number1,number2);
		
		input.close();
	}

}
