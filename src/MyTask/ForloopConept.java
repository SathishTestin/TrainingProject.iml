package MyTask;

public class ForloopConept {

    public static void main(String[] args) {

//        for(int i=0; i<3; i++){
//
//            for(int j =0; j<4; j++){
//
//                System.out.println(j);
//            }
//            System.out.println(i);
//
//        }

        for (int i = 0; i <= 5; i++) {

           // System.out.print(" ");

            for (int j=0; j<=i; j++){

                System.out.print("#");
            }
            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }



        }

        for (int i = 1; i <= 3; i++) {
            for (int j = i + 1; j <= 3; j++) {
                System.out.println(j);
            }
            System.out.println();
        }

    }
}