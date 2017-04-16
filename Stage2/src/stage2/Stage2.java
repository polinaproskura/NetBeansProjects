/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stage2;

/**
 *
 * @author Poly
 */
import java.util.Scanner;
public class Stage2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myStr;
        Scanner scn = new Scanner(System.in);
        myStr = scn.nextLine();
        String[] S = myStr.split(" ");
        String temp;
        System.out.println(S.length);
        for (int j = 0; j < S.length - 1; j++){
            for (int i = 0; i < S.length - 1; i++){
                if (S[i].length() > S[i + 1].length()){
                    temp = S[i];
                    S[i] = S[i + 1];
                    S[i + 1] = temp;
                }
            }
        }
        for(int i = 0; i < S.length; i++){
            System.out.println(S[i]);
        }
        // TODO code application logic here
    }
    
}
