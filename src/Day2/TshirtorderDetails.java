package Day2;

import java.util.Scanner;

public class TshirtorderDetails {

    int quantity;
    String colour;
    char size;
   static int totalquantity;

    public static Scanner sc = new Scanner(System.in);
    TshirtorderDetails(int count){
        int add = 0;
        for (int i =0; i<count;){

            int ordercount = sc.nextInt();
            String tshirtcolour = sc.next();
            char Tshirtsize = sc.next().charAt('0');

            add= i+ordercount;
            i=add;


            this.colour = colour;

            this.size = size;

            System.out.println("Tshirt No.of pieces="+ quantity + "Tshirt colour= "+ colour + "Size of Tshirt = "+colour );

        }
        this.quantity= add;
    }

    public static void firstOrder(int totalquantity, String totalcolour, char totalsize) {

        System.out.println("First order = "+ totalquantity+ "T shirt colour= "+totalcolour+"Total size= "+ totalsize);

    }

    public void totalamount(){

        int totalamount= totalquantity+quantity;
        System.out.println(quantity);
        System.out.println(totalquantity);
        System.out.println("Total amount of t shirt delivered"+totalamount);
        totalquantity=totalquantity;
    }




}
