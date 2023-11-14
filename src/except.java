public class except {
    public static void main(String[] args) {
        try{
            int mI=Integer.parseInt("pants");

        }
        catch(Exception e){
            System.out.println("It's an int not a string");
        }
        System.out.println("End");
    }
}
