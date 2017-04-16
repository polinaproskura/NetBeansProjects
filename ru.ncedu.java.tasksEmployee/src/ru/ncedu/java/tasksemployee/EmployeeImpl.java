/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.ncedu.java.tasks;


public class EmployeeImpl implements Employee {
    String firstName;
    String lastName;
    int Salary;
    Employee Manager;
    
    public EmployeeImpl() {
        firstName = "no";
        lastName = "no";
        Salary = 1000;
        Manager = null;
    }
    
    @Override
    public int getSalary(){
        return Salary;
    }
    
    @Override
    public void increaseSalary(int value){
        Salary = Salary + value;
    }
    
    @Override
    public String getFirstName(){
        return firstName;
    }
    
    @Override
    public void setFirstName(String firstName_){
        firstName = firstName_;
    }
    
    @Override
    public String getLastName(){
        return lastName;
    }
    
    @Override
    public void setLastName(String lastName_){
        lastName = lastName_;
    }
    
    @Override
    public String getFullName(){
        return firstName + " " + lastName;
    }
    
    @Override
    public void setManager(Employee manager){
            Manager = manager;
    }
    
    @Override
    public String getManagerName(){
        if (Manager != null){
            return Manager.getFullName();
        } else {
            return "No manager";
        }
    }
    
    @Override
    public Employee getTopManager(){
        if (Manager == null){
            return this;
        } else {
            return Manager.getTopManager();
        }
    }
}
