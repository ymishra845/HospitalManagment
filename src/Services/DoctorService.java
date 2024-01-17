package Services;

import java.util.List;

import Models.Doctor;
import Models.Pateint;

public interface DoctorService {

	public List<Pateint> getAllPateintDetails();
	
	public Doctor getDoctorDetails(String docId);
	
	public String curePateint(String docId,String pId);
}
