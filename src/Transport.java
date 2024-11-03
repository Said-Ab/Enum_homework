public enum Transport {
    CAR(0.1),
    BUS(0.05),
    TRUCK(0.02);
    private final double kmCost;
    Transport(double kmCost){
        this.kmCost=kmCost;
    }
    public double calculateTravelDistance(double distance){
        return distance*kmCost;
    }
}
