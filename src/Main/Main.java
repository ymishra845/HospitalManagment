package Main;

import Models.Hospital;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hospital h= new Hospital("XYX","XYZ",123,"XYZ");
		h.appointDoctor("123", "MBBS", "Yogesh", 99107, null);
		h.createRoom();

	}

}
