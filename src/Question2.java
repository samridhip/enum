public class Question2 {
    public enum weekend{
        SATURDAY,
        SUNDAY,
    }
    public static void main(String[]args){
        weekend day1= weekend.SATURDAY;
        weekend day2= weekend.SUNDAY;

        System.out.println("days in weekend are "+day1+" and "+day2);
    }
}
