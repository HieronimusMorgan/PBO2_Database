/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOracle;

import java.awt.BorderLayout;
import model_RS.Dokter;
import model_RS.RumahSakit;
import view.TambahDokterDialog;

/**
 *
 * @author asus
 */
public class Coba {
    public static void main(String[] args) {
    Dokter dr1 = new Dokter("001", "Puspaningtyas");
    Dokter dr2 = new Dokter("004", "Budi");
    RumahSakit rs = new RumahSakit("Panti Rapih", "Yogyakarta");
        System.out.println(rs.isDokterExist(dr1));
        System.out.println(rs.isDokterExist(dr2));
    }
}
