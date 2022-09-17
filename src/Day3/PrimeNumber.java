package Day3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {


        int count =0;
        Scanner sc = new Scanner(System.in); //scanner class
        System.out.println("Enter the Number= ");
        int num = sc.nextInt(); //scanner class

        for (int i = 1; i<=num; i++) { //for loop

            if (num % i == 0){ // if condition
                count++;
        }
        }

        if (count==2) { // if condition

            System.out.println("The number = " +num + "is a prime number");
        } else {
            System.out.println("The number = " +num + "is a not prime number");

        }
    }
}