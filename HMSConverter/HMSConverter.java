import java.util.Scanner;

public class HMSConverter {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        int numHours;
        int numMinutes;
        int numSeconds;

        

        System.out.println("Enter the number of hours: ");
        numHours = kbd.nextInt();

        System.out.println("Enter the number of minutes: ");
        numMinutes = kbd.nextInt();

        System.out.println("Enter the number of seconds: ");
        numSeconds = kbd.nextInt();

        numHours = numHours * 60 * 60;
        numMinutes = numMinutes * 60;

        int totalSeconds;
        totalSeconds = (numHours + numMinutes + numSeconds);

        System.out.println("Total seconds: " + totalSeconds);



        // insert code and delete scanner
        kbd.close();
    }
}
