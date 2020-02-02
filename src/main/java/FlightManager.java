
public class FlightManager {




//    private Plane plane;
//
//    public FlightManager(Plane plane){
//        this.plane = plane;
//
//    }

//baggageWeightPerPerson = (totalWeight/2) / capacity

    public int getBaggageWeightPerPerson(reservedWeight, planeType.totalWeight, planeType.capacity){
        reservedWeight = planeType.totalWeight / 2;
        baggageWeightPerPerson = reservedWeight / planeType.capacity;
    }
        return baggageWeightPerPerson;


}



