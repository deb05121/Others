package for_instance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PatternTest {
    @Test
    public void givenPizzaOrder_whenDelivered_thenPizzaGetsDeliveredAndStatusChanges() {
        Pizza pz = new Pizza();

        pz.setStatus(PizzaStatus.READY);
        pz.deliver();
        Assertions.assertTrue(pz.getStatus() == PizzaStatus.DELIVERED);
    }
}
