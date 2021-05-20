import java.util.ArrayList;

public abstract class Room {

    //private int capacity;
    private ArrayList<Guest> guests;

    public Room() {
//        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

//    public int getCapacity() {
//        return capacity;
//    }

//    public void setCapacity(int capacity) {
//        this.capacity = capacity;
//    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public int getGuestCount(){
        return guests.size();
    }


}
