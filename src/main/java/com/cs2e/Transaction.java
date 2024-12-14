package com.cs2e;

import java.util.Date;

public class Transaction {
    String type;
    String to;
    String from;
    String amount;
    Date date;

    Transaction(String type, String to, String from, String amount, Date date)
    {
        this.type = type;
        this.to = to;
        this.from = from;
        this.amount = amount;
        this.date = date;
    }

    Object[] tabularize() {
        Object[] data = {type, to, from, amount, date};
        return data;
    }

    public String toString() {
        return String.format("%s:%s:%s:%s:%s", type, to, from, amount, date.toString());
    }

}


