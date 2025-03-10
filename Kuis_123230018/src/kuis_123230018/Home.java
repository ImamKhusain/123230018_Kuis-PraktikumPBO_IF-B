/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis_123230018;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
/**
 *
 * @author Lab Informatika
 */
public class Home extends JFrame {
    JLabel welcomeLabel = new JLabel();
    JTextField apelField = new JTextField("0", 5);
    JTextField jerukField = new JTextField("0", 5);
    JTextField manggaField = new JTextField("0", 5);
    
    JButton buttonBeli = new JButton("Beli");
    JButton buttonLogout = new JButton("Logout");
    
    private String username;
    
    public Home(String username){
        this.username = username;
        
        setSize(480,300);
        setTitle("Home Page");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        welcomeLabel = new JLabel("Selamat Datang, Tuan " + username);
            welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
            
            add(welcomeLabel);
            welcomeLabel.setBounds(20, 20, 300, 30);
        
        JPanel panelTengah = new JPanel(new GridLayout(3, 2, 10, 10));
        
        panelTengah.add(new JLabel("Apel (Rp. 15.000/kg:)"));
        panelTengah.add(apelField);
        
        panelTengah.add(new JLabel("Mangga (Rp. 15.000/kg:)"));
        panelTengah.add(manggaField);
        
        add(panelTengah, BorderLayout.CENTER);
        
        JPanel panelBawah = new JPanel(new GridLayout(2, 1, 5, 5));
        buttonBeli.setPreferredSize(new Dimension(200, 40));
        buttonLogout.setPreferredSize(new Dimension(200, 40));
        
        panelBawah.add(buttonBeli);
        panelBawah.add(buttonLogout);
        add(panelBawah, BorderLayout.SOUTH);
        
        buttonBeli.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validasiInput()) {
                    JOptionPane.showConfirmDialog(rootPane, username);
                }
            }
        });
        
    }
}

    
    
