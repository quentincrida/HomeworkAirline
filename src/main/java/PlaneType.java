public enum PlaneType {

    BOEINGSEVENFOURSEVEN(10, 1000);

    private final int capacity;
    private final int totalWeight;


    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
