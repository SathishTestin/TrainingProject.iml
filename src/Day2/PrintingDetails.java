package Day2;

public class PrintingDetails extends TshirtorderDetails {

   // super power of class:
    // one class to another class we using extends keyword
    //we declare the class as a final class(){} we can't inherit


    PrintingDetails(int count) { // parametrized constructor
        super(count); // super keyword using to call method in class level
    }
    static  { // if we declare as a static ---> we do not create object
        //static method is first execution
        //we declare public static ----> we call the method as global
        //static block exection start from when object was created
        System.out.println("We have deliver 100 Tshirt");
    }
    public static void main (String[]args){ // main method---> Java execution always start from main method

        PrintingDetails pd = new PrintingDetails(50); // object is using call method
        // object give memory allocation
        TshirtorderDetails.firstOrder(50,"Blue",'M');
        pd.totalamount(); // pd object reference// totalamount is a methos

    }

}
