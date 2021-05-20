//import jdk.nashorn.internal.codegen.ConstantData;

import java.util.ArrayList;

public class Hotel {

    public ArrayList<Bedroom> bedrooms;
    public ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

//    public void addGuest() {
//
//    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public int countBedrooms() {
        return this.bedrooms.size();
    }

    public void removeBedroom(Bedroom bedroom) {
        this.bedrooms.remove(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conference) {
        this.conferenceRooms.add(conference);
    }

    public void removeConferenceRoom(ConferenceRoom conference) {
        this.conferenceRooms.remove(conference);
    }

    public int countConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void addToBedroom(Bedroom bedroom, Guest guest) {
        if (bedroom.getGuestCount() < bedroom.getCapacity()) {
            bedroom.getGuests().add(guest);
        }
    }

    public void removeFromBedroom(Bedroom bedroom, Guest guest) {
        bedroom.getGuests().remove(guest);

    }

    public void addToConfeneceRoom(ConferenceRoom conference, Guest guest) {
        if (conference.getGuestCount() < conference.getCapacity()) {
            conference.getGuests().add(guest);
        }
    }

    public void removeGuestFromConferenceRoom(ConferenceRoom conference, Guest guest) {
        conference.getGuests().remove(guest);

    }
}
