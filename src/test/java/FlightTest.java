import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Passenger passenger;
    private Passenger passenger2;


    @Before
    public void before(){
        flight = new Flight(plane, "BA123","CPT", "GLA", "06:00" );
        plane = new Plane(PlaneType.BOEINGSEVENFOURSEVEN);
        passenger = new Passenger("John Smith", 2);
        passenger2 = new Passenger("Mary Jones", 1);

    }

    @Test
    public void canAddOnePassengerToFlight(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengerCount());
    }
    @Test
    public void canAddMultiplePassengers() {
        flight.addPassenger(passenger);
        flight.addPassenger(passenger2);
        assertEquals(2, flight.getPassengerCount());
    }
    @Test
    public void canGetPlane(){
        assertEquals((PlaneType.BOEINGSEVENFOURSEVEN), plane.getPlane());
    }
    @Test
    public void canGetFlightNumber(){
        assertEquals("BA123", flight.getFlightNumber());
    }
    @Test
    public void canGetFlightDestination(){
        assertEquals("CPT", flight.getDestination());
    }
    @Test
    public void canGetDepartureAirport(){
        assertEquals("GLA", flight.getDepartureAirport());
    }
    @Test
    public void canGetDepartureTime(){
        assertEquals("06:00", flight.getDepartureTime());
    }

//passengerCount +=1 = capacity -= 1

    @Test
    public void canGetRemainingCapacity(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger2);
        plane.getPlane().getPlaneCapacity() - flight.getPassengerCount();
        assertEquals(8, flight.getRemainingCapacity());
    }

}