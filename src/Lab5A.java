//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab5A {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        char charFirst;
        char charSecond;

        //first output and get input
        System.out.print("Do you have a driving permit (Y/N)? ");
        charFirst = scan.next().charAt(0);

        //if statement determining second output
        if (charFirst == 'N' || charFirst == 'n') {
            System.out.println("Driving permit is a prerequisite to purchase a vehicle!");
        }
        else if (charFirst == 'Y' || charFirst == 'y') {
            System.out.println("Do you have a commercial driving license (Y/N)? ");
            charSecond = scan.next().charAt(0);

            //second if statement determining output
            if (charSecond == 'N' || charSecond == 'n') {
                System.out.println("Commercial driving license is a prerequisite to purchase a vehicle!");
            }
            else if (charSecond == 'Y' || charSecond == 'y') {
                System.out.println("Congratulations! You can purchase a vehicle, let's start talking options!");
            }
        }

    }
}