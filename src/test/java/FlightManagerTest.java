import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private Plane plane;
    private FlightManager flightManager;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEINGSEVENFOURSEVEN);
        flightManager = new FlightManager(PlaneType.BOEINGSEVENFOURSEVEN);
    }

    @Test
    public void canGetReservedWeight() {
        assertEquals(500, flightManager.getReservedWeight());
    }
    @Test
    public void canGetBaggageWeightPerPerson() {
        assertEquals(50, flightManager.getBaggageWeightPerPerson());
    }
}


