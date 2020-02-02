import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Plane plane;
    private Flight flight;
    private Passenger passenger;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;
    private Passenger passenger6;
    private Passenger passenger7;
    private Passenger passenger8;
    private Passenger passenger9;
    private Passenger passenger10;
    private Passenger passenger11;


    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEINGSEVENFOURSEVEN);
        flight = new Flight(plane, "BA123","CPT", "GLA", "06:00" );
        passenger = new Passenger("John Smith", 2);
        passenger2 = new Passenger("Mary Jones", 1);
        passenger3 = new Passenger("AP Jones", 1);
        passenger4 = new Passenger("Jack Jones", 1);
        passenger5 = new Passenger("Joe Jones", 1);
        passenger6 = new Passenger("Sally Jones", 1);
        passenger7 = new Passenger("Josie Jones", 1);
        passenger8 = new Passenger("Tom Jones", 1);
        passenger9 = new Passenger("Tiny Jones", 1);
        passenger10 = new Passenger("Lofty Jones", 1);
        passenger11 = new Passenger("Basil Fawlty", 1);


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
    @Test
    public void canAddPassengerTrue(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        flight.addPassenger(passenger6);
        flight.addPassenger(passenger7);
        flight.addPassenger(passenger8);
        flight.addPassenger(passenger9);
        assertEquals(true, this.flight.canAddPassenger());
        System.out.println("Yes, we have space for you!");
    }
    @Test
    public void canAddPassengerFalse(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        flight.addPassenger(passenger6);
        flight.addPassenger(passenger7);
        flight.addPassenger(passenger8);
        flight.addPassenger(passenger9);
        flight.addPassenger(passenger10);
        flight.addPassenger(passenger11);

        assertEquals(false, this.flight.canAddPassenger());
        System.out.println("Sorry, please wait for the next available flight.");
    }

}