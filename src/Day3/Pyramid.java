package Day3;

public class Pyramid {
// super power of class:
// class contains variables ,method, mainmethod,object
// one class to another class we using extends keyword
//we declare the class as a final class(){} we can't inherit
    
    public static void main(String[] args) {

        int row=5; //initialization declaration
        int num =1; //initialization declaration

        for (int i=1; i<=row;i++){ //for loop

// For loop is repeating action
//for loop travel both forward and backward direction
// for is condition based one
            // for spaces
            for (int j=4;j>=i; j--){ //
// For loop is repeating action
//for loop travel both forward and backward direction
// for is condition based one
                System.out.print(" ");
            }

            for (int k=1; k<=num; k++){ //
// For loop is repeating action
//for loop travel both forward and backward direction
// for is condition based one
                System.out.print("*");
            }
            System.out.println();
            num=num+2;
        }

    }
}
