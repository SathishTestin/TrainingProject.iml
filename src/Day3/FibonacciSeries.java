package Day3;

public class FibonacciSeries {

    public static void main(String[] args) {

        int a1=0; //initialization declaration
        int a2=1; //initialization declaration
        int a3; //initialization declaration

        for (int i=2; i<=10; i++){ //for loop
            a3 =a1+a2;

            a1=a2;
        a2=a3;

            System.out.println(a3);
        }






    }
}
