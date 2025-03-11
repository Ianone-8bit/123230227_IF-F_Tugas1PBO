package tugas2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame implements ActionListener {
    JLabel tulisan = new JLabel("Login Page");
    JLabel usernameLabel = new JLabel("Username: ");
    JLabel passwordLabel = new JLabel("Pass: ");
 
    
    JTextField usernameTextField = new JTextField();
    JPasswordField passwordTextField = new JPasswordField();

    JButton tombolLogin = new JButton("Login");
    JButton tombolReset = new JButton("Reset");  
   

    Login() {
        setVisible(true);
        setSize(720, 480);
        setTitle("INI LOGIN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);
        
        
        add(tulisan);
        add(usernameLabel);
        add(passwordLabel);
        add(usernameTextField);
        add(passwordTextField);
        add(tombolLogin);
        add(tombolReset);
        tombolLogin.setBackground(Color.blue);
        tombolLogin.setForeground(Color.white);
        tombolReset.setBackground(Color.lightGray);
        
        
        

        tulisan.setBounds(210, 20, 150, 24);
        usernameLabel.setBounds(20, 84, 440, 12);
        passwordLabel.setBounds(20, 152, 440, 12);
        usernameTextField.setBounds(18, 100, 440, 32);
        passwordTextField.setBounds(18, 170, 440, 32);
        tombolLogin.setBounds(50, 220, 200, 32);
        tombolReset.setBounds(50, 280, 200, 32);

        tombolLogin.addActionListener(this);
        tombolReset.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == tombolLogin) {
                String username = usernameTextField.getText();
                char[] passwordChar = passwordTextField.getPassword();
                String password = new String(passwordChar);

                if (username.equals("1") && password.equals("1")) {
                    System.out.println("Sukses");
                    JOptionPane.showMessageDialog(this, "Login Berhasil!");
                    
                    new Home(username);
                } else {
                    JOptionPane.showMessageDialog(this, "Username atau password salah");
                }
            } else if (e.getSource() == tombolReset) {
                usernameTextField.setText("");
                passwordTextField.setText("");
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}