import java.util.Scanner;

public class Google {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. // We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in. System.out.println("Are you on vacation? Type true or false"); boolean vacation = scan.nextBoolean(); System.out.println("Please type day of the week"); String daysOfTheWeek = scan.nextLine().toLowerCase(); if (vacation == true) { System.out.println("You may sleep all day long!"); } else if (daysOfTheWeek.equals("saturday") || daysOfTheWeek.equals("sunday")){ System.out.println("You may sleep today"); } else { System.out.println("You should be working today so you cannot sleep. Sorry"); }
    }
}
