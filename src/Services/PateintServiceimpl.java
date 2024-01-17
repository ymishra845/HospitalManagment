package Services;

import Database.PateintDB;
import Models.Doctor;
import Models.Pateint;
import Models.Rooms;
import factory.HospitalObjectFactory;

public class PateintServiceimpl implements PateintService {

	
	HospitalObjectFactory hospitalObjectFactory;
	
	public PateintDB pateintDB;
	public PateintServiceimpl(PateintDB pateintDB) {
		// TODO Auto-generated constructor stub
		this.pateintDB=hospitalObjectFactory.getPateintDB();
	}
	@Override
	public Pateint getPateintById(String pId) {
		// TODO Auto-generated method stub
		return pateintDB.getPateint(pId);
		
	}

	@Override
	public Rooms getPateintBedDetails(String pId) {
		// TODO Auto-generated method stub
		return pateintDB.getPateint(pId).getRoom();
	}


}
