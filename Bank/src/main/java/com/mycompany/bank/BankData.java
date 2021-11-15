/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank;

import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Kyle
 */
public class BankData {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        JFrame f = new JFrame("Bank Data");
        JPasswordField value = new JPasswordField();
        JLabel l1 = new JLabel("Password:");
        l1.setBounds(20, 100, 80, 30);
         JButton b = new JButton("Login");  
        b.setBounds(100,120, 80,30);    

        f.add(value);
        f.add(l1);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
       /* b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pass = l1.getText();
                try (FileWriter myWriter = new FileWriter("BankDatabase.txt")) {
            myWriter.write(pass);
        }       catch (IOException ex) {
                    Logger.getLogger(BankData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });*/

        File file = new File("BankDatabase.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

    }

}
