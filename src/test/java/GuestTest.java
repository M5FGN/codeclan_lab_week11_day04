import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;
    Guest guest2;

    @Before
    public void setup(){
        guest1 = new Guest("Martin");
        guest2 = new Guest ("Mary");
    }

    @Test
    public void getGuestName() {
        assertEquals("Martin", guest1.getName());
    }


}
