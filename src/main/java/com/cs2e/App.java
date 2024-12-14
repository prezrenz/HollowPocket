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

    App() {
        frames[FRAME.DASHBOARD.ordinal()] = new DashBoard(this);
        frames[FRAME.LOGIN.ordinal()] = new login_page(this);
        frames[FRAME.REGISTER.ordinal()] = new registration_page(this);
        frames[FRAME.DETAILS.ordinal()] = new PAccDetails(this);
        frames[FRAME.SENDING.ordinal()] = new SendingPage(this);
        frames[FRAME.RECEIVING.ordinal()] = new ReceivingPage(this);
        frames[FRAME.TRANSACTION.ordinal()] = new TransactionHistory(this);
    
        setFrame(FRAME.LOGIN);
    }

    void setFrame(FRAME newFrame) {
        frames[currentFrame.ordinal()].setVisible(false);
        frames[newFrame.ordinal()].setVisible(true);
        currentFrame = newFrame;
    }

    public static void main(String[] args) {
        new App();

        Hashmap<Integer> t = new Hashmap<Integer>();
        System.out.println("Inserting 1");
        t.insert("123456", 1);
        t.print();
    }
}
