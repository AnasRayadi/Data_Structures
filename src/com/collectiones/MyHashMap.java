package com.collectiones;
public class MyHashMap<K,V> {
    static final int SIZE = 10;
    Entry<K,V> table[];
    public MyHashMap(){
        table = new Entry[SIZE];
    }
    public class Entry<K,V>{
        private K key;
        private V value;
        Entry<K,V> next;
        public Entry(K key ,V value){
            this.key = key;
            this.value = value;
        }
        public K getKey(){
            return this.key;
        }
        public V getValue(){
            return this.value;
        }
        public void setValue(V value){
            this.value = value;
        }
    }
    public void put(K key ,V value){
        int hash = (key.hashCode()) % SIZE;
        Entry<K,V> e = table[hash];
        if (e == null){
            table[hash] = new Entry<K,V>(key, value);
        }
        else {
            while (e.next != null){
                if (e.getKey() == key){
                    e.setValue(value);
                    return;
                }
                e = e.next;
            }
            if (e.getKey() == key){
                e.setValue(value);
                return;
            }
            e.next = new Entry<K,V>(key, value);
        }
    }
    public V findValue(K key){
        int hash = (key.hashCode()) % SIZE;
        Entry<K,V> e = table[hash];
        if (e == null){
            return null;
        }
        while (e != null){
            if (e.getKey() == key){
                return e.getValue();
            }
            e = e.next;
        }
        return null;
    }
}
