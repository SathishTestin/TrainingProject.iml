package HackerRank;

 class Animal {
     void walk(){
        System.out.println("I am walking");
    }
}
class Bird extends Animal {
     void fly(){
        System.out.println("I am flying");
    }
    public static void main(String[] args) {
        Bird bd =new Bird();
        bd.walk();
        bd.fly();
    }
}
