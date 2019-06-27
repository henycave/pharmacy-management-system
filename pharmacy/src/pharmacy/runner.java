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
public class runner {
    public static void main(String args[]){
        employee emp = new employee("heny");
        employee emp1 = new employee("sol");
        employee emp2 = new employee("melak");
        employee emp5 = new employee("noway");
        employeeLinkedList list = new employeeLinkedList();
        list.insert(emp);
        list.insert(emp1);
        list.insert(emp2);
        //list.searchUpdate(1, "noway", null, null, 0, null, null, null, 0, 0);
        list.display();
        System.out.println("-----------");
       //System.out.println(list.searchList("").getName());
       // list.searchUpdate(1, "noway", null, null, 0, null, null, null, 0, 0);
       //list.update(1,emp5); 
      // list.display();
      String name = "heny";
      String c = "";
      if(name.equalsIgnoreCase(c)){
          System.out.println("equal");
      }
      else
          System.out.println("not equal");
       
    }
}
