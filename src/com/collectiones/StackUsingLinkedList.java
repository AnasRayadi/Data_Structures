package com.collectiones;

public class StackUsingLinkedList<E> {
    LinkedList linkedList = new LinkedList();
    public void push(E item){
        linkedList.insertAtFirst(item);
    }
    public E pop(){
            E removedItem = (E) linkedList.getFirst();
            linkedList.remove(linkedList.size() - linkedList.size());
            return removedItem;
    }
    public E peek(){
        return (E) linkedList.getFirst();
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
