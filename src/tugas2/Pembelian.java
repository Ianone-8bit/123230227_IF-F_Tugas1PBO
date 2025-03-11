package tugas2;

import java.awt.*;
import javax.swing.*;

public class Pembelian extends JFrame {
    public Pembelian(String kategori, int harga) {
        setTitle("Halaman Pembelian");
        setSize(350, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout( null);
        
       
        JLabel titleLabel = new JLabel("Halaman Pembelian", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(titleLabel);
        titleLabel.setBounds(50, 10, 250, 30);
        
        JLabel kategoriLabel = new JLabel("Kategori: " + kategori);
        kategoriLabel.setBounds(20, 50, 300, 25);
        add(kategoriLabel);

        
        JLabel hargaLabel = new JLabel("Harga: Rp" + String.format("%,d", harga) + "/pcs");
        hargaLabel.setBounds(20, 80, 300, 25);
        add(hargaLabel);

        
        JLabel jumlahLabel = new JLabel("Jumlah:");
        jumlahLabel.setBounds(20, 110, 100, 25);
        add(jumlahLabel);

        JTextField jumlahField = new JTextField();
        jumlahField.setBounds(100, 110, 100, 25);
        add(jumlahField);

        JButton beliButton = new JButton("Beli");
        beliButton.setBounds(220, 110, 80, 25);
        add(beliButton);

        JPanel totalPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        totalPanel.setBounds(20, 150, 280, 100);
        add(totalPanel);
        
        JLabel hargaSatuanLabel = new JLabel("Harga Satuan:");
        JLabel jumlahBeliLabel = new JLabel("Jumlah:");
        JLabel ppnLabel = new JLabel("PPN (11%):");
        JLabel totalHargaLabel = new JLabel("Total Harga:");

        JLabel hargaSatuanValue = new JLabel("Rp0");
        JLabel jumlahBeliValue = new JLabel("0 pcs");
        JLabel ppnValue = new JLabel("Rp0");
        JLabel totalHargaValue = new JLabel("Rp0");

        totalPanel.add(hargaSatuanLabel);
        totalPanel.add(hargaSatuanValue);
        totalPanel.add(jumlahBeliLabel);
        totalPanel.add(jumlahBeliValue);
        totalPanel.add(ppnLabel);
        totalPanel.add(ppnValue);
        totalPanel.add(totalHargaLabel);
        totalPanel.add(totalHargaValue);
        
      

        JButton kembaliButton = new JButton("Kembali");
        add(kembaliButton);

        // Event handler tombol beli
        beliButton.addActionListener(e -> {
            try {
                int jumlah = Integer.parseInt(jumlahField.getText().trim());
                if (jumlah <= 0) throw new NumberFormatException();

                double ppn = jumlah * harga * 0.11;
                double total = jumlah * harga + ppn;

                hargaSatuanValue.setText("Rp" + String.format("%,d", harga));
                jumlahBeliValue.setText(jumlah + " pcs");
                ppnValue.setText("Rp" + String.format("%,.0f", ppn));
                totalHargaValue.setText("Rp" + String.format("%,.0f", total));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Masukkan jumlah yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Event handler tombol kembali
        kembaliButton.addActionListener(e -> dispose());

        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setVisible(true);
    }
}
