import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PlaneTest {

    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEINGSEVENFOURSEVEN);
    }

    @Test
    public void canGetPlane() {
        assertEquals(PlaneType.BOEINGSEVENFOURSEVEN, plane.getPlane());
    }

}