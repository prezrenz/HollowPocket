package com.cs2e;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Transaction implements Comparable<Transaction> {
    String type;
    String to;
    String from;
    float amount;
    Date date;

    String datePattern = "dd/MM/yyyy hh:mm:ss";
    DateFormat dateFormat = new SimpleDateFormat(datePattern);

    Transaction(String type, String to, String from, float amount, Date date)
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
        return String.format("%s|%s|%s|%s|%s", type, to, from, amount, dateFormat.format(date));
    }

    @Override
    public int compareTo(Transaction t) {
        return date.compareTo(t.date);
    }

}


