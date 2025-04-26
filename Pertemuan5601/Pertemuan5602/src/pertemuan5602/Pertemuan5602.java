/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5602;

import java.util.Scanner;

/**
 *
 * @author LAB F
 */
public class Pertemuan5602 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner insi= new Scanner(System.in);
        
        System.out.print("Nilai Sisi: ");
        int nsisi = insi.nextInt();
        
        LuasPersegi LP = new LuasPersegi(nsisi);
        //LP.sisi = 15;
        
        System.out.printf("Hitung Luas Persegi\n");
        System.out.printf("Luas = sisi x sisi\n");
        System.out.printf("     = %d x %d\n", nsisi,nsisi );
        System.out.printf("     = %d\n", LP.HL());
    }
    
}
