package com.demo;

import com.demo.LinkedList.DefaultDoublyLinkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int k = 3;
        int[] a = {1,4,2,3,5};
        int[] b;
        b = new int[a.length-1];
        for(int i=0, j=0;i<a.length;i++, j++) {
            if(a[i] == a[k]){
                j--;
            } else {
                b[j] = a[i];
            }
        }

        for(int i:b) {
            System.out.println(i);
        }

/*
        DynamicArray<String> list = new DynamicArray<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.indexOf("3"));
        System.out.println(list.isEmpty());
        System.out.println(list.contains("2"));
        list.removeAt(0);
        list.remove("2");
        System.out.println(list);
*/

        DefaultDoublyLinkedList<Integer> linkedList = new DefaultDoublyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.addFirst(9);
        linkedList.addLast(6);
        System.out.println(linkedList.contains(4));
        linkedList.remove(3);
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.removeAt(2);
        System.out.println(linkedList.indexOf(4));
        System.out.println(linkedList);
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.size());
        System.out.println(linkedList.iterator().next());
    }
}
