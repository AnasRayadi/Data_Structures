package com.collectiones;

public class StackUsingLinkedList<E> {
    LinkedList linkedList = new LinkedList();
    public void push(E item){
        linkedList.insert(item);
    }
    public E pop(){
            E removedItem = (E) linkedList.getLast();
            linkedList.remove(linkedList.size()-1);
            return removedItem;
    }
    public E peek(){
        return (E) linkedList.getLast();
    }
    public int size(){
        return linkedList.size();
    }
    public boolean isEmpty(){
        return linkedList.size() == 0;
    }
    public void display(){
        linkedList.show();
    }
}
