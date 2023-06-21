/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.registrationform;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class RegistrationForm {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Registration Form");

        ImageIcon image = new ImageIcon("regis.png");
        frame.setIconImage(image.getImage());
        //  frame.getContentPane().setBackground(Color.pink);

        frame.getContentPane().setBackground(new Color(204, 187, 223));

        JLabel l1 = new JLabel("TO COMPLETE YOUR REGISTRATION PROCESS PLEASE FILLUP THE REGISTRATION FORM WITH YOUR VALID INFORMATION! THANK YOU.");
        l1.setBounds(100, 30, 900, 50);
        frame.add(l1);

        JLabel label1 = new JLabel();
        label1.setBounds(50, 120, 150, 25);
        label1.setText("YOUR FULL NAME:");
        frame.add(label1);

        JTextField tf1 = new JTextField();
        tf1.setBounds(170, 120, 200, 25);
        frame.add(tf1);

        

        JLabel label2 = new JLabel("FATHER'S NAME:");
        label2.setBounds(50, 180, 150, 25);
        frame.add(label2);

        JTextField tf2 = new JTextField();
        tf2.setBounds(170, 180, 200, 25);
        frame.add(tf2);

        JLabel label3 = new JLabel("MATHER'S NAME:");
        label3.setBounds(50, 240, 150, 25);
        frame.add(label3);

        JTextField tf3 = new JTextField();
        tf3.setBounds(170, 240, 200, 25);
        frame.add(tf3);

        JLabel label4 = new JLabel("NATIONALITY:");
        label4.setBounds(50, 300, 150, 25);
        frame.add(label4);

        String[] country = {"BANGLADESH", "INDIA", "PAKISTAN", "VUTAN", "NEPAL"};

        JComboBox combobox = new JComboBox(country);
        combobox.setBounds(170, 300, 200, 25);
        frame.add(combobox);

        JLabel label5 = new JLabel("GENDER:");
        label5.setBounds(50, 360, 150, 25);
        frame.add(label5);

        JRadioButton rb1 = new JRadioButton("MALE");
        rb1.setBounds(170, 360, 90, 25);
        frame.add(rb1);
        JRadioButton rb2 = new JRadioButton("FEMALE");
        rb2.setBounds(280, 360, 90, 25);
        frame.add(rb2);

        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);

        JLabel label6 = new JLabel("DEPARTMENT:");
        label6.setBounds(50, 420, 150, 25);
        frame.add(label6);

//       JTextField tf6 = new JTextField();
//        tf6.setBounds(170,420,200,25);
//        frame.add(tf6);
        String[] dept = {"CSE", "EEE", "ECONOMICS", "LAW", "BBA"};

        JComboBox combo = new JComboBox(dept);
        combo.setBounds(170, 420, 200, 25);
        frame.add(combo);

        JLabel label7 = new JLabel("BATCH:");
        label7.setBounds(50, 480, 150, 25);
        frame.add(label7);

        String[] batch = {"52", "53", "54", "55", "56"};

        JComboBox box = new JComboBox(batch);
        box.setBounds(170, 480, 200, 25);
        frame.add(box);

        JButton button1 = new JButton("SUBMIT");
        button1.setBounds(50, 660, 100, 25);
        frame.add(button1);

     button1.addActionListener (new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "congratulations!YOu've successfully completed your registration!"); 
         }
     });
         
     
    // 
        
        JButton button2 = new JButton("CANCEL");
        button2.setBounds(170, 660, 100, 25);
        frame.add(button2);

        JCheckBox checkbox = new JCheckBox();
        checkbox.setText("I'm not a Robot");
        checkbox.setFocusable(false);
        checkbox.setBounds(50, 600, 200, 25);

        frame.add(checkbox);
        
        

     

        frame.setVisible(true);
    }

   
}
//JLabel //
//Text field//
//button//
//image
//combo box//
//radio button//
//chrck box//
//navigatoion
