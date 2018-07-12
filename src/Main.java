import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// Your 6 year old client needs an application that will receive an integer from the user banging on the keyboard,
// add 5 to it, double it, subtract 7 from it, and display the result to the screen.

        Scanner myScanner = new Scanner(System.in);

        int myNumber;
        int res;


        System.out.println("Enter a random number: ");
        myNumber = myScanner.nextInt();

        res= (myNumber+5) * 2 -7;

        System.out.println("New random number after magic math: " + res);

        myScanner.close();








    }
}
