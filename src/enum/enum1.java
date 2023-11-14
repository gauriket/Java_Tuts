enum dotw {
    SUNDAY, MONDAY, TUESDAY , WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class enum1 {
    public static void main(String[] args) {
        dotw day=dotw.FRIDAY;
        if(day==dotw.FRIDAY){
            System.out.println("YAY its the weekend");
        }
    }
}
