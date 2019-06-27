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
public class drugLinkedList {
    static drugNode head;
    private static int counter;
    
    public int getCounter(){
        return counter;
    }
    
    public void insert(drug dr) {
		drugNode node = new drugNode();
		node.setDrug(dr);
                node.setId(counter);
		node.setNext(null);
		if(head==null) {
			head = node;
                        counter++;
		}
		else {
			drugNode temp = head;
			while(temp.getNext()!=null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
                        counter++;
		}
		 
		
	}
    public void update(int index,drug dr){
            drugNode node = head;
            for(int i=0;i<index;i++){
            node=node.getNext();
        }
            node.setDrug(dr);
         
    
    }
    public drug searchList(String name){
        drugNode node = head;
        drug dr = null;
        if(counter<=0){
            dr = null;
        }
        else{
            for(int i=0;i<counter;i++){
                if(name.equalsIgnoreCase(node.getDrug().getName())){
                    dr = node.getDrug();  
                    break;
                }
                node=node.getNext();   
            }
        }
        return dr;
    }
    public void deleteAt(int index) {
		drugNode node =head;
		drugNode temp;
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
    public void display() {
		drugNode temp = head;
		while(temp.getNext()!=null) {
			System.out.println(temp.getDrug().getName());
			temp=temp.getNext();
		}
		System.out.println(temp.getDrug().getName());
	}
}
