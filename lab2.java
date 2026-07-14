
/**
 * KIT107 Lab 2
 *
 * @author Sushant Khadka
 * @version Week 2
 */
import java.util.Scanner;

public class lab2 {

    public static void main(String[] args) {
        // Declare final variables
        final String[] MONTHS = {"January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November",
            "December"};    // names of months of the year

        // Declare local variables
        Scanner sc = new Scanner(System.in);    // mechanism for user input

        int a, b, c, d, e, f, g, h, i, k, l, m; // used by algorithm
        int mon;    // numerical month of Easter (1-12)

        int myYear, myDay;  // year provided by user and day number calculated
        String myMonth;     // name of month for which Easter occurs

        // Obtain user input
        System.out.print("Please enter the year: ");
        myYear = sc.nextInt();

        // Calculate the date of Easter Sunday using Gauss’s Algorithm 
        a = myYear % 19;
        b = myYear / 100;
        c = myYear % 100;
        d = b / 4;
        e = b % 4;
        f = (b + 8) / 25;
        g = (b - f + 1) / 3;
        h = (19 * a + b - d - g + 15) % 30;
        i = c / 4;
        k = c % 4;
        l = (32 + 2 * e + 2 * i - h - k) % 7;
        m = (a + 11 * h + 22 * l) / 451;
        mon = (h + l - 7 * m + 114) / 31;
        myMonth = MONTHS[mon - 1];
        myDay = ((h + l - 7 * m + 114) % 31) + 1;

        // Output the result
        System.out.println("Easter Sunday in " + myYear + " is/was "
                + myMonth + " " + myDay);

        // Close the scanner
        sc.close();
    }
}
