package com.cs2e;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Database {

    static class DatabaseError extends RuntimeException {
        String msg;

        DatabaseError(String msg) {
            this.msg = msg;
        }

        public String getMsg() {
            return msg;
        }
    }

    Hashmap<User> database;
    String databaseFileName = "users.dat";

    App mainApp;

    Database(App parent) {
        mainApp = parent;
        File databaseFile = new File(databaseFileName);
        database = new Hashmap<User>(User.class, 10);

        if(!databaseFile.exists()) {
            User admin = new User("000000", "admin", "admin",
                                    0.0f, "null", "null");
            database.insert(admin.accountId, admin);

            try {
                FileWriter databaseWriter = new FileWriter(databaseFile); 
                databaseWriter.write(usersToString());

                databaseWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            try {
                FileReader databaseReader = new FileReader(databaseFile); 
                BufferedReader reader = new BufferedReader(databaseReader);

                String line = reader.readLine();

                while(line != null) {
                    User newUser = stringToUser(line);
                    database.insert(newUser.accountId, newUser);
                    line = reader.readLine();
                }

                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }

    void usersToFile()
    {
        try {
            FileWriter databaseWriter = new FileWriter(databaseFileName);
            databaseWriter.write(usersToString());

            databaseWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    String usersToString() {
        String data = "";

        for(int i = 0; i < database.size; i++) {
            User user = (User) database.items[i];
            if(user != null) {
                data = data.concat(user.toString()).concat("\n");
            }
        }

        return data;
    }

    User stringToUser(String data) {
        String[] split = data.split(":");

        String accountId = split[0];
        String username = split[1];
        String password = split[2];
        Float balance = Float.parseFloat(split[3]);
        String country = split[4];
        String phoneNumber = split[5];
        
        User newUser = new User(accountId, username, password,
                                balance, country, phoneNumber);

        return newUser;
    }
 
    User findUser(String key) {
        for(int i = 0; i < database.size; i++) {
            User user = (User) database.items[i];
            if(user != null && key.equalsIgnoreCase(user.accountId)) {
                return user;
            }
        }

        throw new DatabaseError("User not found");
    }

    User login(String username, String password) {
        for(int i = 0; i < database.size; i++) {
            User user = (User) database.items[i];
            if(user != null && username.equalsIgnoreCase(user.username) &&
                password.equalsIgnoreCase(user.password)) {
                return user;
            }
        }

        throw new DatabaseError("User not found, potentially incorrect username or password.");

    }

    void newUser(String username, String password, String country, String phoneNumber) {
        
        for(int i = 0; i < database.size; i++) {
            User user = (User) database.items[i];
            if((user != null) && (username.equals(user.username)) ) {
                throw new DatabaseError("User already exists, please use a different name");
            }
        }

        User newUser = new User(generateAccountId(), username, password, 500.00f, country, phoneNumber);
        database.insert(newUser.accountId, newUser);
        mainApp.currentUser = newUser;
        
        usersToFile();
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    } // thank you baeldung

    String generateAccountId() {
        String generatedId = "";

        generatedId = generatedId.concat(String.valueOf((char)getRandomNumber(48, 57)));
        generatedId = generatedId.concat(String.valueOf((char)getRandomNumber(48, 57)));
        generatedId = generatedId.concat(String.valueOf((char)getRandomNumber(48, 57)));
        
        generatedId = generatedId.concat(String.valueOf((char)getRandomNumber(48, 57)));
        generatedId = generatedId.concat(String.valueOf((char)getRandomNumber(48, 57)));
        generatedId = generatedId.concat(String.valueOf((char)getRandomNumber(48, 57)));

        System.out.println(generatedId);

        return generatedId;
    }

    void transaction(String from, String to, float amount, String country, String phoneNumber) {
        User toUser;
        User fromUser;

        try {
            toUser = findUser(to);
            fromUser = findUser(from);
        } catch (DatabaseError e) {
            throw e;
        }
        
        if(!country.equals(toUser.country) || !phoneNumber.equals(toUser.phoneNumber)) {
            throw new DatabaseError("Details mismatch, check the country and phone number again.");
        }

        fromUser.subBalance(amount);
        toUser.addBalance(amount);
        
        fromUser.newTransaction("Send", toUser.username, fromUser.username, amount);
        toUser.newTransaction("Receive", toUser.username, fromUser.username, amount);

        usersToFile();
    }
}
