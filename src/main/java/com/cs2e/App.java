package com.cs2e;

import javax.swing.JFrame;

public class App {

    public enum FRAME {
        DASHBOARD,
        LOGIN,
        REGISTER,
        DETAILS,
        SENDING,
        RECEIVING,
        TRANSACTION
    }

    FRAME currentFrame = FRAME.DASHBOARD;
    JFrame[] frames = new JFrame[7];

    DashBoard dashboard;
    login_page loginPage;
    registration_page registrationPage;
    PAccDetails accDetails;
    SendingPage sendingPage;
    ReceivingPage receivingPage;
    TransactionHistory transactionHistory;
    User currentUser;

    Database database;

    App() {
        dashboard = new DashBoard(this);
        loginPage = new login_page(this);
        registrationPage = new registration_page(this);
        accDetails = new PAccDetails(this);
        sendingPage = new SendingPage(this);
        receivingPage = new ReceivingPage(this);
        transactionHistory = new TransactionHistory(this);
        
        frames[FRAME.DASHBOARD.ordinal()] = dashboard;
        frames[FRAME.LOGIN.ordinal()] = loginPage;
        frames[FRAME.REGISTER.ordinal()] = registrationPage;
        frames[FRAME.DETAILS.ordinal()] = accDetails;
        frames[FRAME.SENDING.ordinal()] = sendingPage;
        frames[FRAME.RECEIVING.ordinal()] = receivingPage;
        frames[FRAME.TRANSACTION.ordinal()] = transactionHistory;
   
        setFrame(FRAME.LOGIN);

        database = new Database(this);
        currentUser = null;
    
    }

    void setFrame(FRAME newFrame) {
        frames[currentFrame.ordinal()].setVisible(false);
        frames[newFrame.ordinal()].setVisible(true);
        currentFrame = newFrame;
        frames[currentFrame.ordinal()].toFront();
    }

    public static void main(String[] args) {
        new App();

    }
}
