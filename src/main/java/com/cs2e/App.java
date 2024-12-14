package com.cs2e;

import java.awt.CardLayout;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class App extends JFrame {
    
    JPanel mainPanel;
    CardLayout cardLayout;

    DashBoard dashboard;
    login_page loginPage;
    PAccDetails accDetails;
    SendingPage sendingPage;
    ReceivingPage receivingPage;
    TransactionHistory transactionHistory;

    App() {

        cardLayout = new CardLayout();
        mainPanel = new JPanel();
        mainPanel.setLayout(cardLayout);
        add(mainPanel);

        dashboard = new DashBoard();
        loginPage = new login_page();
        accDetails = new PAccDetails();
        sendingPage = new SendingPage();
        receivingPage = new ReceivingPage();
        transactionHistory = new TransactionHistory();

        mainPanel.add(dashboard, "Dashboard");
        mainPanel.add(loginPage, "Login");
        mainPanel.add(accDetails, "Details");
        mainPanel.add(sendingPage, "Sending");
        mainPanel.add(receivingPage, "Receiving");
        mainPanel.add(transactionHistory, "Transaction");

        cardLayout.show(mainPanel, "Login");

        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
    
        new App();

    }
}
