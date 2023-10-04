public class MembershipTester {
    public static void main(String[] args) {
        Membership membership = new Membership("Kitty", 5);
        System.out.println("Membership name: " + membership.getName());
        System.out.println("Remaining visits: " + membership.getRemainingVisits());
        System.out.println("Membership valid: " + membership.isValid());
        System.out.println("Top-up success: " + membership.topUp(3));
        System.out.println("Remaining visits: " + membership.getRemainingVisits());
        System.out.println("Charge success: " + membership.charge());
        System.out.println("Remaining visits: " + membership.getRemainingVisits());
    }
}
