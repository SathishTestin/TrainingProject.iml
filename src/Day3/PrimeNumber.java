package Day3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {


        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number= ");
        int num = sc.nextInt();

        for (int i = 1; i<=num; i++) {

            if (num % i == 0){
                count++;
        }
        }

        if (count==2) {

            System.out.println("The number = " +num + "is a prime number");
        } else {
            System.out.println("The number = " +num + "is a not prime number");

        }
    }
}