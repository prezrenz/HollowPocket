package com.cs2e;

public class User {
    String accountId;
    String username;
    String password;
    Float balance;
    String country;
    String phoneNumber;
    Transaction[] transactionHistory;

    User(String accountId, String username, String password, Float balance,
        String country, String phoneNumber) 
    { 
        this.accountId = accountId;
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return String.format("%s:%s:%s:%f:%s:%s",
                            accountId, username, password, balance,
                            country, phoneNumber);
    }

    public void addBalance(float amount) {
        balance += amount;
    }

    public void subBalance(float amount) {
        balance -= amount;
    }
}