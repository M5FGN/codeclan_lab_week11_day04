import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;
    Hotel hotel;

    @Before
    public void setUp(){
//        ArrayList<Guest> guests = new ArrayList<Guest>();
        bedroom = new Bedroom(1, RoomType.DOUBLE);
    }

    @Test
    public void checkRoomEmpty(){
        assertEquals(0, bedroom.getGuestBedroomCount());
    }

//    @Test
//    public void addGuest(){
//        hotel.addGuest();
//        assertEquals(1, bedroom.getGuestBedroomCount());
//    }


}
