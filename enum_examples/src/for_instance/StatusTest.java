package for_instance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.List;

public class StatusTest {

    @Test
    void pizzaStatusTest(){
        List<Pizza> pizzaList = Main.givenPizzaOrders_whenGroupByStatusCalled_thenCorrectlyGrouped();
        EnumMap<PizzaStatus, List<Pizza>> map = Pizza.groupPizzaByStatus(pizzaList);
        Assertions.assertEquals(1, map.get(PizzaStatus.DELIVERED).size());
        Assertions.assertEquals(2, map.get(PizzaStatus.ORDERED).size());
        Assertions.assertEquals(1, map.get(PizzaStatus.READY).size());

    }

}
