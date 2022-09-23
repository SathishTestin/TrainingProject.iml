package Day3;

import java.util.Scanner;

public class PrimeNumber {
//
// super power of class:
// class contains variables ,method, mainmethod,object
// one class to another class we using extends keyword
//we declare the class as a final class(){} we can't inherit
    public static void main(String[] args) {


        int count =0;
        Scanner sc = new Scanner(System.in); //scanner class collect the input from the user at runtime
        // scanner class present in Java.utill.package
        System.out.println("Enter the Number= ");
        int num = sc.nextInt(); //scanner class

        for (int i = 1; i<=num; i++) { //for loop
           
// For loop is repeating action
//for loop travel both forward and backward direction
// for is condition based one

            if (num % i == 0){ // if block is condition based one condition, true is this will execute otherwise wont
                count++;
        }
        }

        if (count==2) { // // if block is condition based one condition, true is this will execute otherwise wont

            System.out.println("The number = " +num + "is a prime number");
        } else {
            System.out.println("The number = " +num + "is a not prime number");

        }
    }
}
