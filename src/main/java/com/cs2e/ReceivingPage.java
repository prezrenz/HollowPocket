package com.cs2e;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

public class ReceivingPage extends JFrame {

    App mainApp;

    public ReceivingPage(App parent) {

        mainApp = parent;

        final int APP_WIDTH = 470;
        final int APP_HEIGHT = 700;

        JLabel Acc_label = new JLabel("Receive");
        Acc_label.setLocation(150,20);
        Acc_label.setSize(1000,70);
        Acc_label.setFont(new Font("Cooper Black",Font.PLAIN,40));
        Acc_label.setForeground(new Color(129, 116, 160));
        Acc_label.setVisible(true);
        add(Acc_label);

        JLabel WalletID= new JLabel("Your Account ID");
        WalletID.setLocation(90,130);
        WalletID.setSize(1000,70);
        WalletID.setFont(new Font("Cooper Black",Font.PLAIN,23));
        WalletID.setForeground(new Color(129, 116, 160));
        WalletID.setVisible(true);
        ImageIcon icon4 = new ImageIcon(getClass().getResource("/ID.png"));
        WalletID.setIcon(icon4);
        repaint();
        add(WalletID);


        JButton Copy_btn = new JButton("Copy ID");
        Copy_btn.setBounds(200, 200, 90, 30);
        Copy_btn.setLocation(180,360);
        Copy_btn.setHorizontalTextPosition(SwingConstants.CENTER);
        Copy_btn.setVerticalTextPosition(SwingConstants.BOTTOM);
        Copy_btn.setBackground(new Color(217, 234, 253));
        Copy_btn.setForeground(new Color(26, 26, 29));
        Copy_btn.setFont(new Font("Impact",Font.PLAIN,20));
        Copy_btn.setBorder(BorderFactory.createEtchedBorder());
        Copy_btn.setBorder(BorderFactory.createLineBorder(new Color(129, 116, 160), 2));
        Copy_btn.setFocusable(false);
        repaint();
        add(Copy_btn);

        JButton Back_btn = new JButton("Back");
        Back_btn.setBounds(565, 200, 100, 40);
        Back_btn.setLocation(170,560);
        Back_btn.setHorizontalTextPosition(SwingConstants.CENTER);
        Back_btn.setVerticalTextPosition(SwingConstants.BOTTOM);
        Back_btn.setBackground(new Color(217, 234, 253));
        Back_btn.setForeground(new Color(26, 26, 29));
        Back_btn.setFont(new Font("Impact",Font.PLAIN,20));
        Back_btn.setBorder(BorderFactory.createEtchedBorder());
        Back_btn.setBorder(BorderFactory.createLineBorder(new Color(129, 116, 160), 2));
        Back_btn.setFocusable(false);
        add(Back_btn);

        // Load and display circular image
        ImageIcon maskImage = new ImageIcon(getClass().getResource("/mask_DB.jpg"));
        Image circularImage = makeCircularImage(maskImage.getImage(), 80); // Make the image circular
        JLabel imageLabel = new JLabel(new ImageIcon(circularImage));
        imageLabel.setBounds(185, 190, 80, 80); // Set the position and size of the image
        add(imageLabel);

        JPanel blck_divider = new JPanel();
        blck_divider.setBackground(Color.black);
        blck_divider.setBounds(120,340,210,1);
        add(blck_divider);

        JPanel wht_divider = new JPanel();
        wht_divider.setBackground(new Color(217, 234, 253));
        wht_divider.setBounds(0,110,800,10);
        add(wht_divider);

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

}
