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
public class patientNode {
    private patient pat;
    private patientNode next;
    private int id;
    
    public void setPatient(patient pat){
        this.pat=pat;
    }
    public patient getPatient(){
        return pat;
    }
    public void setNext(patientNode next){
        this.next=next;
    }
    public patientNode getNext(){
        return next;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
}
