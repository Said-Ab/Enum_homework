public class Main {
    public static void main(String[] args) {
        double distance = 150;

        double carCost = Transport.CAR.calculateTravelDistance(distance);
        double busCost = Transport.BUS.calculateTravelDistance(distance);
        double truckCost = Transport.TRUCK.calculateTravelDistance(distance);

        System.out.println("CAR travel cost for " + distance + " km: $" + carCost);
        System.out.println("BUS travel cost for " + distance + " km: $" + busCost);
        System.out.println("TRUCK travel cost for " + distance + " km: $" + truckCost);
    }
}