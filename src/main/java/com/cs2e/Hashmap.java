package com.cs2e;

/*
 *
 *  A Hashmap implementation
 *  with digit 1st-3rd-5th extraction
 *  and linear probing collision resolution
 *
*/
import java.lang.reflect.Array;

public class Hashmap<T> {

    public int size;
    public int count;
    public T[] items;

    @SuppressWarnings("unchecked")
    Hashmap(Class<T> clazz) {
        size = 10;
        count = 0;
        items = (T[]) Array.newInstance(clazz, size);
    }

    @SuppressWarnings("unchecked")
    Hashmap(Class<T> clazz, int size) {
        this.size = size;
        count = 0;
        items = (T[]) Array.newInstance(clazz, this.size);
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

    public int getHash(String key) {
        return hash(key);
    }

    private int hash(String key) {
        return extract(key) % size;
    }

    private int extract(String key) {

        // should check if key is only number

        String extractedNumber = "";
        extractedNumber = extractedNumber.concat(String.valueOf(key.charAt(0)));
        extractedNumber = extractedNumber.concat(String.valueOf(key.charAt(2)));
        extractedNumber = extractedNumber.concat(String.valueOf(key.charAt(4)));

        return Integer.parseInt(extractedNumber);
    }

    public void print() {
        for(int i = 0; i < size; i++) {
            if(items[i] != null) {
                System.out.println("Index: " + items[i].toString());
            }
        }
    }

}
