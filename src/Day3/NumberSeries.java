package Day3;

public class NumberSeries // 
//// super power of class:
// one class to another class we using extends keyword
//we declare the class as a final class(){} we can't inherit{
    static int a = 7;

    public static void main(String[] args)
    ////static method is first execution
//we declare public static ----> we call the method as global
 //static block exection start from when object was created
{

        if (a % 2 == 0) {

            System.out.println("This is even number");
        } else {
            System.out.println("This is odd Number");

        }


    }
}
