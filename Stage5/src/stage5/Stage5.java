/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stage5;
import java.util.Scanner;

/**
 *
 * @author Poly
 */
public class Stage5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int len = scn.nextInt();
        int []c;
        c = new int[len];
        for (int i = 0; i < len; i++) { // возвращает истинну если с потока ввода можно считать целое число
            c[i] = scn.nextInt();
        }
        int []a;
        a = new int[len];
        for (int i = 0; i < len; i++){
            a[i] = scn.nextInt();
        }
        int[] b;
        b = new int[len];
        for (int i = 0; i < len; i++){
            b[i] = a[i] + c[i];
        }
        System.out.println(b);
        // TODO code application logic here
    }
    
}
