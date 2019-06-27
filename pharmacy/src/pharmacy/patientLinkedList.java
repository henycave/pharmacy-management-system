/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import javax.swing.JOptionPane;

/**
 *
 * @author noway
 */
public class patientLinkedList {
    static patientNode head;
    private static int counter;
    public int getCounter(){
        return counter;
    }
    
    public void insert(patient pat) {
		patientNode node = new patientNode();
		node.setPatient(pat);
                node.setId(counter);
		node.setNext(null);
		if(head==null) {
			head = node;
                        counter++;
		}
		else {
			patientNode temp = head;
			while(temp.getNext()!=null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
                        counter++;
		}
		 
		
	}
    
    public void deleteAt(int index) {
		patientNode node =head;
		patientNode temp;
		if(index == 0) {
			temp=head;
			head=head.getNext();
			temp=null;
                        counter--;
		}
		
		else {
			try {
		for(int i=0;i<index-1;i++) {
			node=node.getNext();
		}
		temp=node.getNext();
		node.setNext(temp.getNext());
		temp=null;
                counter--;
	}
		
		catch(Exception ex) {
			JOptionPane.showMessageDialog(null,"wrong index","pharmacy managemnt system",JOptionPane.OK_OPTION);
		}
		}
	}
    public void update(int index,patient pat){
        patientNode node = head;
            for(int i=0;i<index;i++){
            node=node.getNext();
        }
            node.setPatient(pat);
         
    }

    public patient searchList(String name){
        patientNode node = head;
        patient pat = null;
        if(counter<=0){
            pat = null;
        }
        else{
        for(int i=0;i<counter;i++){
            if(name.equalsIgnoreCase(node.getPatient().getName())){
                pat = node.getPatient();  
                break;
            }
            node=node.getNext();   
        }
        }
        return pat;

//System.out.println(node.getEmployee().getName());
    }
    public void display() {
		patientNode temp = head;
		while(temp.getNext()!=null) {
			System.out.println(temp.getPatient().getName());
			temp=temp.getNext();
		}
		System.out.println(temp.getPatient().getName());
	}
}
