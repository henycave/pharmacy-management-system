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
public class employeeNode {
    private employee emp;
    private employeeNode next;
    private int id;
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setEmployee(employee emp){
        this.emp=emp;
    }
    public employee getEmployee(){
        return emp;
    }
    public void setNext(employeeNode next){
        this.next=next;
    }
    public employeeNode getNext(){
        return next;
    }
}
