/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.edu.java.tasks1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Poly
 */
public class ComNetcrackerEduJavaTasks1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComplexNumberImpl A = new ComplexNumberImpl();
        ComplexNumberImpl B = new ComplexNumberImpl();
        A.set("3+1i");
        B.set(3, 2);
        System.out.println(A.equals(B));
    }
}