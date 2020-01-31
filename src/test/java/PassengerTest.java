import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before

    public void before(){
        passenger = new Passenger("Liliana Crida", 3);
    }

    @Test

    public void canGetPassengerName(){
        assertEquals("Liliana Crida", passenger.getName());
    }
    @Test
    public void canGetPassengerNumberOfBags(){
        assertEquals(3, passenger.getNumberOfBags());
    }

}
