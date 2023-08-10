package com.collectiones;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        /**Stack */
        /*Stack stack = new Stack();
        stack.push("java");
        stack.push("html");
        stack.push("c++");
        stack.push("c#");
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peek());*/


        /**LinkedList

        LinkedList linkedList=new LinkedList();
        linkedList.insert("java");
        linkedList.insert("c++");
        linkedList.insert("c#");
        linkedList.insert("php");
        //linkedList.insertAtFirst("python");
        //linkedList.insertAt(1,"html");
        linkedList.remove(2);
        linkedList.show();
        System.out.println("----------------------");
        System.out.println(linkedList.search("c++"));
         */
        /**Queue */
        /*
        Queue queue = new Queue();
        queue.enQueue("java");
        queue.enQueue("c#");
        queue.enQueue("js");
        queue.enQueue("css");
        queue.enQueue("css3");
        queue.enQueue("html");

        queue.show();
        System.out.println("--------------------------");
        System.out.println(queue.deQueue());
        System.out.println("--------------------------");
        queue.show();
        System.out.println("--------------------------");
        System.out.println(queue.deQueue());
        System.out.println("--------------------------");
        queue.show();*/

        /**HashMap */
        MyHashMap hashMap = new MyHashMap<>();
        hashMap.put("name1","Ray");
        hashMap.put("name1","Rayadi");
        hashMap.put("name3","Last Name1");
        hashMap.put("name4","Last Name2");
        System.out.println(hashMap.findValue("ame4"));

    }
}
