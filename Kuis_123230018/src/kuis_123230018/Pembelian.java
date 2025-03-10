/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis_123230018;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;

/**
 *
 * @author Lab Informatika
 */
public class Pembelian extends JFrame {

    public Pembelian(String username, String apel, String jeruk, String mangga) {
        setSize(480, 720);
        setTitle("Halaman Pembeliam");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel labelTitle = new JLabel("Ringkasan Pembelian");
        labelTitle.setBounds(20, 30, 200, 20);
        add(labelTitle);
        
        int jumlahApel = Integer.parseInt(apel);
        int jumlahJeruk = Integer.parseInt(jeruk);
        int jumlahMangga = Integer.parseInt(mangga);
        
        int totalApel = jumlahApel * 15000;
        int totalJeruk = jumlahJeruk * 12000;
        int totalMangga = jumlahMangga * 15000;
        int subtotal = totalApel + totalJeruk + totalMangga;
        int pajak = (int) (subtotal * 0.1);
        int total = subtotal + pajak;
        
        JLabel labelSubtotal = new JLabel("Subtotal: Rp " + subtotal);
        JLabel labelPajak = new JLabel("Pajak 10%: Rp " + pajak);
        JLabel labelTotal = new JLabel("Total Harga: Rp " + total);
        
        labelSubtotal.setBounds(20, 80, 200, 30);
        labelPajak.setBounds(20, 110, 200, 30);
        labelTotal.setBounds(20, 140, 200, 30);
        
        JButton buttonKembali = new JButton("Kembali");
        buttonKembali.setBounds(150, 200, 150, 40);
        add(buttonKembali);
        
        add(labelSubtotal);
        add(labelPajak);
        add(labelTotal);
        add(buttonKembali);
        
        buttonKembali.addActionListener(e -> {
            new Home(username);
            dispose();
        });
        
        setVisible(true);
    }
    
}
