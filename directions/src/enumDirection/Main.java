package enumDirection;

public class Main {
    public static void main(String[] args) {
        Direction[] values = Direction.values();
        for( Direction direction : values ) {
            System.out.println(direction);
            System.out.println(direction.getName());
            System.out.println(direction.getCode());
            System.out.println(direction.getDirectionName() + "\n");
        }
    }
}
