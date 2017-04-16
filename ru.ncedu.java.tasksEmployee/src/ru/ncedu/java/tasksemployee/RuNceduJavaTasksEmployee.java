/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.ncedu.java.tasksemployee;

/**
 *
 * @author Poly
 */
public class RuNceduJavaTasksEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee object = new EmployeeImpl();
        object.setFirstName("Zero");
        object.setLastName("Null");
        Employee object1 = new EmployeeImpl();
        object1.setFirstName("One");
        object1.setLastName("Uno");
        Employee object2 = new EmployeeImpl();
        object2.setFirstName("Two");
        object2.setLastName("Duo");
        object.setManager(object1);
        object1.setManager(object2);
        System.out.println(object1.getFullName());
        System.out.println("Top manager - " + (object.getTopManager()).getFullName());
        System.out.println("Manager - " + object.getManagerName());
        // TODO code application logic here
    }
    
}
