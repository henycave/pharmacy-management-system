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
public class drug {
	private String name;
        private float price;
	private int amountInPacks;
	private String expDate;
	private String company;
        private String sideEffect;
        private String howTo;
        private String info;
	public drug() {
		
	}
	public drug(String n,float p,int a,String e,String c,String s,String h,String i) {
		setInfo(n,p,a,e,c,s,h,i);
	}
	public void setInfo(String n,float p,int a,String e,String c,String s,String h,String i) {
		setName(n);
                setPrice(p);
		setAmountInPacks(a);
		setExpDate(e);
		setCompany(c);
                setSideEffect(s);
                setHowTo(h);
                setInfo(i);
	}
	public void setName(String n) {
		if(n.length()>20)
			name=n.substring(0,19);
		else
			name=n;
	}
        public void setPrice(float p){
            price = p;
        }
	public void setAmountInPacks(int a) {
		if(a<0) {
			amountInPacks=0;
		}
		else
			amountInPacks=a;
	}
	public void setExpDate(String e) {
		if(e.length()>15)
			expDate=e.substring(0,19);
		else
			expDate=e;
	}
	public void setCompany(String c) {
		if(c.length()>20)
			company=c.substring(0,19);
		else
			company=c;
	}
        public void setSideEffect(String s){
            sideEffect = s;
        }
        public void setHowTo(String h){
            howTo = h;
        }
        public void setInfo(String i){
            info = i;
        }
	public String getName() {
		return name;
	}
        public float getPrice(){
            return price;
        }
	public int getAmountInPacks() {
		return amountInPacks;
	}
	public String getExpDate() {
		return expDate;
	}
	public String getCompany() {
		return company;
	}
        public String getSideEffect(){
            return sideEffect;
        }
        public String getHowTo(){
            return howTo;
        }
        public String getInfo(){
            return info;
        }
	
	public void addDrugs(drug drugObj) {
		drugLinkedList list = new drugLinkedList();
                list.insert(drugObj);
	}
	

	
}

