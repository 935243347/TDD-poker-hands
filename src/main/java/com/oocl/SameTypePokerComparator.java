package com.oocl;

import java.util.List;

public class SameTypePokerComparator {
  public String compare(List<Integer> blackNumber, List<Integer> whiteNumber, PokerTypeEnum pokerType) {
    if (pokerType.getPokerTypeName().equals("High Card")) {
      return highCardCompare(blackNumber, whiteNumber);
    } else if(pokerType.getPokerTypeName().equals("Pair")){
      return pairCompare(blackNumber, whiteNumber);
    }
    return "";
  }

  private String pairCompare(List<Integer> blackNumber, List<Integer> whiteNumber) {
    if (getPairNumber(blackNumber) > getPairNumber(whiteNumber)) {
      return "Black wins.";
    }
    return "White wins.";
  }

  private int getPairNumber(List<Integer> pokerNumber) {
    for (int i = 1; i < 5; i++) {
      if (pokerNumber.get(i) == pokerNumber.get(i - 1)) {
        return pokerNumber.get(i);
      }
    }
    return 0;
  }

  public String highCardCompare(List<Integer> blackNumber, List<Integer> whiteNumber) {
    for (int i = blackNumber.size() - 1; i >= 0; i--) {
      if (blackNumber.get(i) > whiteNumber.get(i)) {
        return "Black wins.";
      } else if (blackNumber.get(i) < whiteNumber.get(i)) {
        return "White wins.";
      }
    }
    return "Tie.";
  }

}
