package for_instance;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pizza> pzList = givenPizzaOrders_whenGroupByStatusCalled_thenCorrectlyGrouped();
        EnumMap<PizzaStatus, List<Pizza>> map = Pizza.groupPizzaByStatus(pzList);
        for (PizzaStatus key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }

    public static List<Pizza> givenPizzaOrders_whenGroupByStatusCalled_thenCorrectlyGrouped() {  //instantiation
        List<Pizza> pzList = new ArrayList<>();
        Pizza pz1 = new Pizza();
        System.out.println("the first pizza as default: " + pz1);
        pz1.setStatus(PizzaStatus.DELIVERED);
        System.out.println("the first pizza then set: " + pz1);

        Pizza pz2 = new Pizza(PizzaStatus.ORDERED);

        Pizza pz4 = new Pizza(PizzaStatus.READY);

        Pizza pz3 = new Pizza(PizzaStatus.ORDERED);
        pzList.add(pz1);
        pzList.add(pz2);
        pzList.add(pz3);
        pzList.add(pz4);

        System.out.println();
        System.out.println("Default delivery strategy: " + PizzaDeliverySystemConfiguration.INSTANCE.getDeliveryStrategy());
        //new PizzaDeliverySystemConfiguration();
        PizzaDeliverySystemConfiguration.INSTANCE.setDeliveryStrategy(PizzaDeliveryStrategy.EXPRESS);
        System.out.println("Delivery strategy then set: " + PizzaDeliverySystemConfiguration.INSTANCE.getDeliveryStrategy());
        System.out.println();
        return pzList;
    }
}
