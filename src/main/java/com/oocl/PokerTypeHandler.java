package com.oocl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PokerTypeHandler {

  public PokerTypeEnum check(String[] input) {
    if (isStraightFlush(input)) {
      return PokerTypeEnum.STRAIGHT_FLUSH;
    } else if (isFourOfAKind(input)) {
      return PokerTypeEnum.FOUR_OF_A_KIND;
    } else if (isFullHouse(input)) {
      return PokerTypeEnum.FULL_HOUSE;
    } else if (isFlush(input)) {
      return PokerTypeEnum.FLUSH;
    }
    return PokerTypeEnum.HIGH_CARD;
  }

  private boolean isStraightFlush(String[] input) {
    List<Integer> numbers = PokerInputConverter.convertToNumber(input);
    for (int i = 1; i < numbers.size(); i++) {
      if ((Integer.parseInt(String.valueOf(numbers.get(i))) - 1) != Integer.parseInt(String.valueOf(numbers.get(i - 1)))) {
        return false;
      }
    }
    Character[] suits = new Character[input.length];
    for (int i = 0; i < input.length; i++) {
      suits[i] = input[i].charAt(1);
    }
    return Arrays.stream(suits).distinct().count() == 1;
  }

  private boolean isFourOfAKind(String[] input) {
    Map<Integer, Integer> countNumber = PokerInputConverter.convertToCountNumberMap(input);
    if (countNumber.size() != 2) {
      return false;
    }
    for (Integer key : countNumber.keySet()) {
      if (countNumber.get(key) == 4) {
        return true;
      }
    }
    return false;
  }

  private boolean isFullHouse(String[] input) {
    Map<Integer, Integer> countNumber = PokerInputConverter.convertToCountNumberMap(input);
    if (countNumber.size() != 2) {
      return false;
    }
    for (Integer key : countNumber.keySet()) {
      if (countNumber.get(key) == 3 || countNumber.get(key) == 2) {
        return true;
      }
    }
    return false;
  }

  private boolean isFlush(String[] input) {
    Character[] suits = new Character[input.length];
    for (int i = 0; i < input.length; i++) {
      suits[i] = input[i].charAt(1);
    }
    return Arrays.stream(suits).distinct().count() == 1;
  }

}
