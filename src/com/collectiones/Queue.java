package com.collectiones;

import java.util.Arrays;

public class Queue<E> {
    int front = 0;
    int rear = -1;
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    String queue[] = new String[DEFAULT_CAPACITY];

    public void enQueue(String data){
        ensureCapacity();
        rear = (rear+1) % queue.length;
        queue[rear]=data;
        size++;
    }
    public String deQueue(){
        String removedItem = queue[front];
        //queue[front]=null;
        front = (front+1) % queue.length;
        size--;
        return removedItem;
    }
    private void ensureCapacity() {
        int newCapacity;
        if (size == queue.length){
            newCapacity = size * 2;
            queue = Arrays.copyOf(queue,newCapacity);
        }
    }
    public void show(){
        for (int i = 0; i < size ; i++) {
            System.out.print(queue[front + i]);
            System.out.println();
        }
    }


}
