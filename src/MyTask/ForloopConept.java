package MyTask;

public class ForloopConept {
// super power of class:
// class contains variables ,method, mainmethod,object
// one class to another class we using extends keyword
//we declare the class as a final class(){} we can't inherit
    public static void main(String[] args) {
//// For loop is repeating action
//for loop travel both forward and backward direction
// for is condition based one
//        for(int i=0; i<3; i++){
//
//            for(int j =0; j<4; j++){
//
//                System.out.println(j);
//            }
//            System.out.println(i);
//
//        }

        for (int i = 0; i <= 5; i++) {//// For loop is repeating action
//for loop travel both forward and backward direction
// for is condition based one

           // System.out.print(" ");

            for (int j=0; j<=i; j++){//// For loop is repeating action
//for loop travel both forward and backward direction
// for is condition based one

                System.out.print("#");
            }
            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {//// For loop is repeating action
//for loop travel both forward and backward direction
// for is condition based one
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }



        }

        for (int i = 1; i <= 3; i++) {//// For loop is repeating action
//for loop travel both forward and backward direction
// for is condition based one
            for (int j = i + 1; j <= 3; j++) {
                System.out.println(j);
            }
            System.out.println();
        }

    }
}
