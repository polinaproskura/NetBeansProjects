/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.edu.java.tasks;

/**
 *
 * @author Poly
 */
public class ZeroTaskImpl implements ZeroTask{
    private int integerValue = 0;

    @Override
    public void setIntegerValue(int value) {
        integerValue = value;
    }
    //private int integerValue = 0;
	/**
	 * Sets the value of a field of the class.
	 */
	//If you define the field integerValue like commented above, then implementation of this method will be as follows:
	//	integerValue = value;

    @Override
    public double getDoubleValue() {
        return integerValue;
    }
    public ZeroTaskImpl(){}
}

