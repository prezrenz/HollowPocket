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
    private int[] items;

    Hashmap() {
        size = 10;
        count = 0;
        items = new int[size];
    }

    Hashmap(int size) {
        this.size = size;
        count = 0;
        items = new int[this.size];
    }

    public void insert(T object, String key) {

    }
/*
    public T search(String key) {

    }

    public void delete(String key) {

    }

    private void resizeUp() {

    }

    private void resizeDown() {

    }

    private float calculateLoad() {

    }

    private int hash(String key) {

    }

    private int extract(String key) {

    }
*/
}
