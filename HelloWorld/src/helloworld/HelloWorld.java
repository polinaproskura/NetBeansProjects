/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author Poly
 */
import java.util.Scanner;
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b[] = new int[10];
        int max = 0;
        for (int i = 0; i < 10; i++){
            b[i] = scn.nextInt();
            if (b[i] > max)
                max = b[i];
        }
        System.out.println(max);
        System.out.println("Hello, World!"); 
        // TODO code application logic here
    }
    
}
