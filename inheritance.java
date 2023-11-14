import java.util.*;
import bank;

class Shape {
    String color;
    public void area(){
        System.out.println("Display Area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h){
        System.out.println((0.5)*l*h);
    }
}

class EquiTriang extends Triangle {
    public void area(int l, int h){
        System.out.println((0.5)*h*l);
    }
}

class Circle extends Shape {
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Triangle t=new Triangle();
        t.area(10, 6);
        EquiTriang e=new EquiTriang();
        e.area(10, 6);
        Circle c=new Circle();
        c.area(3);
        // import bank
        bank.Account account1=new bank.Account();
        account1.name="cust1";
    }
}
