/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5601;

/**
 *
 * @author Arlya Dewi
 * tgl ; 26-04-2025
 */
public class Pertemuan5601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        buah apel = new buah();
        apel.warna = "ungu";
        apel.SetRasa("manis"); 
        
        System.out.printf("warna apel diset %s\n",apel.warna);
        System.out.printf("rasa apel diset %s\n",apel.getRasa());
        
        buah anggur = new buah();
        anggur.warna = "merah";
        anggur.SetRasa("manis");
        
        System.out.printf("warna anggur diset %s\n",anggur.warna);
        System.out.printf("rasa anggur diset %s\n",anggur.getRasa());
        
    }
    
}

class buah{
   public String warna;
   private String rasa; 

   public void SetRasa(String txRasa){
       this.rasa = txRasa;
       
    }
   public String getRasa(){
       return this.rasa;
   }
}