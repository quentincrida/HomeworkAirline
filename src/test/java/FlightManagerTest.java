import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private Plane plane;
    private FlightManager flightManager;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEINGSEVENFOURSEVEN);
        flightManager = new FlightManager(PlaneType.BOEINGSEVENFOURSEVEN);
    }

    @Test
    public void canGetBaggageWeightPerPerson(){
        //assertEquals(50, plane.getPlane().getBaggageWeightPerPerson();
        assertEquals(50, flightManager.getBaggageWeightPerPerson());
    }
}
