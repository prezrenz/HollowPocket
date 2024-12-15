package com.cs2e;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

public class DashBoard extends JFrame {

    App mainApp;
    JLabel AccName_label = new JLabel("User Account Name");
    JLabel AccID_label = new JLabel("Account ID: ");
    JLabel AccBalance = new JLabel("PHP : * * * * * * * * *");

    public DashBoard(App parent) {
        mainApp = parent;

        final int APP_WIDTH = 800;
        final int APP_HEIGHT = 800;



        //Send Button Set up
        JButton send_Btn = new JButton("Send");
        send_Btn.setBounds(565, 200, 150, 90);
        send_Btn.setLocation(50,480);
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/Send.png"));
        send_Btn.setIcon(icon1);
        send_Btn.setHorizontalTextPosition(SwingConstants.CENTER);
        send_Btn.setVerticalTextPosition(SwingConstants.BOTTOM);
        send_Btn.setBackground(new Color(217, 234, 253));
        send_Btn.setForeground(new Color(129, 116, 160));
        send_Btn.setFont(new Font("Impact",Font.PLAIN,12));
        send_Btn.setBorder(BorderFactory.createEtchedBorder());
        send_Btn.setBorder(BorderFactory.createLineBorder(new Color(129, 116, 160), 2));
        send_Btn.setFocusable(false);
        add(send_Btn);

        //Receive Button Set up
        JButton receive_Btn = new JButton("Receive");
        receive_Btn.setBounds(565, 200, 150, 90);
        receive_Btn.setLocation(230,480);
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/Money.png"));
        receive_Btn.setIcon(icon2);
        receive_Btn.setHorizontalTextPosition(SwingConstants.CENTER);
        receive_Btn.setVerticalTextPosition(SwingConstants.BOTTOM);
        receive_Btn.setBackground(new Color(217, 234, 253));
        receive_Btn.setForeground(new Color(129, 116, 160));
        receive_Btn.setFont(new Font("Impact",Font.PLAIN,12));
        receive_Btn.setBorder(BorderFactory.createEtchedBorder());
        receive_Btn.setBorder(BorderFactory.createLineBorder(new Color(129, 116, 160), 2));
        receive_Btn.setFocusable(false);
        add(receive_Btn);

        //Create Button Set up
        JButton create_Btn = new JButton("Personal Account");
        create_Btn.setBounds(565, 200, 150, 90);
        create_Btn.setLocation(410,480);
        ImageIcon icon3 = new ImageIcon(getClass().getResource("/ID.png"));
        create_Btn.setIcon(icon3);
        create_Btn.setHorizontalTextPosition(SwingConstants.CENTER);
        create_Btn.setVerticalTextPosition(SwingConstants.BOTTOM);
        create_Btn.setBackground(new Color(217, 234, 253));
        create_Btn.setForeground(new Color(129, 116, 160));
        create_Btn.setFont(new Font("Impact",Font.PLAIN,12));
        create_Btn.setBorder(BorderFactory.createEtchedBorder());
        create_Btn.setBorder(BorderFactory.createLineBorder(new Color(129, 116, 160), 2));
        create_Btn.setFocusable(false);
        add(create_Btn);

        //History Button Set up
        JButton tranHstry_Btn = new JButton("Transaction History");
        tranHstry_Btn.setBounds(565, 200, 150, 90);
        tranHstry_Btn.setLocation(590,480);
        ImageIcon icon4 = new ImageIcon(getClass().getResource("/Receipt.png"));
        tranHstry_Btn.setIcon(icon4);
        tranHstry_Btn.setHorizontalTextPosition(SwingConstants.CENTER);
        tranHstry_Btn.setVerticalTextPosition(SwingConstants.BOTTOM);
        tranHstry_Btn.setBackground(new Color(217, 234, 253));
        tranHstry_Btn.setForeground(new Color(129, 116, 160));
        tranHstry_Btn.setFont(new Font("Impact",Font.PLAIN,12));
        tranHstry_Btn.setBorder(BorderFactory.createEtchedBorder());
        tranHstry_Btn.setBorder(BorderFactory.createLineBorder(new Color(129, 116, 160), 2));
        tranHstry_Btn.setFocusable(false);
        add(tranHstry_Btn);

        JButton Lock_btn = new JButton("ꗃLock Walletꗃ");
        Lock_btn.setBounds(565, 200, 200, 40);
        Lock_btn.setLocation(300,700);
        Lock_btn.setHorizontalTextPosition(SwingConstants.CENTER);
        Lock_btn.setVerticalTextPosition(SwingConstants.BOTTOM);
        Lock_btn.setBackground(new Color(217, 234, 253));
        Lock_btn.setForeground(new Color(26, 26, 29));
        Lock_btn.setFont(new Font("Impact",Font.PLAIN,20));
        Lock_btn.setBorder(BorderFactory.createEtchedBorder());
        Lock_btn.setBorder(BorderFactory.createLineBorder(new Color(129, 116, 160), 2));
        Lock_btn.setFocusable(false);
        add(Lock_btn);

        //Main Frame Set Up
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Dashboard");
        setLayout(null);
        setSize(APP_WIDTH, APP_HEIGHT);
        setLocationRelativeTo(null);
        Color backgroundColor = new Color(26, 26, 29);
        getContentPane().setBackground(backgroundColor);


        // Label for DashBoard Page
        JLabel Hollow_label = new JLabel("DASHBOARD");
        Hollow_label.setLocation(130, 20);
        Hollow_label.setSize(1000, 70);
        Hollow_label.setFont(new Font("Cooper Black", Font.PLAIN, 40));
        Hollow_label.setForeground(new Color(129, 116, 160));
        Hollow_label.setVisible(true);
        add(Hollow_label);

        JLabel Balance_label = new JLabel("Outstanding Balance");
        Balance_label.setLocation(520, 320);
        Balance_label.setSize(255, 60);
        Balance_label.setFont(new Font("Cooper Black", Font.PLAIN, 15));
        Balance_label.setForeground(new Color(129, 116, 160));
        Balance_label.setVisible(true);
        add(Balance_label);

        AccName_label = new JLabel("User Account Name");
        AccName_label.setLocation(120, 170);
        AccName_label.setSize(255, 60);
        AccName_label.setFont(new Font("Cooper Black", Font.PLAIN, 20));
        AccName_label.setForeground(new Color(129, 116, 160));
        AccName_label.setVisible(true);
        add(AccName_label);

        AccID_label = new JLabel("Account ID: ");
        AccID_label.setLocation(120, 200);
        AccID_label.setSize(255, 60);
        AccID_label.setFont(new Font("Cooper Black", Font.PLAIN, 13));
        AccID_label.setForeground(new Color(129, 116, 160));
        AccID_label.setVisible(true);
        add(AccID_label);

        AccBalance = new JLabel("PHP : * * * * * * * * *");
        AccBalance.setLocation(480, 350);
        AccBalance.setSize(300, 60);
        AccBalance.setFont(new Font("Cooper Black", Font.PLAIN, 20));
        AccBalance.setForeground(new Color(129, 116, 160));
        AccBalance.setVisible(true);
        add(AccBalance);


        // Load and display circular image
        ImageIcon maskImage = new ImageIcon(getClass().getResource("/mask_DB.jpg"));
        Image circularImage = makeCircularImage(maskImage.getImage(), 80); // Make the image circular
        JLabel imageLabel = new JLabel(new ImageIcon(circularImage));
        imageLabel.setBounds(30, 20, 80, 80); // Set the position and size of the image

        add(imageLabel);


        JPanel blck_divider = new JPanel();
        blck_divider.setBackground(Color.black);
        blck_divider.setBounds(210,240,130,1);
        add(blck_divider);

        JPanel blck_divider1 = new JPanel();
        blck_divider1.setBackground(Color.black);
        blck_divider1.setBounds(540,400,150,1);
        add(blck_divider1);

        JPanel AccPnl_divider = new JPanel();
        AccPnl_divider.setBackground(new Color(217, 234, 253));
        AccPnl_divider.setBounds(100,170,600,250);
        add(AccPnl_divider);

        JPanel wht_divider = new JPanel();
        wht_divider.setBackground(new Color(217, 234, 253));
        wht_divider.setBounds(0,110,800,10);
        add(wht_divider);


        JPanel wht_divider2 = new JPanel();
        wht_divider2.setBackground(new Color(217, 234, 253));
        wht_divider2.setBounds(0,650,800,10);
        add(wht_divider2);

        Lock_btn.addActionListener((ae) -> logout()); 
        send_Btn.addActionListener((ae) -> send());  
        receive_Btn.addActionListener((ae) -> receive());
        create_Btn.addActionListener((ae) -> accDetails());
        tranHstry_Btn.addActionListener((ae) -> transactionHistory());
    }

    private static Image makeCircularImage(Image image, int diameter) {
        // Create a buffered image with transparency
        BufferedImage circularImage = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);

        // Draw the circular shape and clip the image
        Graphics2D g2 = circularImage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Create a circular clipping area
        Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, diameter, diameter);
        g2.setClip(circle);

        // Draw the image within the circular area
        g2.drawImage(image, 0, 0, diameter, diameter, null);
        g2.dispose();

        return circularImage;
    }

    public void setup() {
        AccName_label.setText("Welcome, " + mainApp.currentUser.username + "!");
        AccID_label.setText("Account ID: " + mainApp.currentUser.accountId);
        AccBalance.setText("PHP: " + mainApp.currentUser.balance);
    }
    
    private void logout() {
        mainApp.currentUser = null;
        mainApp.setFrame(App.FRAME.LOGIN);
    }

    private void send() {
        if(mainApp.currentUser.balance <= 0.0f) {
            JOptionPane.showMessageDialog(this, "Cannot send, you have 0.0 balance!");
            return;
        }

        mainApp.setFrame(App.FRAME.SENDING);
    }

    private void receive(){
        mainApp.receivingPage.setup();
        mainApp.setFrame(App.FRAME.RECEIVING);
    }

    private void accDetails(){
        mainApp.accDetails.setup();
        mainApp.setFrame(App.FRAME.DETAILS);
    }

    private void transactionHistory(){
        mainApp.transactionHistory.setup();
        mainApp.setFrame(App.FRAME.TRANSACTION);
    }
}
