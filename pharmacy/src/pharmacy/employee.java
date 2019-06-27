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
public class employee {
	private String name;
	private String id;
	private String position;
	private int salary;
	private String workDays;
	public address addr;
	public employee() {
		
	}
        public employee(String name){
           setName(name);
        }
	public employee(String n, String i, String p, int s,String w,address addr) {
		setInfo(n,i,p,s,w,addr);
	}
	public void setInfo(String n,String i,String p,int s,String w,address addr) {
		this.addr=addr;
		setName(n);
		setId(i);
		setPosition(p);
		setSalary(s);
		setWorkDays(w);
	}
	public void setName(String n)
	{
		if(n.length()>20)
			name=n.substring(0,19);
		else
			name=n;
	}
	public void setId(String i)
	{
		if(i.length()>10)
			id=i.substring(0,9);
		else
			id=i;
	}
	public void setPosition(String p)
	{
		if(p.length()>20)
			position=p.substring(0,19);
		else
			position=p;
	}
	public void setSalary(int s)
	{
		if(s<0)
			salary=0;
		else
			salary=s;
	}
	public void setWorkDays(String w)
	{
		if(w.length()>100)
			workDays=w.substring(0,19);
		else
			workDays=w;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getpostion() {
		return position;
	}
	public int getSalary() {
		return salary;
	}
	public String getWorkDays() {
		return workDays;
	}
	public void addEmployee(employee emp) {
		employeeLinkedList list = new employeeLinkedList();
                list.insert(emp);
		
	}
	
	
}

