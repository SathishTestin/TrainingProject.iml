package Day2;

public class PrintingDetails extends TshirtorderDetails {

    // extends keyword used for one class method calling without object creation
    // class to class ----> using extends keyword


    PrintingDetails(int count) { // parametrized constructor
        super(count);
    }
    static  { // if we declare as a static ---> we do not object
        System.out.println("We have deliver 100 Tshirt");
    }
    public static void main (String[]args){ // main method

        PrintingDetails pd = new PrintingDetails(50);
        TshirtorderDetails.firstOrder(50,"Blue",'M');
        pd.totalamount();

    }

}
