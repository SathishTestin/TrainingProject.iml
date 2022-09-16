package Day3;

public class Pyramid {

    public static void main(String[] args) {

        int row=5;

        for (int i=1; i<=row;i++){

            // for spaces
            for (int j=0;j<(row-i); j++){
                System.out.println(" ");
            }

            for (int k=0; k<(i*2-1); k++){
                System.out.println(" * ");
            }

        }
    }
}
