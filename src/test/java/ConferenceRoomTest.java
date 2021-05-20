import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conference1;
    ConferenceRoom conference2;
    Guest guest;
    Hotel hotel;

    @Before
    public void before(){
        hotel = new Hotel();
        conference1 = new ConferenceRoom("Purple", 10);
        conference2 = new ConferenceRoom("Blue", 5);
    }

    @Test
    public void hasName() {
        assertEquals("Purple", conference1.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(5, conference2.getCapacity());
    }

}
