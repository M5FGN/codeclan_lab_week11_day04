import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1, bedroom2, bedroom3, bedroom4, bedroom5;
    ConferenceRoom conference1, conference2;
    Guest guest1, guest2;

   @Before
    public void setUp(){
//       ArrayList<Bedroom> bedrooms = new ArrayList<Bedroom>();
//       ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<ConferenceRoom>();
       hotel = new Hotel();
       bedroom1 = new Bedroom(1, RoomType.SINGLE);
       bedroom2 = new Bedroom(2, RoomType.DOUBLE);

       conference1 = new ConferenceRoom("Purple", 10);
       conference2 = new ConferenceRoom("Blue", 5);

       guest1 = new Guest("Martin");
       guest2 = new Guest ("Mary");

       hotel.addBedroom(bedroom1);
       hotel.addBedroom(bedroom2);
       hotel.addConferenceRoom(conference1);
       hotel.addConferenceRoom(conference2);
   }

   // Bedrooms
   @Test
    public void checkHotelHasBedrooms(){
       assertEquals(2, hotel.countBedrooms());
   }

   @Test
    public void checkHotelCanRemoveBedroom(){
       hotel.removeBedroom(bedroom2);
       assertEquals(1, hotel.countBedrooms());
       // checking arraylist to ensure that bedroom2 is no longer there
       assertEquals(false, hotel.bedrooms.contains(bedroom2));
   }


   // Conference Rooms

    @Test
    public void checkHotelHasConferencerooms(){
        assertEquals(2, hotel.countConferenceRooms());
    }

    @Test
    public void checkHotelCanRemoveConferenceroom(){
        hotel.removeConferenceRoom(conference2);
        assertEquals(1, hotel.countConferenceRooms());
        // checking arraylist to ensure that conference2 is no longer there
        assertEquals(false, hotel.conferenceRooms.contains(conference2));
    }


    //Guests - Bedroom
    @Test
    public void canAddGuestToBedroom() {
       hotel.addToBedroom(bedroom1, guest1);
       assertEquals(1, bedroom1.getGuestCount());
       assertEquals(true, bedroom1.getGuests().contains(guest1));
    }

    @Test
    public void canRemoveGuestToBedroom() {
        hotel.addToBedroom(bedroom1, guest1);
        hotel.addToBedroom(bedroom1, guest2);
        hotel.removeFromBedroom(bedroom1, guest2);
        assertEquals(1, bedroom1.getGuestCount());
        assertEquals(false, bedroom1.getGuests().contains(guest2));
    }

    @Test
    public void canAddGuestToBedroom_OverCapacity() {
        hotel.addToBedroom(bedroom1, guest1);
        hotel.addToBedroom(bedroom1, guest2);
        assertEquals(1, bedroom1.getGuestCount());
        assertEquals(false, bedroom1.getGuests().contains(guest2));
    }

    // Guests - Conference Rooms

    @Test
    public void canAddGuestToConferenceRoom() {
        hotel.addToConfeneceRoom(conference2, guest1);
        assertEquals(1, conference2.getGuestCount());
        assertEquals(true, conference2.getGuests().contains(guest1));
    }

    @Test
    public void canRemoveGuestToConferenceRoom() {
        hotel.addToConfeneceRoom(conference2, guest1);
        hotel.addToConfeneceRoom(conference2, guest2);
        hotel.removeGuestFromConferenceRoom(conference2, guest2);
        assertEquals(1, conference2.getGuestCount());
        assertEquals(false, conference2.getGuests().contains(guest2));
    }

    @Test
    public void canAddGuestToConferenceRoom_overCapicity() {
        hotel.addToConfeneceRoom(conference2, guest1);
        hotel.addToConfeneceRoom(conference2, guest2);
        hotel.addToConfeneceRoom(conference2, guest1);
        hotel.addToConfeneceRoom(conference2, guest2);
        hotel.addToConfeneceRoom(conference2, guest1);
        hotel.addToConfeneceRoom(conference2, guest2);
        assertEquals(5, conference2.getGuestCount());
    }


}
