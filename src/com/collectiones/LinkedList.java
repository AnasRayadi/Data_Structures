package com.collectiones;

public class LinkedList {
    Node head;
    public void insert(String data){
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=null;
        if (head==null){
            head=newNode;
        }
        else {
            Node node = head;
            while (node.next != null){
                node=node.next;
            }
            node.next=newNode;
        }
    }
    public void insertAtFirst(String data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }
    public void insertAt(int pos,String data){
        Node newNode = new Node();
        newNode.data = data;
        if (pos == 0){
            insertAtFirst(data);
        }
        else {
            Node node = head;
            for (int i = 0; i < pos-1; i++) {
                node=node.next;
            }
            newNode.next = node.next;
            node.next = newNode;
        }
    }
    public void remove(int index){
        if (index==0){
            head=head.next;
        }
        else {
            Node node=head;
            Node removedNode=null;
            for(int i=0;i<index-1;i++) {
                node = node.next;
            }
            removedNode=node.next;
            node.next=removedNode.next;
        }
    }
    public boolean search(String data){
        Node node=head;
        while (node.next.data != data){
            node = node.next;
        }
        if (node.next != null){
            return true;
        }
        return false;
    }
    public void show(){
        Node node = head;
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
