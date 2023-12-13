public class Question3 {
    public enum shapes{
        CIRCLE,
        RECTANGULAR,
        SQUARE,
        HEXAGON,
        TRIANGLE,
    }
    public static void main(String[]args){
        shapes first=shapes.CIRCLE;
        shapes second=shapes.HEXAGON;
        shapes third=shapes.SQUARE;
        shapes fourth=shapes.TRIANGLE;
        shapes fifth=shapes.RECTANGULAR;
        System.out.println("first shape is "+first);
    }
}
