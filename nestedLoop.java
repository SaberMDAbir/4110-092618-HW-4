/*
MD Abir A. Choudhury
092618 - NestedLoop 
HW 4
Asks the user to enter an integer from 1 to 50. Displays an isosceles
triangle by printing rows of asterisks, 1 asterisk on the first row, 2 on
the second, etc., up to the number entered by the user. Then it
decreases the number of asterisks by one per line back down to just
one in the line printed.
*/

import java.util.*;

class nestedLoop{
    public static int errorCheck(int num) {
        Scanner S = new Scanner(System.in);
        if(num <= 0 || num > 50) {
            System.out.print("Please input a valid number: ");
            num = S.nextInt();
            errorCheck(num);
        }
        return num;
    }

    public static int printTriangle(int num) {
        num = errorCheck(num);

        // print top half of isoceles triangle
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // print bottom half of isoceles triangle 
        // which is a mirror of the top half minus one
        for(int i = num-1; i > 0; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter an integer from 1 to 50: ");
        int num = 0;
        // get user input for number between 1 and 50

        try{
            num = S.nextInt();
            printTriangle(num);
        }
        catch (InputMismatchException e) {
            num = errorCheck(num);
            printTriangle(num);
        }
    }
}