package Models;

import java.util.List;

import Database.DoctorDB;
import Database.PateintDB;
import Database.RoomDB;
import Services.PateintService;
import Services.PateintServiceimpl;
import factory.HospitalObjectFactory;

public class Hospital {

	private String name;
	private String address;
	private long phone;
	private String email;
	private PateintDB pateintDB;
	private DoctorDB doctorDB;
	private RoomDB roomDB;
	
	private PateintService pateintService;
	private HospitalObjectFactory hospitalObjectFactory;
	
	public Hospital(String name, String address, long phone, String email) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.hospitalObjectFactory= new HospitalObjectFactory();
		this.pateintService=new PateintServiceimpl(this.pateintDB);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void admitPateint(String name,int age,long phone,String email,String gender, String disease) {
		
		//pateint will provide detail
		//Know hospital will assign doctor to pateint
		//hospital assign room
		//hospital will create Id of the pateint;
		//then with all detail we will create pateint object and store in our DataBase
		
		//1. generate Id for the pateint
		int totalPateint=pateintDB.getTotalPateint()+1;
		String pId="PID"+totalPateint;
		
		//2.Get the doctor who is handling minimum pateint
		Doctor doctor= doctorDB.minPateintDoctor();
		
		
		//3. get the empty room
		Rooms room= roomDB.getUnoccupied();
		room.setOccupied(true);
		
		Pateint p= new Pateint(pId, name, age, phone, email, disease, gender, doctor, room, true);
		doctor.pateintlist.add(p);
		
		System.out.println("Pateint got admitted successfully"+p);
		
		
		
	}
	
	public void createRoom() {
		int total=roomDB.TotalRooms()+1;
		String roomId="ROOMID"+total;
		Rooms room= new Rooms(roomId, true, null, null);
		
		roomDB.addRoomToDB(room);
		room.setOccupied(true);
		System.out.println("Room is assigned successfully"+ room);
	}
	
	public void appointDoctor(String docId, String docDegree, String name, long phone,List<Pateint> pateintlist) {
		String DocId="DOCID"+(doctorDB.TotalDoctor()+1);
		Doctor doc= new Doctor(DocId,docDegree,name,phone, pateintlist);
		
		doctorDB.addDoctorToDB(doc);
		System.out.println("Doctor assigned successfully"+ doc);
	}
}
