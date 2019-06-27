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
public class employeeLinkedList {
    static employeeNode head;
    private static int counter;
    
    public int getCounter(){
        return counter;
    }
    
    
    public void insert(employee emp) {
		employeeNode node = new employeeNode();
		node.setEmployee(emp);
                node.setId(counter);
		node.setNext(null);
		if(head==null) {
			head = node;
                        counter++;
		}
		else {
			employeeNode temp = head;
			while(temp.getNext()!=null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
                        counter++;
		}
		 
		
	}
    public void deleteAt(int index) {
		employeeNode node =head;
		employeeNode temp;
                
		if(index == 0) {
			temp=head;
			head=head.getNext();
			temp=null;
                        counter--;
		}
		else {
			//try {
		for(int i=0;i<index-1;i++) {
			node=node.getNext();
		}
		temp=node.getNext();
		node.setNext(temp.getNext());
		temp=null;
                counter--;
	//}
		
		//catch(Exception ex) {
		//	JOptionPane.showMessageDialog(null,"wrong index","pharmacy managemnt system",JOptionPane.OK_OPTION);
		//}
		}
	}
    public void update(int index,employee emp){
        employeeNode node = head;
            for(int i=0;i<index;i++){
            node=node.getNext();
        }
            node.setEmployee(emp);
         
    }

    public employee searchList(String name){
        employeeNode node = head;
        employee emp = null;
        if(counter<=0){
            emp = null;
        }
        else{
        for(int i=0;i<counter;i++){
            if(name.equalsIgnoreCase(node.getEmployee().getName())){
                emp = node.getEmployee();  
                break;
            }
            node=node.getNext();   
        }
        }
        return emp;

//System.out.println(node.getEmployee().getName());
    }
    
    public void display() {
		employeeNode temp = head;
		while(temp.getNext()!=null) {
			System.out.println(temp.getEmployee().getName());
			temp=temp.getNext();
		}
		System.out.println(temp.getEmployee().getName());
	}
}
