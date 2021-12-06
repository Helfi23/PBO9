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
public class Kecebong extends Katak {
   double panjangEkor;

   public Kecebong(int umur, String nama, double panjangEkor) {
      super(umur, nama);
      this.panjangEkor = panjangEkor;
   }
   public double getPanjangEkor() {
      return panjangEkor;
   }
   @Override
   public int getUmur() {
      return super.getUmur();
   }
   @Override
   public String getNama() {
      return super.getNama();
   }
   @Override
   public String caraBegerak() {
      return "Berenang";
   }
}
