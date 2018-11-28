/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOracle;

import java.awt.BorderLayout;
import view.TambahDokterDialog;

/**
 *
 * @author asus
 */
public class Coba {
    public static void main(String[] args) {
        TambahDokterDialog tambahDokter = new TambahDokterDialog();
        tambahDokter.setVisible(true);
        tambahDokter.setSize(700, 500);
        // set Layout
        tambahDokter.setLayout(new BorderLayout());
    }
}
