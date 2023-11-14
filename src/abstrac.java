abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("Animal eats");
    }
}

interface Anim{
    void walk();
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walks with 4 legs");
    }
}

class Hrse implements Anim{
    public void walk(){
        System.out.println("Walks with 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks with 2 legs");
    }
}

public class abstrac {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
        horse.eat();
    }
}
