package com.oocl;

import java.util.*;

public class PokerInputConverter {

  private static Integer NumberStringMapForValue(String s) {
    Map map = new HashMap();
    map.put("2", 2);
    map.put("3", 3);
    map.put("4", 4);
    map.put("5", 5);
    map.put("6", 6);
    map.put("7", 7);
    map.put("8", 8);
    map.put("9", 9);
    map.put("T", 10);
    map.put("J", 11);
    map.put("Q", 12);
    map.put("K", 13);
    map.put("A", 14);
    return (Integer) map.get(s);
  }

  public static List<Integer> convertToNumber(String[] input){
    List<Integer> numbers = new ArrayList();
    for (String str : input) {
      String s = str.substring(0, 1);
      numbers.add(NumberStringMapForValue(s));
    }
    Collections.sort(numbers);
    return numbers;
  }

  public static Map<Integer, Integer> convertToMap(String[] input){
    Map<Integer, Integer> countNumber = new HashMap();
    for (String str : input) {
      String s = str.substring(0, 1);
      Integer number = NumberStringMapForValue(s);
      countNumber.put(number, countNumber.containsKey(number)? countNumber.get(number) + 1 : 1);
    }
    return countNumber;
  }

}
