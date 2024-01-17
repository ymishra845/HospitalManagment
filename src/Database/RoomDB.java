package Database;

import java.util.HashMap;

import Models.Rooms;

public class RoomDB {

    HashMap<String, Rooms> roomDB;

    public RoomDB() {
        this.roomDB = new HashMap<String, Rooms>();
    }

    public Rooms getUnoccupied() {
        for (String key : roomDB.keySet()) {
            Rooms room = roomDB.get(key);
            try {
                if (room != null && !room.isOccupied()) {
                    return room;
                }
            } catch (Exception e) {
                // Handle the exception, e.g., log or throw a custom exception
                e.printStackTrace();
            }
        }

        return null;
    }

    public int TotalRooms() {
        return roomDB.size();
    }

    public void addRoomToDB(Rooms room) {
        try {
            if (room != null) {
                String roomId = room.getRoomId();
                roomDB.put(roomId, room);
            } else {
                // Handle the case where the room is null, e.g., log or throw a custom exception
                System.out.println("Cannot add null room to the database.");
            }
        } catch (Exception e) {
            // Handle the exception, e.g., log or throw a custom exception
            e.printStackTrace();
        }
    }
}
