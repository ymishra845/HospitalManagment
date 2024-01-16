package Database;
import Models.Pateint;

import java.util.HashMap;

public class PateintDB {
	
	HashMap<String, Pateint> pateintDB;
	public PateintDB(){
		this.pateintDB=new HashMap<>();
	}
	
	public void addPateint(Pateint obj) {
		
       String pId= obj.getpId();
       pateintDB.put(pId, obj);
	}
	
	public int getTotalPateint() {
		return pateintDB.size();
	}
	public Pateint getPateint(String pId) {
		return pateintDB.get(pId);
	}

}
