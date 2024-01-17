package Services;

import Models.Doctor;
import Models.Pateint;
import Models.Rooms;

public interface PateintService {
	public Pateint getPateintById(String pId);
	public Rooms getPateintBedDetails(String pId);
	

}
