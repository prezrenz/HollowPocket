package com.cs2e;

import javax.swing.*;
import java.awt.*;

public class login_page extends JFrame {

    App mainApp;

    public login_page (App parent) {
        mainApp = parent;

        final int APP_WIDTH = 470;
        final int APP_HEIGHT = 700;


        //Log in Frame set Up
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Hollow Wallet");
        setLayout(null);
        setSize(APP_WIDTH, APP_HEIGHT);
        setLocationRelativeTo(null);
        Color backgroundColor = new Color(26, 26, 29);
        getContentPane().setBackground(backgroundColor);

        JLabel Hollow_label = new JLabel("Hollow Pocket");
        Hollow_label.setLocation(120,10);
        Hollow_label.setSize(1000,70);
        Hollow_label.setFont(new Font("Cooper Black",Font.PLAIN,30));
        Hollow_label.setForeground(new Color(129, 116, 160));
        Hollow_label.setVisible(true);
        add(Hollow_label);

        //Login Panels
        JPanel blue_divider = new JPanel();
        blue_divider.setBackground(new Color(217, 234, 253));
        blue_divider.setBounds(0,90,600,10);
        add(blue_divider);

        //Label for textField
        JLabel UserN_label = new JLabel("Enter Your Username");
        UserN_label.setLocation(100,200);
        UserN_label.setSize(170,50);
        UserN_label.setFont(new Font("Cooper Black",Font.PLAIN,15));
        UserN_label.setForeground(new Color(217, 234, 253));
        UserN_label.setVisible(true);
        add(UserN_label);

        //Label for passwordField
        JLabel Pass_label = new JLabel("Enter Your Password");
        Pass_label.setLocation(100,350);
        Pass_label.setSize(170,50);
        Pass_label.setFont(new Font("Cooper Black",Font.PLAIN,15));
        Pass_label.setForeground(new Color(217, 234, 253));
        Pass_label.setVisible(true);
        add(Pass_label);

        //Logo of Application
        ImageIcon maskImage = new ImageIcon(getClass().getResource("/mask__1_-removebg-preview.png")); // Assuming the image is in the "resources" folder
        JLabel imageLabel = new JLabel(maskImage);
        imageLabel.setBounds(30, 20, 60, 60); // Set the position and size of the image
        add(imageLabel);

        ImageIcon maskImage1 = new ImageIcon(getClass().getResource("/mask__1_-removebg-preview.png")); // Assuming the image is in the "resources" folder
        JLabel imageLabel1 = new JLabel(maskImage);
        imageLabel1.setBounds(370, 20, 60, 60); // Set the position and size of the image
        add(imageLabel1);

        // User Login text field
        JTextField textField = new JTextField();
        textField.setBounds(100, 250, 250, 30);
        textField.setSize(250,30);
        textField.setBackground(new Color(217, 234, 253)); // Custom background color
        textField.setBorder(BorderFactory.createLineBorder(new Color(240, 187, 120))); // Optional border
        textField.setBorder(BorderFactory.createLineBorder(new Color(169, 169, 169), 3));
        add(textField);


        // Password text field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100, 400, 250, 30);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 16)); // Optional: set font
        passwordField.setBackground(new Color(217, 234, 253)); // Custom background color
        passwordField.setForeground(Color.BLACK); // Text color
        passwordField.setBorder(BorderFactory.createLineBorder(new Color(240, 187, 120))); // Optional border
        passwordField.setEchoChar('*');
        passwordField.setBorder(BorderFactory.createLineBorder(new Color(169, 169, 169), 3));
        repaint();
        add(passwordField);

        //Login Button Set Up
        JButton login_Btn = new JButton("Login");
        login_Btn.setBounds(565, 550, 80, 30);
        login_Btn.setLocation(250,470);
        login_Btn.setBackground(new Color(129, 116, 160));
        login_Btn.setForeground(new Color(26, 26, 29));
        login_Btn.setFont(new Font("Impact",Font.PLAIN,13));
        login_Btn.setBorder(BorderFactory.createEtchedBorder());
        login_Btn.setBorder(BorderFactory.createLineBorder(new Color(169, 169, 169), 1));
        login_Btn.setFocusable(false);
        repaint();
        add(login_Btn);

        //Register Button Set Up
        JButton register_Btn = new JButton("Register");
        register_Btn.setBounds(565, 550, 80, 30);
        register_Btn.setLocation(120,470);
        register_Btn.setBackground(new Color(129, 116, 160));
        register_Btn.setForeground(new Color(26, 26, 29));
        register_Btn.setFont(new Font("Impact",Font.PLAIN,13));
        register_Btn.setBorder(BorderFactory.createEtchedBorder());
        register_Btn.setBorder(BorderFactory.createLineBorder(new Color(169, 169, 169), 1));
        register_Btn.setFocusable(false);
        add(register_Btn);


    }

}
