package Models;

public class Pateint {

	private String pId;
	private String name;
	private int age;
	private long phone;
	private String email;
	private String desease;
	private String gender;
	private Doctor doctor;
	private Rooms room;
	public Pateint(String pId, String name, int age, long phone, String email, String desease, String gender,Doctor doctor,Rooms room) {
		super();
		this.pId = pId;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.desease = desease;
		this.gender = gender;
		this.doctor=doctor;
		this.room=room;
	}
	public Rooms getRoom() {
		return room;
	}
	public void setRoom(Rooms room) {
		this.room = room;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public String getDesease() {
		return desease;
	}
	public void setDesease(String desease) {
		this.desease = desease;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
