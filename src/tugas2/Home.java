/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author asus
 */
public class Home extends JFrame implements ActionListener{
    JLabel LabelSelamatDatang = new JLabel ("Selamat Datang");
    JLabel LabelPilihanMenu = new JLabel ("Silahkan pilih DVD yang akan dibeli ");
    JButton kecilButton = new JButton("DVD Anak");
    JButton dewasaButton = new JButton("DVD Dewasa");
    JButton lansiaButton = new JButton("DVD Lansia");
    JButton keluarButton = new JButton("Keluar");
   
   
    
    Home(String username) {
        setVisible(true);
        setSize(720, 480);
        setTitle("INI HOME");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);
        

        add(LabelSelamatDatang);
        add(LabelPilihanMenu);
        
        kecilButton.addActionListener(this);
        dewasaButton.addActionListener(this);
        lansiaButton.addActionListener(this);
        keluarButton.addActionListener(this); 
        
        add(keluarButton);
        add(kecilButton);
        add(dewasaButton);
        add(lansiaButton);

        
        LabelPilihanMenu.setFont(new Font("Arial", Font.PLAIN,14));
        LabelSelamatDatang.setBounds(20,40,200,100);
        LabelSelamatDatang.setSize(600,100);
        LabelPilihanMenu.setSize(100,400);
        LabelPilihanMenu.setBounds(20, 40, 200, 160);
        LabelPilihanMenu.setText("Silahkan pilih DVD yang akan dibeli ");
        LabelSelamatDatang.setText("Selamat Datang " + username + " Tampan");
        LabelSelamatDatang.setFont(new Font("Arial", Font.BOLD,24));
        keluarButton.setBounds(20, 200, 550, 30);
        kecilButton.setBounds(20, 150, 150, 30);
        dewasaButton.setBounds(220, 150, 150, 30);
        lansiaButton.setBounds(420, 150, 150, 30);
    }
    
@Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == keluarButton) {
        new Login();  
        dispose();
    } else if (e.getSource() == kecilButton) {
        new Pembelian("DVD Anak", 27891);
        dispose();
    } else if (e.getSource() == dewasaButton) {
        new Pembelian("DVD Dewasa", 35396);
        dispose();
    } else if (e.getSource() == lansiaButton) {
        new Pembelian("DVD Lansia", 38550);
        dispose();
    }
}

}
