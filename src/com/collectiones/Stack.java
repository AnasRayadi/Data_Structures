package com.collectiones;

import java.util.ArrayList;
import java.util.Arrays;

public class Stack {
    String[] arrayData ;
    ArrayList newArray = new ArrayList();
    int top;
    static final int DEFAULT_CAPACITY=10;
    public Stack(){
        arrayData =  new String[DEFAULT_CAPACITY];
        int top = -1;
    }
    public void push(String data){
        if(top==arrayData.length)
            ensureCapacity();
        top++;
        arrayData[top] = data;
    }

    private void ensureCapacity() {
        int newCapacity;
        if(top == arrayData.length){
            newCapacity = top * 2;
            arrayData = Arrays.copyOf(arrayData,newCapacity);
        }
    }
    private void shrinkCapacity() {
        int newCapacity;
        if(top < arrayData.length){
            newCapacity = top --;
            arrayData = Arrays.copyOf(arrayData,newCapacity);
        }
    }

    public String pop(){
        String item="";
        if (isEmpty()){
            System.out.println("Stack is Empty!");
        }
        else
        {
            item = arrayData[top];
            arrayData[top] = null;
            top--;
            shrinkCapacity();
        }
        return item;
    }
    public String peek(){
        if (!isEmpty()) {
            return arrayData[top];
        }
        return "Stack is Empty!";
    }
    public boolean isEmpty(){
        if (top == -1)
            return true;
        return false;
    }
    public int size(){
        return top;
    }
}
