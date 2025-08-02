package lab2;
import java.util.Scanner;
public class sumofdigitsofanumber {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        int originalNumber = number; 
	        int sum = 0;
	        while (number > 0) {
	            int digit = number % 10; 
	            sum += digit;           
	            number /= 10;         
	        }
	        System.out.println("Sum of digits of " + originalNumber + " is: " + sum);
	        if (sum % 5 == 0) {
	            System.out.println("✔️ The digit-sum is divisible by 5.");
	        } else {
	            System.out.println("❌ The digit-sum is NOT divisible by 5.");
	        }
	    }
}
