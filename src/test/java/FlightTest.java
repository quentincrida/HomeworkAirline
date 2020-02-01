import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Plane plane;
    private Flight flight;
    private Passenger passenger;
    private Passenger passenger2;


    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEINGSEVENFOURSEVEN);
        flight = new Flight(plane, "BA123","CPT", "GLA", "06:00" );
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


    @Test
    public void canGetRemainingCapacity(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger2);

        assertEquals(8, this.flight.getRemainingCapacity());
    }

}