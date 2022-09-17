package Day2;

import java.util.Scanner;

public class TshirtorderDetails {

    int quantity; // arguments & variable
    String colour; // arguments & variable
    char size; // arguments & variable
   static int totalquantity;

    public static Scanner sc = new Scanner(System.in);
    TshirtorderDetails(int count){ // parametrized constructor
        int add = 0;
        for (int i =0; i<count;){ // for loop

            int ordercount = sc.nextInt(); // scanner class
            String tshirtcolour = sc.next();
            char Tshirtsize = sc.next().charAt(0);

            add= i+ordercount;
            i=add;


            this.colour = colour;

            this.size = size;

            if (add<=50){

                System.out.println("Tshirt No.of pieces="+ ordercount + "Tshirt colour= "+ tshirtcolour + "Size of Tshirt = "+ Tshirtsize );
            }

            else {

                System.out.println("Order reached");
                i=add-ordercount;
            }

        }
        this.quantity= add;
    }

    public static void firstOrder(int totalquantity, String totalcolour, char totalsize) {

        System.out.println("First order = "+ totalquantity+ "T shirt colour= "+totalcolour+"Total size= "+ totalsize);

    }

    public void totalamount(){ // set of the action going to be done.

        int totalamount= totalquantity+quantity;
        System.out.println(quantity);
        System.out.println(totalquantity);
        System.out.println("Total amount of t shirt delivered"+totalamount);
        totalquantity=totalquantity;
    }




}
