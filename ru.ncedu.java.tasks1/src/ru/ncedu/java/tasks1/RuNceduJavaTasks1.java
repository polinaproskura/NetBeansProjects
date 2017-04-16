/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.ncedu.java.tasks1;

/**
 *
 * @author Poly
 */
public class RuNceduJavaTasks1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] arr = new double[10];
        for (int i = 0; i < 10; i++){
            arr[i] = (double) i;
        }
        ArrayVector A = new ArrayVectorImpl(arr);
        ArrayVector B = new ArrayVectorImpl(arr);
        B = A.clone();
        System.out.println(A);
        for (int i = 0; i < 10; i++){
            System.out.println(A.get(i));
        }
        for (int i = 0; i < 10; i++){
            System.out.println(B.get(i));
        }
        for (int i = 0; i < 10; i++){
            arr[i] = arr[i] + 1;
        }
        A.get(23);
        A.set(arr);
        for (int i = 0; i < 10; i++){
            System.out.println(A.get(i));
        }
    }
    
}
