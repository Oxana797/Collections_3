package com.example.mydemo.task3;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    System.out.println("Task 3");
    ArrayList<String> list = new ArrayList<>();
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("2");
    list.add("1");

    for( int index = 0; index < list.size(); index++) {
      System.out.println(index + ": " + list.get(index));
    }
  }

}
