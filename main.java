package movePoint;

public class main {
    public static void main(String[] args) {
        MoveAblePoint moveAblePoint =new MoveAblePoint(0.1f,0.2f,0.3f,0.4f);
        moveAblePoint.move();
        System.out.println(moveAblePoint.toString());
    }
}
