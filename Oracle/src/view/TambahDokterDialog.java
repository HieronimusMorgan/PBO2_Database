/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model_RS.Dokter;
import model_RS.RumahSakit;

/**
 *
 * @author user only
 */
public class TambahDokterDialog extends JDialog {

    private RumahSakit rumahSakit;
    private JLabel tambahDokterLabel;
    private JLabel idDokterLabel;
    private JTextField idDokterText;
    private JLabel namaDokterLabel;
    private JTextField namaDokterText;
    private JButton tambahButton;
    private MyDokterDialog owner;

    public TambahDokterDialog(MyDokterDialog owner, RumahSakit rs) {
        super(owner);
        this.owner = owner;
        rumahSakit = rs;
        init();
    }

    public TambahDokterDialog() {
        init();
    }

    /**
     * Fungsi untuk inisialisasi
     */
    public void init() {
        // set size
        setSize(400, 300);
        // set layout
        setLayout(null);
        // tambah Tombol Tambah
        tambahButton = new JButton("Tambah");
        tambahButton.setBounds(50, 200, 100, 30);
        add(tambahButton);
        // set action listener button
        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahDokter();
            }
        });
        namaDokterLabel = new JLabel("Nama Dokter");
        namaDokterLabel.setBounds(50, 25, 100, 10);
        add(namaDokterLabel);

        namaDokterText = new JTextField();
        namaDokterText.setBounds(200, 50, 100, 20);
        add(namaDokterText);

        idDokterLabel = new JLabel("ID Dokter");
        idDokterLabel.setBounds(50, 75, 100, 10);
        add(idDokterLabel);

        idDokterText = new JTextField();
        idDokterText.setBounds(200, 100, 100, 20);
        add(idDokterText);

    }

    public void tambahDokter() {
        Dokter dokter = new Dokter(idDokterText.getText(), namaDokterText.getText());
        rumahSakit.tambahDokter(dokter);
        owner.refreshTabelDokter();
        dispose();
    }
}
