class Pen { 
  String color;
  String type;

  public void write(){
    System.out.println("Pen has " + this.color + " color & " + this.type + " type.");
  }
} 

class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        System.out.println("Constructor");
    }
    Student(String n, int a){
        name=n;
        age=a;
    }
}

class App { 
  public static void main(String args[]) {
    Student g=new Student();
    Student h=new Student("L", 20);
    g.name="Gauri";
    g.age=20;
    g.printInfo(); 
    h.printInfo(); 
  }
}
