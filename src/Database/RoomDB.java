package Database;

import java.util.HashMap;

import Models.Rooms;

public class RoomDB {

	HashMap<String, Rooms> roomDB;
	
	public RoomDB(){
		this.roomDB= new HashMap<String, Rooms>();
	}
	
	public Rooms getUnoccupied() {
		for(String key :roomDB.keySet()) {
			Rooms room=roomDB.get(key);
			if(room.isOccupied()==false) {
				return room;
			}
		}
		return null;
	}
	
	
	public int TotalRooms() {
		return roomDB.size();
	}
	
	public void addRoomToDB(Rooms room) {
		String roomId=room.getRoomId();
		roomDB.put(roomId, room);
	}

}

	
