/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.util.Date;

/**
 *
 * @author noway
 */
public class patient {
	private String name;
	private String id;
	private String patientCase;
	private String drug;
	private String date;
        private String perscribedBy;
	public address addr;
	public patient() {
		
	}
	public patient(String n, String i, String p,String dr,String per,address addr) {
		setInfo(n,i,p,dr,per,addr);
                date = new Date().toLocaleString();
	}
	public void setInfo(String n, String i, String p,String dr, String per,address addr)
	{
		this.addr = addr;
		setName(n);
		setId(i);
		setPatientCase(p);
		setDrug(dr);
                setPerscribedBy(per);
	}
	public void setName(String n) {
		if(n.length()>20)
			name=n.substring(0,19);
		else
			name=n;
	}
	public void setId(String i) {
		if(i.length()>10)
			id=i.substring(0,9);
		else
			id=i;
	}
	public void setPatientCase(String p) {
		if(p.length()>60)
			patientCase=p.substring(0,59);
		else
			patientCase=p;
	}
	public void setDrug(String dr) {
		if(dr.length()>30)
			drug=dr.substring(0,29);
		else
			drug=dr;
	}
        public void setPerscribedBy(String per){
            perscribedBy=per;
        }
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getPatientCase() {
		return patientCase;
	}
	public String getDrug() {
		return drug;
	}
	public String  getDate() {
		return date;
	}
        public String getPerscribedBy(){
            return perscribedBy;
        }

	
	public void addPatient(patient pat) {
		patientLinkedList list = new patientLinkedList();
                list.insert(pat);
		
	}
	
	
}
