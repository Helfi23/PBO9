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
public class Katak {
   int umur;
   String nama;

   public Katak(int umur, String nama) {
      this.umur = umur;
      this.nama = nama;
   }
   public int getUmur() {
      return umur;
   }
   public String getNama() {
      return nama;
   }
   public String caraBegerak() {
      return "Melompat";
   }
}
