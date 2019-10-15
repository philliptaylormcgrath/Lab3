import java.util.Scanner;
//Collect number between 1 and 100
// Use if/else statements 
//  If the   integer   entered is   odd,   print the number entered and "odd."
// If the integer is even, > 2 and less than 25, print "Even and less than 25"
//If the integer is even and above 25 print but less than 61 simply print "Even"
//If the integer is even and above 60 print "(The number) is Even"
// If the integer is odd and above 60 print "odd and over 60"
//Add validation to confirm that the number is between 1 and 100

public class Lab3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your name");
		String name = scan.next();

		System.out.println("Please enter a number between 1 and 100");
		int num1 = scan.nextInt();

		// System.out.println(num1 + " " + name);
		while (num1 < 0 || num1 > 100) {
			System.out.println("That is an invalid numerical input, " + name);
			System.out.println("Please enter a number between 1 and 100");
		num1 = scan.nextInt();
	
		}
	   if (num1 > 0 && num1 < 101) {
		if (num1 < 25 && num1 % 2 == 0) {
			System.out.println(name + ", that number is even and less than 25");

		} else if (num1 % 2 != 0 && num1 > 60) {
			System.out.println(name + ", that number is odd and over 60");
			
		} else if (num1 % 2 != 0 ) {
			System.out.println(name + ", " + num1 + " is odd");
			
		} else if (num1 % 2 == 0 && num1 > 25 && num1 < 61) {
			System.out.println(name + ", that number is Even");
		} else if (num1 % 2 == 0 && num1 > 60) {
			System.out.println(name + ", " + num1 + " is Even");
		} System.out.println("Don't you think this was fun, " + name + "? " + "Math is fun. Let's do it again sometime! PROGRAM END");
		
		} 
}
}

//if num1 < 1 && num1  System.out.println("Please enter a number between 1 and 100");
//num1 = scan.nextInt();