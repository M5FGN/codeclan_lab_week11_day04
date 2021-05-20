import jdk.jfr.internal.consumer.RecordingInput;

import java.util.ArrayList;



public class Bedroom extends Room {

    private int roomNum;
    private RoomType roomType;

    public Bedroom(int roomNum, RoomType roomType) {
        this.roomNum = roomNum;
        this.roomType = roomType;
    }

    public int getCapacity() {
        return roomType.getCapacity();
    }

    public int getGuestBedroomCount(){
        return getGuestCount();
    }



}
