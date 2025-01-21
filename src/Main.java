import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // creating a loop that will keep going until user decides to quit program
        boolean end = false;
        while(!end){
            System.out.println("Hello!  Welcome to the project! \n Want to play? Yes or no?  ");

            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();
            if (answer.equalsIgnoreCase("yes")){
                System.out.println(" Awesome! ");
            }
            else if (answer.equalsIgnoreCase("no")){
                System.out.println(" Got it!  See ya! ");
                end = true;
            }
            else {
                System.out.println(" Sorry?  I didn't get what you said. ");
            }

        }

        System.out.println(" Thanks for playing; come back soon! ");

    }
}