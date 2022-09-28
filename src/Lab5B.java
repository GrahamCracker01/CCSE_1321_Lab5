//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab5B {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int intInput;

        //output 1, input 1, math
        System.out.println("Enter an integer: ");
        intInput = scan.nextInt();

        //if statement to determine output 2
        if ((intInput % 2) == 0) {
            System.out.println("This number is divisible by 2");
        }
        else if ((intInput % 3) == 0) {
            System.out.println("This number is divisible by 3");
        }
        else if ((intInput % 5) == 0) {
            System.out.println("This number is divisible by 5");
        }
        else {
            System.out.println("This number is undetermined");
        }

    }
}