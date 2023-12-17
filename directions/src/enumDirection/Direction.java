package enumDirection;

public enum Direction {
    UP("fel", 0),
    DOWN("le", 1),
    RIGHT("jobbra", 2) {
        @Override
        public String getDirectionName() {
            return "This is right.";
        }
    },
    LEFT("balra", 3);

    private final String name;
    private final int code;

    Direction(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public String getDirectionName() {
        return "Any";
    }
}