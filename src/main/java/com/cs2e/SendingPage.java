package com.cs2e;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

public class SendingPage extends JFrame {

    App mainApp;

    public SendingPage(App parent) {

        mainApp = parent;

        final int APP_WIDTH = 470;
        final int APP_HEIGHT = 700;

        JLabel Acc_label = new JLabel("Send");
        Acc_label.setLocation(180,20);
        Acc_label.setSize(1000,70);
        Acc_label.setFont(new Font("Cooper Black",Font.PLAIN,40));
        Acc_label.setForeground(new Color(129, 116, 160));
        Acc_label.setVisible(true);
        add(Acc_label);

        JLabel WalletID= new JLabel("Recipient's Account ID:");
        WalletID.setLocation(30,130);
        WalletID.setSize(1000,70);
        WalletID.setFont(new Font("Cooper Black",Font.PLAIN,15));
        WalletID.setForeground(new Color(129, 116, 160));
        WalletID.setVisible(true);
        ImageIcon icon4 = new ImageIcon(getClass().getResource("/ID.png"));
        WalletID.setIcon(icon4);
        repaint();
        add(WalletID);

        JLabel Country= new JLabel("Recipient's Country:");
        Country.setLocation(30,220);
        Country.setSize(1000,70);
        Country.setFont(new Font("Cooper Black",Font.PLAIN,15));
        Country.setForeground(new Color(129, 116, 160));
        Country.setVisible(true);
        ImageIcon icon5 = new ImageIcon(getClass().getResource("/Globe.png"));
        Country.setIcon(icon5);
        repaint();
        add(Country);

        JLabel PhoneN= new JLabel("Recipient's Phone Number:");
        PhoneN.setLocation(30,310);
        PhoneN.setSize(1000,70);
        PhoneN.setFont(new Font("Cooper Black",Font.PLAIN,15));
        PhoneN.setForeground(new Color(129, 116, 160));
        PhoneN.setVisible(true);
        ImageIcon icon6 = new ImageIcon(getClass().getResource("/Cellphone.png"));
        PhoneN.setIcon(icon6);
        repaint();
        add(PhoneN);

        JLabel CAmount= new JLabel("Cash Amount:");
        CAmount.setLocation(30,400);
        CAmount.setSize(1000,70);
        CAmount.setFont(new Font("Cooper Black",Font.PLAIN,15));
        CAmount.setForeground(new Color(129, 116, 160));
        CAmount.setVisible(true);
        ImageIcon icon7 = new ImageIcon(getClass().getResource("/Money.png"));
        CAmount.setIcon(icon7);
        repaint();
        add(CAmount);

        //Account ID text Field
        JTextField textField = new JTextField();
        textField.setBounds(80, 180, 250, 30);
        textField.setSize(250,30);
        textField.setBackground(new Color(129, 116, 160)); // Custom background color
        textField.setBorder(BorderFactory.createLineBorder(new Color(240, 187, 120))); // Optional border
        textField.setBorder(BorderFactory.createLineBorder(new Color(169, 169, 169), 3));
        add(textField);

        //Country Text Field
        JTextField textField1 = new JTextField();
        textField1.setBounds(80, 270, 250, 30);
        textField1.setSize(250,30);
        textField1.setBackground(new Color(129, 116, 160)); // Custom background color
        textField1.setBorder(BorderFactory.createLineBorder(new Color(240, 187, 120))); // Optional border
        textField1.setBorder(BorderFactory.createLineBorder(new Color(169, 169, 169), 3));
        add(textField1);

        //Phone Number Text Field
        JTextField textField2 = new JTextField();
        textField2.setBounds(80, 450, 250, 30);
        textField2.setSize(250,30);
        textField2.setBackground(new Color(129, 116, 160)); // Custom background color
        textField2.setBorder(BorderFactory.createLineBorder(new Color(240, 187, 120))); // Optional border
        textField2.setBorder(BorderFactory.createLineBorder(new Color(169, 169, 169), 3));
        add(textField2);

        //Cash Amount Text Field
        JTextField textField3 = new JTextField();
        textField3.setBounds(80, 360, 250, 30);
        textField3.setSize(250,30);
        textField3.setBackground(new Color(129, 116, 160)); // Custom background color
        textField3.setBorder(BorderFactory.createLineBorder(new Color(240, 187, 120))); // Optional border
        textField3.setBorder(BorderFactory.createLineBorder(new Color(169, 169, 169), 3));
        add(textField3);


        JButton Max_btn = new JButton("MAX");
        Max_btn.setBounds(200, 200, 80, 20);
        Max_btn.setLocation(250,490);
        Max_btn.setHorizontalTextPosition(SwingConstants.CENTER);
        Max_btn.setVerticalTextPosition(SwingConstants.BOTTOM);
        Max_btn.setBackground(new Color(217, 234, 253));
        Max_btn.setForeground(new Color(26, 26, 29));
        Max_btn.setFont(new Font("Impact",Font.PLAIN,10));
        Max_btn.setBorder(BorderFactory.createEtchedBorder());
        Max_btn.setBorder(BorderFactory.createLineBorder(new Color(129, 116, 160), 2));
        Max_btn.setFocusable(false);
        repaint();
        add(Max_btn);

        JButton Cancel_btn = new JButton("Cancel");
        Cancel_btn.setBounds(565, 200, 100, 40);
        Cancel_btn.setLocation(60,560);
        Cancel_btn.setHorizontalTextPosition(SwingConstants.CENTER);
        Cancel_btn.setVerticalTextPosition(SwingConstants.BOTTOM);
        Cancel_btn.setBackground(new Color(217, 234, 253));
        Cancel_btn.setForeground(new Color(26, 26, 29));
        Cancel_btn.setFont(new Font("Impact",Font.PLAIN,20));
        Cancel_btn.setBorder(BorderFactory.createEtchedBorder());
        Cancel_btn.setBorder(BorderFactory.createLineBorder(new Color(129, 116, 160), 2));
        Cancel_btn.setFocusable(false);
        add(Cancel_btn);

        JButton Confirm_btn = new JButton("Confirm");
        Confirm_btn.setBounds(565, 280, 100, 40);
        Confirm_btn.setLocation(290,560);
        Confirm_btn.setHorizontalTextPosition(SwingConstants.CENTER);
        Confirm_btn.setVerticalTextPosition(SwingConstants.BOTTOM);
        Confirm_btn.setBackground(new Color(217, 234, 253));
        Confirm_btn.setForeground(new Color(26, 26, 29));
        Confirm_btn.setFont(new Font("Impact",Font.PLAIN,20));
        Confirm_btn.setBorder(BorderFactory.createEtchedBorder());
        Confirm_btn.setBorder(BorderFactory.createLineBorder(new Color(129, 116, 160), 2));
        Confirm_btn.setFocusable(false);
        add(Confirm_btn);

        // Load and display circular image
        ImageIcon maskImage = new ImageIcon(getClass().getResource("/mask_DB.jpg"));
        Image circularImage = makeCircularImage(maskImage.getImage(), 80); // Make the image circular
        JLabel imageLabel = new JLabel(new ImageIcon(circularImage));
        imageLabel.setBounds(185, 560, 80, 80); // Set the position and size of the image
        add(imageLabel);


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
        setVisible(true);
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
