package com.cs2e;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;

public class User {
    public String accountId;
    public String username;
    public String password;
    public Float balance;
    public String country;
    public String phoneNumber;
    public ArrayList<Transaction> transactionHistory;
    public String transactionFileName;

    User(String accountId, String username, String password, Float balance,
        String country, String phoneNumber) 
    { 
        this.accountId = accountId;
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.country = country;
        this.phoneNumber = phoneNumber;
        transactionHistory = new ArrayList<Transaction>();
        transactionFileName = accountId.concat(".trs");

        File transactionFile = new File(transactionFileName);
        
        if(!transactionFile.exists()) {
            try {
                transactionFile.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                FileReader fileReader = new FileReader(transactionFileName);
                BufferedReader reader = new BufferedReader(fileReader);
                String line = reader.readLine();
                
                while(line != null) {                
                    Transaction transaction = stringToTransaction(line);
                    transactionHistory.add(transaction);
                    line = reader.readLine();
                }
                
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(!transactionHistory.isEmpty()) {
            Collections.sort(transactionHistory);
        }
    }

    Transaction stringToTransaction(String data) {

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

        String[] split = data.split("|");
        String type = split[0];
        String to = split[1];
        String from = split[2];
        Float amount = Float.parseFloat(split[3]);
        Date date = new Date(); //HACK: hopefully this doesnt become a problem

        try {
            date = df.parse(split[4]);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        Transaction transaction = new Transaction(type, to, from, amount, date);
        
        return transaction;    
    }

    String transactionsToString() {
        String data = "";

        for (Transaction transaction : transactionHistory) {
            data = data.concat(transaction.toString().concat("\n"));
        }

        return data;
    }

    void transactionsToFile() {
        try {
            FileWriter writer = new FileWriter(transactionFileName);
            writer.write(transactionsToString());

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void newTransaction(String type, String to, String from, float amount) {
        Transaction transaction = new Transaction(type, to, from, amount, new Date());
        transactionHistory.add(transaction);
        Collections.sort(transactionHistory);
        transactionsToFile();
    }

    public String toString() {
        return String.format("%s|%s|%s|%f|%s|%s",
                            accountId, username, password, balance,
                            country, phoneNumber);
    }

    public void addBalance(float amount) {
        balance += amount;
    }

    public void subBalance(float amount) {
        balance -= amount;
        if(balance < 0.0f){
            balance = 0.0f;
        }
    }
}
