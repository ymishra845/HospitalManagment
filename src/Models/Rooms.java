package Models;

public class Rooms {

	private String roomId;
	private boolean occupied;
	Pateint pateint;
	Doctor doctor;
	public Rooms(String roomId, boolean occupied, Pateint pateint, Doctor doctor) {
		super();
		this.roomId = roomId;
		this.occupied = occupied;
		this.pateint = pateint;
		this.doctor = doctor;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public boolean isOccupied() {
		return occupied;
	}
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	public Pateint getPateint() {
		return pateint;
	}
	public void setPateint(Pateint pateint) {
		this.pateint = pateint;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
}
