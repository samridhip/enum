public class Question4 {
    public enum direction{
        NORTH,
        SOUTH,
        EAST,
        WEST,
    }
    public static void main(String[]args){
        direction alaska=direction.NORTH;
        direction nigeria=direction.SOUTH;
        direction usa=direction.WEST;
        direction japan=direction.EAST;
        System.out.println("direction of alaska is "+alaska);
        System.out.println("direction of nigeria is "+nigeria);
        System.out.println("direction of usa is "+usa);
        System.out.println("direction of japan is "+japan);
    }
}
