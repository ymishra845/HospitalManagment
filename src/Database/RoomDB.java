package Database;

import java.util.HashMap;

import Models.Rooms;

public class RoomDB {

	HashMap<String, Rooms> roomDB;
	
	RoomDB(){
		this.roomDB= new HashMap<String, Rooms>();
	}
	
}
