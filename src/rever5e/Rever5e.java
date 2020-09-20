/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rever5e;

/**
 *
 * @author encep
 */
public class Rever5e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String S = "Katak a";

        String S1 = solution(S);
        System.out.println(S1);
    }
    
    static String solution(String S) {
        String[] Arry;

        Arry = S.split("");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Arry.length; i++) {
            Arry[i] = reverse(Arry[i]);
            sb.append(Arry[i]);
        }

        return sb.toString();
    }

    static String reverse(String str) {
        String reverse = "";

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + str.charAt(i);

        return reverse;
    }
    
}
