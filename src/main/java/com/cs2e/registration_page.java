package com.cs2e;

import javax.swing.*;
import java.awt.*;

public class registration_page extends JFrame {

    App mainApp;
    JTextField user_text_field;
    JPasswordField passwordField;
    JTextField countryField;
    JTextField PNumberTextField;

    @SuppressWarnings("unused")
    public registration_page (App parent) {

        mainApp = parent;

        final int APP_WIDTH = 470;
        final int APP_HEIGHT = 700;


        //Registration Frame set Up
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Hollow Pocket");
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

        //Registration Panels
        JPanel blue_divider = new JPanel();
        blue_divider.setBackground(new Color(217, 234, 253));
        blue_divider.setBounds(0,90,600,10);
        add(blue_divider);

        JPanel blue_divider2 = new JPanel();
        blue_divider2.setBackground(new Color(217, 234, 253));
        blue_divider2.setBounds(0,320,600,1);
        add(blue_divider2);

        JPanel blue_divider3 = new JPanel();
        blue_divider3.setBackground(new Color(217, 234, 253));
        blue_divider3.setBounds(0,560,600,10);
        add(blue_divider3);

        //Label for Username
        JLabel CUserN_label = new JLabel("Enter Your Username:");
        CUserN_label.setLocation(50,120);
        CUserN_label.setSize(255,50);
        CUserN_label.setFont(new Font("Cooper Black",Font.PLAIN,15));
        CUserN_label.setForeground(new Color(217, 234, 253));
        CUserN_label.setVisible(true);
        ImageIcon icon6 = new ImageIcon(getClass().getResource("/UserName.png"));
        CUserN_label.setIcon(icon6);
        repaint();
        add(CUserN_label);

        //Label for Confirm username
        JLabel UserN_label = new JLabel("Enter Your Password:");
        UserN_label.setLocation(50,200);
        UserN_label.setSize(255,50);
        UserN_label.setFont(new Font("Cooper Black",Font.PLAIN,15));
        UserN_label.setForeground(new Color(217, 234, 253));
        UserN_label.setVisible(true);
        ImageIcon icon7 = new ImageIcon(getClass().getResource("/Password.png"));
        UserN_label.setIcon(icon7);
        repaint();
        add(UserN_label);

        //Label for password
        JLabel Pass_label = new JLabel("Enter Your Country:");
        Pass_label.setLocation(50,350);
        Pass_label.setSize(255,50);
        Pass_label.setFont(new Font("Cooper Black",Font.PLAIN,15));
        Pass_label.setForeground(new Color(217, 234, 253));
        Pass_label.setVisible(true);
        ImageIcon icon8 = new ImageIcon(getClass().getResource("/Globe.png"));
        Pass_label.setIcon(icon8);
        repaint();
        add(Pass_label);

        //Label for Confirm password
        JLabel CPass_label = new JLabel("Enter Your Phone Number:");
        CPass_label.setLocation(50,450);
        CPass_label.setSize(320,50);
        CPass_label.setFont(new Font("Cooper Black",Font.PLAIN,15));
        CPass_label.setForeground(new Color(217, 234, 253));
        CPass_label.setVisible(true);
        ImageIcon icon9 = new ImageIcon(getClass().getResource("/Cellphone.png"));
        CPass_label.setIcon(icon9);
        repaint();
        add(CPass_label);

        //Logo of Application
        ImageIcon maskImage = new ImageIcon(getClass().getResource("/mask__1_-removebg-preview.png")); // Assuming the image is in the "resources" folder
        JLabel imageLabel = new JLabel(maskImage);
        imageLabel.setBounds(30, 20, 60, 60); // Set the position and size of the image
        add(imageLabel);

        ImageIcon maskImage1 = new ImageIcon(getClass().getResource("/mask__1_-removebg-preview.png")); // Assuming the image is in the "resources" folder
        JLabel imageLabel1 = new JLabel(maskImage);
        imageLabel1.setBounds(370, 20, 60, 60); // Set the position and size of the image
        add(imageLabel1);

        //Username text field
        user_text_field = new JTextField();
        user_text_field.setBounds(100, 170, 250, 30);
        user_text_field.setSize(250,30);
        user_text_field.setBackground(new Color(217, 234, 253)); // Custom background color
        user_text_field.setBorder(BorderFactory.createLineBorder(new Color(240, 187, 120))); // Optional border
        user_text_field.setBorder(BorderFactory.createLineBorder(new Color(169, 169, 169), 3));
        add(user_text_field);

        //Confirm Username text field
        passwordField = new JPasswordField();
        passwordField.setBounds(100, 250, 250, 30);
        passwordField.setSize(250,30);
        passwordField.setBackground(new Color(217, 234, 253)); // Custom background color
        passwordField.setBorder(BorderFactory.createLineBorder(new Color(240, 187, 120))); // Optional border
        passwordField.setBorder(BorderFactory.createLineBorder(new Color(169, 169, 169), 3));
        passwordField.setEchoChar('*');
        repaint();
        add(passwordField);


        //Country text field
        countryField = new JTextField();
        countryField.setBounds(100, 500, 250, 30);
        countryField.setFont(new Font("Arial", Font.PLAIN, 13)); // Optional: set font
        countryField.setBackground(new Color(217, 234, 253)); // Custom background color
        countryField.setBorder(BorderFactory.createLineBorder(new Color(240, 187, 120))); // Optional border
        countryField.setBorder(BorderFactory.createLineBorder(new Color(169, 169, 169), 3));
        add(countryField);

        //Number Password text field
        PNumberTextField = new JTextField();
        PNumberTextField.setBounds(100, 400, 250, 30);
        PNumberTextField.setFont(new Font("Arial", Font.PLAIN, 13)); // Optional: set font
        PNumberTextField.setBackground(new Color(217, 234, 253)); // Custom background color
        PNumberTextField.setBorder(BorderFactory.createLineBorder(new Color(240, 187, 120))); // Optional border
        PNumberTextField.setBorder(BorderFactory.createLineBorder(new Color(169, 169, 169), 3));
        add(PNumberTextField);

        //Login Button Set Up
        JButton register_btn = new JButton("Register");
        register_btn.setBounds(565, 580, 80, 30);
        register_btn.setLocation(250,600);
        register_btn.setBackground(new Color(129, 116, 160));
        register_btn.setForeground(new Color(26, 26, 29));
        register_btn.setFont(new Font("Impact",Font.PLAIN,13));
        register_btn.setBorder(BorderFactory.createEtchedBorder());
        register_btn.setBorder(BorderFactory.createLineBorder(new Color(169, 169, 169), 1));
        register_btn.setFocusable(false);
        repaint();
        add(register_btn);

        //Register Button Set Up
        JButton cancel_Btn = new JButton("Cancel");
        cancel_Btn.setBounds(565, 580, 80, 30);
        cancel_Btn.setLocation(120,600);
        cancel_Btn.setBackground(new Color(129, 116, 160));
        cancel_Btn.setForeground(new Color(26, 26, 29));
        cancel_Btn.setFont(new Font("Impact",Font.PLAIN,13));
        cancel_Btn.setBorder(BorderFactory.createEtchedBorder());
        cancel_Btn.setBorder(BorderFactory.createLineBorder(new Color(169, 169, 169), 1));
        cancel_Btn.setFocusable(false);
        add(cancel_Btn);
        
        cancel_Btn.addActionListener((ae) -> cancel());
        register_btn.addActionListener((ae) -> register());
    }

    private void clearFields() {
        user_text_field.setText("");
        passwordField.setText("");
        countryField.setText("");
        PNumberTextField.setText("");
    }

    private void cancel(){
        mainApp.setFrame(App.FRAME.LOGIN);
    }
    
    private void register(){ 
        try {
            String name = user_text_field.getText();
            String pass = passwordField.getText();
            String country = countryField.getText();
            String numb = PNumberTextField.getText();

            if(name.isEmpty() || pass.isEmpty() || country.isEmpty() || numb.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill up all the fields", "Registration Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            mainApp.database.newUser(name, pass, country, numb);
            mainApp.dashboard.setup();
            JOptionPane.showMessageDialog(this, "Successfully registered user!");
            clearFields();
            mainApp.setFrame(App.FRAME.DASHBOARD);
        } catch(Database.DatabaseError e) {
            JOptionPane.showMessageDialog(this, e.getMsg(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
