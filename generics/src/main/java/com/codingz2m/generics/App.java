package com.codingz2m.generics;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
     //   ArrayList items = new ArrayList();
        ArrayList <Integer> items = new ArrayList <Integer> ();
        items.add(1);
        items.add(2);
        items.add(3);
  // items.addAll("tim");
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList <Integer> n) {
        
    	for(Integer i : n) {
           System.out.println(i * 2);
           
        }
    }
}

