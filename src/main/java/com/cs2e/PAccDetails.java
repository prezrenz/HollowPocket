package com.cs2e;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

public class PAccDetails extends JPanel {

    public PAccDetails () {

        final int APP_WIDTH = 470;
        final int APP_HEIGHT = 700;

        //Account Details Page Frame set Up
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Hollow Pocket");
        setLayout(null);
        setSize(APP_WIDTH, APP_HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
        Color backgroundColor = new Color(26, 26, 29);
        getContentPane().setBackground(backgroundColor);

        JLabel Hollow_label = new JLabel("Hollow Pocket");
        Hollow_label.setLocation(130,20);
        Hollow_label.setSize(1000,70);
        Hollow_label.setFont(new Font("Cooper Black",Font.PLAIN,30));
        Hollow_label.setForeground(new Color(129, 116, 160));
        Hollow_label.setVisible(true);
        add(Hollow_label);


        JButton Lock_btn = new JButton("Back");
        Lock_btn.setBounds(565, 200, 200, 40);
        Lock_btn.setLocation(120,570);
        Lock_btn.setHorizontalTextPosition(SwingConstants.CENTER);
        Lock_btn.setVerticalTextPosition(SwingConstants.BOTTOM);
        Lock_btn.setBackground(new Color(217, 234, 253));
        Lock_btn.setForeground(new Color(26, 26, 29));
        Lock_btn.setFont(new Font("Impact",Font.PLAIN,20));
        Lock_btn.setBorder(BorderFactory.createEtchedBorder());
        Lock_btn.setBorder(BorderFactory.createLineBorder(new Color(129, 116, 160), 2));
        Lock_btn.setFocusable(false);
        add(Lock_btn);

        JLabel Acc_label = new JLabel("Account Informaion");
        Acc_label.setLocation(30,130);
        Acc_label.setSize(325,70);
        Acc_label.setFont(new Font("Cooper Black",Font.PLAIN,25));
        Acc_label.setForeground(new Color(129, 116, 160));
        Acc_label.setVisible(true);
        ImageIcon icon4 = new ImageIcon(getClass().getResource("/Receipt.png"));
        Acc_label.setIcon(icon4);
        repaint();
        add(Acc_label);

        JLabel AccID_label = new JLabel("Account ID:");
        AccID_label.setLocation(30,200);
        AccID_label.setSize(215,50);
        AccID_label.setFont(new Font("Cooper Black",Font.PLAIN,18));
        AccID_label.setForeground(new Color(129, 191, 218));
        AccID_label.setVisible(true);
        ImageIcon icon5 = new ImageIcon(getClass().getResource("/ID.png"));
        AccID_label.setIcon(icon5);
        repaint();
        add(AccID_label);

        JLabel UserN_label = new JLabel("Username:");
        UserN_label.setLocation(30,260);
        UserN_label.setSize(155,50);
        UserN_label.setFont(new Font("Cooper Black",Font.PLAIN,15));
        UserN_label.setForeground(new Color(129, 191, 218));
        UserN_label.setVisible(true);
        ImageIcon icon6 = new ImageIcon(getClass().getResource("/UserName.png"));
        UserN_label.setIcon(icon6);
        repaint();
        add(UserN_label);

        JLabel Pass_label = new JLabel("Password:");
        Pass_label.setLocation(30,310);
        Pass_label.setSize(155,50);
        Pass_label.setFont(new Font("Cooper Black",Font.PLAIN,15));
        Pass_label.setForeground(new Color(129, 191, 218));
        Pass_label.setVisible(true);
        ImageIcon icon7 = new ImageIcon(getClass().getResource("/Password.png"));
        Pass_label.setIcon(icon7);
        repaint();
        add(Pass_label);

        JLabel Country_label = new JLabel("Country:");
        Country_label.setLocation(30,360);
        Country_label.setSize(155,50);
        Country_label.setFont(new Font("Cooper Black",Font.PLAIN,15));
        Country_label.setForeground(new Color(129, 191, 218));
        Country_label.setVisible(true);
        ImageIcon icon8 = new ImageIcon(getClass().getResource("/Globe.png"));
        Country_label.setIcon(icon8);
        repaint();
        add(Country_label);

        JLabel PNumber_label = new JLabel("Phone Number:");
        PNumber_label.setLocation(30,410);
        PNumber_label.setSize(215,50);
        PNumber_label.setFont(new Font("Cooper Black",Font.PLAIN,15));
        PNumber_label.setForeground(new Color(129, 191, 218));
        PNumber_label.setVisible(true);
        ImageIcon icon9 = new ImageIcon(getClass().getResource("/Cellphone.png"));
        PNumber_label.setIcon(icon9);
        repaint();
        add(PNumber_label);

        JLabel Balance_label = new JLabel("Balance:");
        Balance_label.setLocation(30,460);
        Balance_label.setSize(155,50);
        Balance_label.setFont(new Font("Cooper Black",Font.PLAIN,15));
        Balance_label.setForeground(new Color(129, 191, 218));
        Balance_label.setVisible(true);
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/Wallet.png"));
        Balance_label.setIcon(icon2);
        repaint();
        add(Balance_label);

        JPanel blue_divider = new JPanel();
        blue_divider.setBackground(new Color(217, 234, 253));
        blue_divider.setBounds(0,110,600,5);
        add(blue_divider);

        JPanel blue_divider1 = new JPanel();
        blue_divider1.setBackground(new Color(217, 234, 253));
        blue_divider1.setBounds(0,540,600,5);
        add(blue_divider1);

        JPanel org_divider2 = new JPanel();
        org_divider2.setBackground(new Color(177, 240, 247));
        org_divider2.setBounds(40,140,370,2);
        add(org_divider2);

        JPanel org_divider1 = new JPanel();
        org_divider1.setBackground(new Color(177, 240, 247));
        org_divider1.setBounds(40,190,370,2);
        add(org_divider1);

        JPanel AccPnl = new JPanel();
        AccPnl.setBackground(new Color(217, 234, 253));
        AccPnl.setBounds(20,130,415,400);
        add(AccPnl);

        // Load and display circular image
        ImageIcon maskImage = new ImageIcon(getClass().getResource("/mask_DB.jpg"));
        Image circularImage = makeCircularImage(maskImage.getImage(), 80); // Make the image circular
        JLabel imageLabel = new JLabel(new ImageIcon(circularImage));
        imageLabel.setBounds(30, 20, 80, 80); // Set the position and size of the image
        repaint();
        add(imageLabel);

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
