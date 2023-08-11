package com.collectiones;
public class DoublyLinkedList<E> {
    Node<E> head;
    Node<E> tail;
    private int size;
    public void insert(E data){
        Node<E> newNode = new Node();
        newNode.data = data;
        if (isEmpty()){
            head = tail = newNode;
        }
        else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void insertAtFirst(E data){
        Node<E> newNode = new Node();
        newNode.data = data;
        if (isEmpty()){
            head = tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void insertAt(int pos,E data){
        Node<E> newNode = new Node();
        newNode.data = data;
        if(pos == 0){
            insertAtFirst(data);
        }
        else {
            Node<E> node = head;
            for (int i = 0; i <pos-1 ; i++) {
                node = node.next;
            }
            newNode.next = node.next;
            node.next = newNode;
            newNode.prev = node;
            newNode.next.prev = newNode;

        }
        size++;
    }
    public void remove(int index){
        Node<E> removedNode;
        if (index == 0){
            removedNode = head;
            head = head.next;
            head.next.prev = null;
            System.out.println(removedNode.data + " Has been deleted!");
        }
        else {
            Node<E> node = head;
            for (int i = 0; i <index-1 ; i++) {
                node = node.next;
            }
            removedNode = node.next;
            node.next = removedNode.next;
            removedNode.next.prev = node;
            System.out.println(removedNode.data + " Has been deleted!");
        }
        size--;

    }
    public void display(){
        Node<E> node = head;
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public int size(){
        return size;
    }

}
