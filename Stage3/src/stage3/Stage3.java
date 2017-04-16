/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stage3;
import java.util.Scanner;
/**
 *
 * @author Poly
 */
public class Stage3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int counter = 0;
        String myStr;
        myStr = scn.nextLine();
        String c;
        c = scn.nextLine();
        for (int j = 0; j < c.length(); j++){
            counter = 0;
            if (c.charAt(j) != ' '){
                for (int i = 0; i < myStr.length(); i++){
                    if (c.charAt(j) == myStr.charAt(i))
                        counter++;
                }
                System.out.print(c.charAt(j) + "=");
                System.out.println(counter);
            }
        // TODO code application logic here
        }
    }
    
}
