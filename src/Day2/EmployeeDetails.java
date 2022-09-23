package Day2;

public class EmployeeDetails {

    //Method overloading
    // same class and same method arguments only different
    // super power of class:
    // one class to another class we using extends keyword
    //we declare the class as a final class(){} we can't overloas

    public void student(String name){ // method--->set of the action going to be done.
        

        System.out.println("Employee of the student = "+ name);
    }
    public void student(String Role, byte id){ // method--->set of the action done.

        System.out.println("Employee  studying = "+ Role);
        System.out.println("Employee  id card no is ="+ id);
    }

    public static void main(String[] args) { // main method--->java initialization start from main method
         //object is used for call the method
        // Java execution always start from main method
        EmployeeDetails ed = new EmployeeDetails();

        ed.student("Martin");
        ed.student("Senior dev engineer", (byte) 45);
    }
}
