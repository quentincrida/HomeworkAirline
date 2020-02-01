import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber,
                  String destination, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }




    public int getPassengerCount(){
        return this.passengers.size();
    }
    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }
//
//    public Plane getPlane() {
//        return plane;
//    }
//
//    public String getFlightNumber() {
//        return flightNumber;
//    }
//
//    public String getDestination() {
//        return destination;
//    }
//
//    public String getDepartureAirport() {
//        return departureAirport;
//    }
//
//    public String getDepartureTime() {
//        return departureTime;
//    }
}
