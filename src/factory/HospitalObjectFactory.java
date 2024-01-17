package factory;

import Database.DoctorDB;
import Database.PateintDB;
import Database.RoomDB;

public class HospitalObjectFactory {

	PateintDB pateintDB;
	DoctorDB doctorDB;
	RoomDB roomDB;
	
	public HospitalObjectFactory() {
		// TODO Auto-generated constructor stub
		
		pateintDB= new PateintDB();
		doctorDB= new DoctorDB();
		roomDB= new RoomDB();
		
	}

	public PateintDB getPateintDB() {
		return pateintDB;
	}

	public void setPateintDB(PateintDB pateintDB) {
		this.pateintDB = pateintDB;
	}

	public DoctorDB getDoctorDB() {
		return doctorDB;
	}

	public void setDoctorDB(DoctorDB doctorDB) {
		this.doctorDB = doctorDB;
	}

	public RoomDB getRoomDB() {
		return roomDB;
	}

	public void setRoomDB(RoomDB roomDB) {
		this.roomDB = roomDB;
	}
}
