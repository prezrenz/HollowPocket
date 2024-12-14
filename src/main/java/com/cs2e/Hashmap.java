package com.cs2e;

/*
 *
 *  A Hashmap implementation
 *  with digit 1st-3rd-5th extraction
 *  and linear probing collision resolution
 *
*/


public class Hashmap<T> {

    private int size;
    private int count;
    public T[] items;


    Hashmap() {
        size = 10;
        count = 0;
        items = (T[]) new Object[size];
    }

    Hashmap(int size) {
        this.size = size;
        count = 0;
        items = (T[]) new Object[this.size];
    }

    public void insert(String key, T object) {
        int hash = hash(key);
        int i = hash;
        while(items[i] != null) {
            i++;
        }
        items[i] = object;

        count += 1;
    }
/*
    public void delete(String key) {
        
    }
*/
    private int hash(String key) {
        return extract(key) % size;
    }

    private int extract(String key) {

        // should check if key is only number

        String extractedNumber = "";
        extractedNumber = extractedNumber.concat(String.valueOf(key.charAt(1)));
        extractedNumber = extractedNumber.concat(String.valueOf(key.charAt(3)));
        extractedNumber = extractedNumber.concat(String.valueOf(key.charAt(5)));

        return Integer.parseInt(extractedNumber);
    }

    public void print() {
        for(int i = 0; i < size; i++) {
            if(items[i] != null) {
                System.out.println(items[i].toString());
            }
        }
    }

}
