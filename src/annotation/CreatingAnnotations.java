package annotation;
@VeryImp
class Cat{
    String name;
    int age;
    public Cat(String name){this.name=name;}
    public void meow(){System.out.println("Meow");}
    public void eat(){System.out.println("Munch");}

}

public class CreatingAnnotations {
    public static void main(String[] args) {
        Cat myCat=new Cat("Stella");
        if(myCat.getClass().isAnnotationPresent(VeryImp.class)){
            System.out.println("This is very important");
        }
        else{
            System.out.println("This is not very important");
        }
    }
}
