/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo9;

/**
 *
 * @author Helfi Apriliyandi F
 */
//Contoh Overriding
public class TesTugas2 {
   public static void main(String[] args) {
      Katak O1 = new Katak(5, "Froggy");
      Kecebong O2 = new Kecebong(2, "Junior Frog", 10);

      System.out.println("Obyek  umur  nama        panjangEkor caraBergerak");
      System.out.println("O1     "+ O1.getUmur()+"     "+ O1.getNama()+ " " + "                  " + O1.caraBegerak());
      System.out.println("O2     "+ O2.getUmur()+"     "+ O2.getNama()+ " " + O2.getPanjangEkor()+ "         "+ O2.caraBegerak());
   }
}
