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

    Database() {
        File databaseFile = new File(databaseFileName);

        if(!databaseFile.exists()) {
            User admin = new User("000000", "admin", "admin",
                                    0.0f, "void", "null");
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

        for (User user : database.items) {
            data = data.concat(user.toString()).concat("\n");//i think we fucked up come come come
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
        for (User user : database.items) {
            if(key.equalsIgnoreCase(user.accountId)) {
                return user;
            }
        }

        throw new DatabaseError("User not found");
    }

    void newUser(String username, String password, String country, String phoneNumber) {
        for (User user : database.items) {
            if((username.equals(user.username))) {
                throw new DatabaseError("User already exists, please use a different name");
            }
        } 

        User newUser = new User(generateAccountId(), username, password, 500.00f, country, phoneNumber);
        database.insert(newUser.accountId, newUser);
        
        usersToFile();
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    } // thank you baeldung

    String generateAccountId() {
        String generatedId = "";

        generatedId = generatedId.concat(String.valueOf(getRandomNumber(48, 57)));
        generatedId = generatedId.concat(String.valueOf(getRandomNumber(48, 57)));
        generatedId = generatedId.concat(String.valueOf(getRandomNumber(48, 57)));
        
        generatedId = generatedId.concat(String.valueOf(getRandomNumber(48, 57)));
        generatedId = generatedId.concat(String.valueOf(getRandomNumber(48, 57)));
        generatedId = generatedId.concat(String.valueOf(getRandomNumber(48, 57)));

        return generatedId;
    }
}
