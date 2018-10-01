/*
MD Abir A. Choudhury
092618 - HWStrings
HW 4
A character double occurs when the same character occurs twice in a
row, such as the "mm" in "programming". Note the character could
be a symbol, such as "--" or "!!". For example, the words below all
contain character doubles: Hello, good, x++, follow…
Write a full Java program that counts the number of character doubles
in a phrase entered by the user. The output should look like the
example below.
Enter phrase: Follow Programming Concepts!!
Output: There are 3-character doubles.
You do not have to worry about detecting upper vs. lower-case
letters, nor do you have to handle the case when a character occurs
three times or more in a row
*/

    import java.io.*;
    import java.util.*;
    import java.lang.String;

    public class hwStrings {
        public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        // Get User Input
        System.out.print("Enter a sentence: ");
        String userInput = S.nextLine();
        
        int counter = 0;
        for(int i = 1; i < userInput.length(); i++) {
            int temp = i - 1;
            if(userInput.charAt(i) == userInput.charAt(temp)) {
                counter++;
            }
        }
        System.out.println("There are " + counter + "-character doubles in your sentence.");
    }
} 