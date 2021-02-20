/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119081.muhammadelzaabiezal.pkg3;

import java.util.Scanner;

/**
 *
 * @author Elza Abiezal
 * Nama: Muhammad Elza Abiezal
 * NIM: 10119081
 * Kelas: IF2
 */
public class IF210119081MUHAMMADELZAABIEZAL3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dewasa;
        int umur = 0;
        
        Scanner n = new Scanner(System.in);
        
        System.out.println("Masukan Umur Anda : ");
        umur = n.nextInt();
        
        if (umur >=17){
            dewasa = "true";
        }
        else{
            dewasa = "false";
        }
        
        System.out.println("Status Dewasa : : " +dewasa);
    }
    
}
