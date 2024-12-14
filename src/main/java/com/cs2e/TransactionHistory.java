package com.cs2e;

import javax.swing.*;
import java.awt.*;

public class TransactionHistory extends JFrame {

    App mainApp;

    public TransactionHistory(App parent) {

        mainApp = parent;

        final int APP_WIDTH = 470;
        final int APP_HEIGHT = 700;

        JLabel Hollow_label = new JLabel("Hollow Pocket");
        Hollow_label.setLocation(120,10);
        Hollow_label.setSize(500,60);
        Hollow_label.setFont(new Font("Cooper Black",Font.PLAIN,30));
        Hollow_label.setForeground(new Color(129, 116, 160));
        Hollow_label.setVisible(true);
        add(Hollow_label);

        JLabel Activity = new JLabel("Recent Activity");
        Activity.setLocation(115,130);
        Activity.setSize(500,70);
        Activity.setFont(new Font("Cooper Black",Font.PLAIN,18));
        Activity.setForeground(new Color(129, 116, 160));
        Activity.setVisible(true);
        ImageIcon icon4 = new ImageIcon(getClass().getResource("/Receipt.png"));
        Activity.setIcon(icon4);
        repaint();
        add(Activity);

        JButton Back_btn = new JButton("Back");
        Back_btn.setBounds(565, 200, 100, 40);
        Back_btn.setLocation(170,600);
        Back_btn.setHorizontalTextPosition(SwingConstants.CENTER);
        Back_btn.setVerticalTextPosition(SwingConstants.BOTTOM);
        Back_btn.setBackground(new Color(217, 234, 253));
        Back_btn.setForeground(new Color(26, 26, 29));
        Back_btn.setFont(new Font("Impact",Font.PLAIN,20));
        Back_btn.setBorder(BorderFactory.createEtchedBorder());
        Back_btn.setBorder(BorderFactory.createLineBorder(new Color(129, 116, 160), 2));
        Back_btn.setFocusable(false);
        add(Back_btn);

        ImageIcon maskImage1 = new ImageIcon(getClass().getResource("/mask__1_-removebg-preview.png")); // Assuming the image is in the "resources" folder
        JLabel imageLabel1 = new JLabel(maskImage1);
        imageLabel1.setBounds(360, 470, 60, 60); // Set the position and size of the image
        repaint();
        add(imageLabel1);

        ImageIcon maskImage2 = new ImageIcon(getClass().getResource("/mask__1_-removebg-preview.png")); // Assuming the image is in the "resources" folder
        JLabel imageLabel2 = new JLabel(maskImage2);
        imageLabel2.setBounds(30, 470, 60, 60); // Set the position and size of the image
        repaint();
        add(imageLabel2);

        JPanel wht_divider = new JPanel();
        wht_divider.setBackground(new Color(217, 234, 253));
        wht_divider.setBounds(0,110,800,10);
        add(wht_divider);

        JPanel wht_divider1 = new JPanel();
        wht_divider1.setBackground(new Color(217, 234, 253));
        wht_divider1.setBounds(0,560,800,10);
        add(wht_divider1);

        JPanel blck_divider = new JPanel();
        blck_divider.setBackground(Color.black);
        blck_divider.setBounds(100,510,250,2);
        add(blck_divider);

        JPanel Send_Pnl = new JPanel();
        Send_Pnl.setBackground(new Color(217, 234, 253));
        Send_Pnl.setBounds(25,140,400,400);
        add(Send_Pnl);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Hollow Pocket");
        setLayout(null);
        setSize(APP_WIDTH, APP_HEIGHT);
        setLocationRelativeTo(null);
        Color backgroundColor = new Color(26, 26, 29);
        getContentPane().setBackground(backgroundColor);

        Back_btn.addActionListener((ae) -> Back());

    }   
    private void Back(){
        mainApp.setFrame(App.FRAME.DASHBOARD);
    }
}
