package Database;

import java.util.HashMap;
import java.util.List;

import Models.Doctor;
import Models.Pateint;

public class DoctorDB {

	HashMap<String, Doctor> doctorDB;
	
	public DoctorDB(){
		this.doctorDB= new HashMap<String, Doctor>();
	}
	
	public Doctor minPateintDoctor() {
		
		Doctor mindoc=null;
		int min=Integer.MAX_VALUE;
		for(String key: doctorDB.keySet()) {
			Doctor doc=doctorDB.get(key);
			List<Pateint> pateintList=doc.getPateintlist();
			
			if(pateintList.size()<min) {
				mindoc=doc;
				min=pateintList.size();
			}
		}
		return mindoc;
	}
	
	public void addDoctorToDB(Doctor doctor) {
		String docId=doctor.getDocId();
		doctorDB.put(docId, doctor);
	}
	
	public int TotalDoctor() {
		return doctorDB.size();
	}
}
