package Day3;

public class Pyramid {

    public static void main(String[] args) {

        int row=5; //initialization declaration
        int num =1; //initialization declaration

        for (int i=1; i<=row;i++){ //for loop

            // for spaces
            for (int j=4;j>=i; j--){ //for loop
                System.out.print(" ");
            }

            for (int k=1; k<=num; k++){ //for loop
                System.out.print("*");
            }
            System.out.println();
            num=num+2;
        }

    }
}
