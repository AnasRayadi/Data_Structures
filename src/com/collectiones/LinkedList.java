package com.collectiones;

public class LinkedList<E> {
    Node<E> head;
    int size;
    public void insert(E data){
        Node<E> newNode = new Node();
        newNode.data=data;
        newNode.next=null;
        if (head==null){
            head=newNode;
        }
        else {
            Node<E> node = head;
            while (node.next != null){
                node=node.next;
            }
            node.next=newNode;
        }
        size++;
    }
    public void insertAtFirst(E data){
        Node<E> node = new Node();
        node.data = data;
        node.next = head;
        head = node;
        size++;
    }
    public void insertAt(int pos,E data){
        Node<E> newNode = new Node();
        newNode.data = data;
        if (pos == 0){
            insertAtFirst(data);
        }
        else {
            Node<E> node = head;
            for (int i = 0; i < pos-1; i++) {
                node=node.next;
            }
            newNode.next = node.next;
            node.next = newNode;
        }
        size++;
    }
    public void remove(int index){
        if (index==0){
            head=head.next;
        }
        else {
            Node<E> node=head;
            Node<E> removedNode=null;
            for(int i=0;i<index-1;i++) {
                node = node.next;
            }
            removedNode=node.next;
            node.next=removedNode.next;
        }
        size--;
    }

    public E getFirst() {
        return head.data;
    }

    public Node<E> getLast(){
        if (size != 0){
            Node<E> node = head;
            for (int i = 0; i < size-1; i++) {
                node = node.next;
            }
            return node;
        }
        return null;
    }
    public boolean contains(E data){
        Node<E> node=head;
        while (node.next.data != data){
            node = node.next;
        }
        if (node.next != null){
            return true;
        }
        return false;
    }
    public int size(){
        return size;
    }
    public void show(){
        Node<E> node = head;
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
