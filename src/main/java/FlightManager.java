
public class FlightManager {



    private PlaneType plane;

    public FlightManager(PlaneType plane){
        this.plane = plane;
//        this.reservedWeight;
//        this.baggageWeightPerPerson;

    }


    public int getReservedWeight(){
        int reservedWeight = PlaneType.BOEINGSEVENFOURSEVEN.getTotalWeight() / 2;
        return reservedWeight;
    }

//baggageWeightPerPerson = (totalWeight/2) / capacity

    public int getBaggageWeightPerPerson(){
       int baggageWeightPerPerson = this.getReservedWeight() / PlaneType.BOEINGSEVENFOURSEVEN.getPlaneCapacity();
        return baggageWeightPerPerson;

    }


}



