/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

/**
 *
 * @author noway
 */
public class address {
	private String phoneNumber;
	private String email;
	private int kebele;
	private int homeNumber;
	public address(String p,String e,int k,int h) {
		setAddInfo(p,e,k,h);
	}
	public void setAddInfo(String p,String e,int k,int h) {
		setPhoneNumber(p);
		setEmail(e);
		setKebele(k);
		setHomeNumber(h);
	}
	public void setPhoneNumber(String p) {
		if(p.length()>11)
			phoneNumber=p.substring(0,9);
		else
			phoneNumber=p;
	}
	public void setEmail(String e) {
		if(e.length()>20)
			email=e.substring(0,19);
		else
			email=e;
	}
	public void setKebele(int k) {
		if(k<0)
			kebele=0;
		else
			kebele=k;	
	}
	public void setHomeNumber(int h) {
		if(h<0)
			homeNumber=0;
		else
			homeNumber=h;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public int getKebele() {
		return kebele;
	}
	public int getHomeNumber() {
		return homeNumber;
	}
	public void display() {
		System.out.println("phone number : "+phoneNumber);
		System.out.println("email : "+email);
		System.out.println("kebele : "+kebele);
		System.out.println("home number : "+homeNumber);
	}
}
