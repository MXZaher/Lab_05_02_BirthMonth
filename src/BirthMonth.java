import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        System.out.print("Please enter your birth month [1-12]: ");
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        if (month < 0 || month > 12) {
            System.out.print("You entered an incorrect month value: " + month);
        }
        else {
            String[] transl = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            String birthMonth = transl[month - 1];
            System.out.println("You birth month number is: " + month);
            System.out.print("Your corresponding month is: " + birthMonth);
        }
    }

}