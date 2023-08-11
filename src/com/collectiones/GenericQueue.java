package com.collectiones;

public class GenericQueue<E> {
    private QueueNode<E> front;
    private QueueNode<E> rear;
    class QueueNode<E>{
        E data;
        QueueNode<E> next;
        public  QueueNode(E data){
            this.data = data;
            this.next = null;
        }
    }
    public GenericQueue(){
        front = null;
        rear = null;
    }
    public void enqueue(E data){
        QueueNode<E> newQueue = new QueueNode<>(data);
        if (rear == null){
            front = newQueue;
            rear = newQueue;
        }
        else {
            rear.next = newQueue;
            rear = newQueue;
        }
    }
    public E dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty!");
        }
        E data = front.data;
        front = front.next;
        if (front == null)
            rear = null;
        return data;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public void show(){
        QueueNode queue = front;
        while (queue.next != null){
            System.out.println(queue.data);
            queue = queue.next;
        }
        System.out.println(queue.data);
    }
}
