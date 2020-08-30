package com.oocl;

import java.util.*;

public class PokerTypeHandler {

  public PokerTypeEnum check(String[] input) {
    if (isStraightFlush(input)) {
      return PokerTypeEnum.STRAIGHT_FLUSH;
    }
    return PokerTypeEnum.HIGH_CARD;
  }

  private Integer NumberStringMapForValue(String s) {
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

  private boolean isStraightFlush(String[] input) {
    List<Integer> numbers = new ArrayList();
    for (String str : input) {
      String s = str.substring(0, 1);
      numbers.add(NumberStringMapForValue(s));
    }
    Collections.sort(numbers);

    for (int i = 1; i < numbers.size(); i++) {
      if ((Integer.parseInt(String.valueOf(numbers.get(i))) - 1) != Integer.parseInt(String.valueOf(numbers.get(i-1)))) {
        return false;
      }
    }

    Character[] suits = new Character[input.length];
    for (int i = 0; i < input.length; i++) {
      suits[i] = input[i].charAt(1);
    }

    return Arrays.stream(suits).distinct().count() == 1;
  }


}
