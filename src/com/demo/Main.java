package com.demo;

import com.demo.DynamicArray.DynamicArray;

public class Main {

    public static void main(String[] args) {

        int k = 3;
        int a[] = {1,4,2,3,5};
        int b[] = new int[a.length-1];
        for(int i=0, j=0;i<a.length;i++, j++) {
            if(a[i] == a[k]){
                j--;
            } else {
                b[j] = a[i];
            }
        }

        for(int i=0;i<b.length;i++) {
            System.out.println(b[i]);
        }

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



    }
}
