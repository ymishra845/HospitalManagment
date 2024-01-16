package Models;

public class Pateint {

	private String pId;
	private String name;
	private int age;
	private long phone;
	private String email;
	private String disease;
	private String gender;
	private Doctor doctor;
	private Rooms room;
	boolean isAdmit;
	public Pateint(String pId, String name, int age, long phone, String email, String disease, String gender,Doctor doctor,Rooms room,boolean isAdmit) {
		super();
		this.pId = pId;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.disease = disease;
		this.gender = gender;
		this.doctor=doctor;
		this.room=room;
		this.isAdmit=isAdmit;
	}
	@Override
	public String toString() {
		return "Pateint [pId=" + pId + ", name=" + name + ", age=" + age + ", phone=" + phone + ", email=" + email
				+ ", disease=" + disease + ", gender=" + gender + ", doctor=" + doctor + ", room=" + room + ", isAdmit="
				+ isAdmit + "]";
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
	public String getDisease() {
		return disease;
	}
	public void setDesease(String disease) {
		this.disease = disease;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
