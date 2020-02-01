import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Passenger passenger;


    @Before
    public void before(){
        flight = new Flight(PlaneType, "BA123","CPT", "GLA", "06:00" );
        plane = new Plane(PlaneType.BOEINGSEVENFOURSEVEN);
        passenger = new Passenger("John Smith", 2);

    }

    @Test
    public void canAddOnePassengerToFlight(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengerCount());
    }
//    @Test
//    public void canAddOnePassengerToFlight(){
//        flight.addPassenger(passenger);
//        assertEquals(1, getPassengerCount(); )
//    }

}
