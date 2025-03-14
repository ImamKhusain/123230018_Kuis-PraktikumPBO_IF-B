/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuis_123230018;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Lab Informatika
 */
public class Login extends JFrame implements ActionListener {

    private JTextField usernameTextField;
    private JPasswordField passwordTextField;
    private JButton buttonLogin, buttonReset;
    
    private final String USERNAME = "ImamKhusain";
    private final String PASSWORD = "123230018";
        
    public Login() {
        setTitle("Login");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        JLabel titleLabel = new JLabel("Login");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 10, 10));

        JLabel usernameLabel = new JLabel("Masukkan Username : ");
        usernameTextField = new JTextField(15);
        usernameTextField.setFont(new Font("Arial", Font.PLAIN, 12));

        JLabel passwordLabel = new JLabel("Masukkan Password : ");
        passwordTextField = new JPasswordField(15);
        passwordTextField.setFont(new Font("Arial", Font.PLAIN, 12));

        inputPanel.add(usernameLabel);
        inputPanel.add(usernameTextField);
        inputPanel.add(passwordLabel);
        inputPanel.add(passwordTextField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 5));

        buttonLogin = new JButton("Login");
        buttonLogin.setFont(new Font("Arial", Font.BOLD, 12));
        buttonLogin.setPreferredSize(new Dimension(120, 40));
        buttonLogin.addActionListener(this);

        buttonReset = new JButton("Reset");
        buttonReset.setFont(new Font("Arial", Font.BOLD, 12));
        buttonReset.setPreferredSize(new Dimension(120, 40));
        buttonReset.addActionListener(e -> {
            usernameTextField.setText("");
            passwordTextField.setText("");
        });

        buttonPanel.add(buttonLogin);
        buttonPanel.add(buttonReset);

        mainPanel.add(titleLabel);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(inputPanel);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(buttonPanel);

        add(mainPanel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonLogin) {
            String username = usernameTextField.getText();
            String password = new String(passwordTextField.getPassword());

            if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                JOptionPane.showMessageDialog(this, "Login Berhasil!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                new Home(username);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Login Gagal! Username atau Password salah.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Login::new);
    }
}
