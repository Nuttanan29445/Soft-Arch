import java.util.*;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    public Set<HealthcareServiceable> mem;

    HealthcareWorkerTeam() {
        this.mem = new LinkedHashSet<HealthcareServiceable>();
    }

    public void addMember(HealthcareServiceable healthcareServiceable) {
        this.mem.add(healthcareServiceable);
    }

    public void removeMember(HealthcareServiceable healthcareServiceable) {
        this.mem.remove(healthcareServiceable);
    }

    public void service() {
        for (HealthcareServiceable healthcareServiceable : mem) {
            healthcareServiceable.service();
        }
    }

    public double getPrice() {
        double totalPrice = 0;
        for (HealthcareServiceable healthcareServiceable : mem) {
            totalPrice += healthcareServiceable.getPrice();
        }
        return totalPrice;
    }
}
