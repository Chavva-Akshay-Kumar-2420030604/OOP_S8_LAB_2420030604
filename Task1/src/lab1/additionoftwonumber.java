package lab1;
import java.util.Scanner;
public class additionoftwonumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter morning shift earnings (in ₹): ");
	        double morningShiftEarnings = sc.nextDouble();
	        System.out.print("Enter evening shift earnings (in ₹): ");
	        double eveningShiftEarnings = sc.nextDouble();
	        double totalDailyEarnings = morningShiftEarnings + eveningShiftEarnings;
	        System.out.println("Total earnings for the day: ₹" + totalDailyEarnings);
	    }
	}

