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
public class Pegawai {
    public String nama;
    private final int gaji;

    public Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public int infoGaji() {

        return gaji;
    }
}
