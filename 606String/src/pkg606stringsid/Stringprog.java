//Name and intent and stuff
package pkg606stringsid;
import java.util.Scanner;
import java.util.Date;

public class Stringprog {

    public static void main(String[] args) {
        //initialize all variables
        Scanner reader = new Scanner(System.in);
        String fullName = new String();
        String firstName = new String();
        String midName = new String();
        String lastName = new String();
        int space1, space2;
        int length;
        Date today = new Date();
        //ask and take name
        System.out.println("What is your name?");
        fullName = reader.nextLine();
        //split full name into first middle and last names
        space1 = fullName.indexOf(' ');
        space2 = fullName.indexOf(' ', space1 + 1);
        
        firstName = fullName.substring(0, space1);
        midName = fullName.substring(space1 + 1, space2);
        lastName = fullName.substring(space2 + 1, fullName.length());
        //find and print total length - spaces
        length = firstName.length() + midName.length() + lastName.length();
        System.out.println("The number of letters in your name is: " + length);
        //Print initials
        System.out.println("Your initials are: " + firstName.charAt(0) + midName.charAt(0) + lastName.charAt(0));
        //Print reordered name
        System.out.println("With last name first, your name is: " + lastName + ", " + firstName + " " + midName);
        //ending documentation
        System.out.println("Project 606: The String Program");
        System.out.println();
        System.out.println(today);
        
    }
}
