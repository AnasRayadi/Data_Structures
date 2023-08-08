package com.collectiones;

public class Queue {
    String arrayData[] = new String[5];
    int front = 0;
    int rear = 0;
    int size = 0;
    public void enQueue(String data){
        arrayData[rear]=data;
        rear++;
        size++;
    }
    public void deQueue(){

        arrayData[front]=arrayData[front+1];
        front++;
        size--;
    }
    public void show(){
        for (int i = 0; i <size ; i++) {
            System.out.print(arrayData[front + i]);
            System.out.println();
        }
    }


}
