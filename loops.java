/*
MD Abir A. Choudhury
092818 - Loops
Write a Java program which reads 20 decimal numbers into an array from the user 
and then prints out the value of each and every number which has a value that is 
greater than or equal to 18.75
*/

import java.util.*;
import java.lang.String;

class loops {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        double[] userNum = new double[20];
        for(int i = 0; i < 20; i++) {
            System.out.print("Enter a number: ");
            userNum[i] = S.nextDouble();
        }
        
        for(int i = 0; i < 20; i++) {
            if(userNum[i] >= 18.75) {
                System.out.println(userNum[i] + " is greater than or equal to 18.75");
            }
        }
    }
}