import java.util.Scanner;
public class SecondsConverter{
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);

        int numSeconds;

        System.out.println("Enter the number of seconds: ");
        numSeconds = kbd.nextInt();

        int numHours;
        int numMinutes;
        int numSecRemain;

        numHours = numSeconds / (60 * 60);
        numMinutes = ((numSeconds - (numHours * 60 * 60)) / 60);
        numSecRemain = numSeconds - ((numHours * 60 * 60) + (numMinutes * 60));

        System.out.println("Hours: " + numHours);
        System.out.println("Minutes: " + numMinutes);
        System.out.println("Seconds: " + numSecRemain);


        //close keyboard scanner
        kbd.close();
    }
}
