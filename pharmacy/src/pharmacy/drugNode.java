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
public class drugNode {
    private drug dr;
    private drugNode next;
    private int id;
    
    public void setDrug(drug dr){
        this.dr=dr;
    }
    public drug getDrug(){
        return dr;
    }
    public void setNext(drugNode next){
        this.next=next;
    }
    public drugNode getNext(){
        return next;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
}
