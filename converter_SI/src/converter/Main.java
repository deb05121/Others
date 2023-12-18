package converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for (SILengthConverter siLengthConverter : SILengthConverter.values()) {
            System.out.println(siLengthConverter.getUnit());
        }
        ;
        System.out.println("\nYou should choose a unit as basic");
        Scanner scanner = new Scanner(System.in);
        String basicUnit = scanner.nextLine();
        UnitValidator unitValidator = new UnitValidator();
        if (unitValidator.isValid(basicUnit)) {
            System.out.println("\nYou should give the rate now: ");
            double rateOfUser = scanner.nextDouble();
            printConversationResult(basicUnit, rateOfUser);
        }
    }

    private static void printConversationResult(String unit, double rate) {

        for (SILengthConverter sILengthConverter : SILengthConverter.values()) {
            System.out.printf("%.1f %s%s %.5f %s \n", rate, unit, " = ", sILengthConverter.convert(getSIUnit(unit), rate), sILengthConverter.getUnit());
        }
    }


    private static SILengthConverter getSIUnit(String basicUnit) {
        switch (basicUnit.toLowerCase()) {
            case "m" -> {
                return SILengthConverter.M;
            }
            case "mm" -> {
                return SILengthConverter.MM;
            }
            case "cm" -> {
                return SILengthConverter.CM;
            }
            case "dm" -> {
                return SILengthConverter.DM;
            }
            case "km" -> {
                return SILengthConverter.KM;
            }
            case "feet" -> {
                return SILengthConverter.FEET;
            }
            case "yard" -> {
                return SILengthConverter.YARD;
            }
            case "mile" -> {
                return SILengthConverter.MILE;
            }
        }
        return null;
    }
}

