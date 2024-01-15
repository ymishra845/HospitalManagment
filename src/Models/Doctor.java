package Models;

import java.util.ArrayList;
import java.util.List;

public class Doctor {

	private String docId;
	private String docDegree;
	private String name;
	private long phone;
	
	List<Pateint> pateintlist;
	public Doctor(String docId, String docDegree, String name, long phone,List<Pateint> pateintlist) {
		super();
		this.docId = docId;
		this.docDegree = docDegree;
		this.name = name;
		this.phone = phone;
		this.pateintlist=new ArrayList<>();
	}
	public List<Pateint> getPateintlist() {
		return pateintlist;
	}
	public void setPateintlist(List<Pateint> pateintlist) {
		this.pateintlist = pateintlist;
	}
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public String getDocDegree() {
		return docDegree;
	}
	public void setDocDegree(String docDegree) {
		this.docDegree = docDegree;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
}
