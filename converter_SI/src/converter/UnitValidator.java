package converter;

public class UnitValidator extends Validator<String> {
    @Override
    boolean isValid(String s) {
        switch (s.toLowerCase()) {
            case "mm" -> {
                return true;
            }
            case "cm" -> {
                return true;
            }
            case "dm" -> {
                return true;
            }
            case "m" -> {
                return true;
            }
            case "km" -> {
                return true;
            }
            case "yard" -> {
                return true;
            }
            case "feet" -> {
                return true;
            }
            case "mile" -> {
                return true;
            }
            default -> System.out.println("This isn't SI length unit.");

        }
        return false;
    }
}
