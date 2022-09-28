//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Lab5C {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int intX;
        int intY;

        //output 1, input
        System.out.print("Enter x: ");
        intX = scan.nextInt();
        System.out.print("Enter y: ");
        intY = scan.nextInt();

        //if statement determining output
        if (intX == 0 && intY == 0) {
            System.out.println("This point is the origin.");
        }
        else if (intX != 0 && intY == 0) {
            System.out.println("This point is on the x axis.");
        }
        else if (intY != 0 && intX == 0) {
            System.out.println("This point is on the y axis.");
        }
        else if (intX > 0 && intY > 0) {
            System.out.println("This point is in the first quadrant.");
        }
        else if (intX < 0 && intY > 0) {
            System.out.println("This point is in the second quadrant.");
        }
        else if (intX < 0 && intY < 0) {
            System.out.println("This point is in the third quadrant.");
        }
        else if (intX > 0 && intY < 0) {
            System.out.println("This point is in the fourth quadrant.");
        }

    }
}