package for_instance;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class Pizza {

    private PizzaStatus status;

    public Pizza() {

    }

    public Pizza(PizzaStatus status) {
        this.status = status;
    }

    public PizzaStatus getStatus() {
        return status;
    }

    public void setStatus(PizzaStatus status) {
        this.status = status;
    }

    public void deliver() {
        if (isDeliverable()) {
            PizzaDeliverySystemConfiguration.getInstance().getDeliveryStrategy().deliver(this);
            this.setStatus(PizzaStatus.DELIVERED);
        }
    }

    public boolean isDeliverable() {
        return this.status.isReady();
    }

    public void printTimeToDeliver() {
        System.out.println("Time to delivery is " +
                this.getStatus().getTimeToDelivery() + " days");
    }

    public static EnumMap<PizzaStatus, List<Pizza>> groupPizzaByStatus(List<Pizza> pizzaList) {
        EnumMap<PizzaStatus, List<Pizza>> pzByStatus = new EnumMap<>(PizzaStatus.class);

        for (Pizza pz : pizzaList) {
            PizzaStatus status = pz.getStatus();
            if (pzByStatus.containsKey(status)) {
                pzByStatus.get(status).add(pz);
            } else {
                List<Pizza> newPzList = new ArrayList<>();
                newPzList.add(pz);
                pzByStatus.put(status, newPzList);
            }
        }
        return pzByStatus;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "status=" + status +
                '}';
    }
}
