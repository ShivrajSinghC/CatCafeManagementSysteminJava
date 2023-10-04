public class Membership {
    private String name;
    private int remainingVisits;
    
    public Membership(String name, int visits) {
        this.name = name;
        if (visits > 0) {
            this.remainingVisits = visits;
        } else {
            this.remainingVisits = 0;
        }
    }
    
    public String getName() {
        return name;
    }
    
    public int getRemainingVisits() {
        return remainingVisits;
    }
    
    public boolean isValid() {
        return remainingVisits > 0;
    }
    
    public boolean topUp(int additionalVisits) {
        if (additionalVisits >= 0) {
            remainingVisits += additionalVisits;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean charge() {
        if (isValid()) {
            remainingVisits--;
            return true;
        } else {
            return false;
        }
    }
}
