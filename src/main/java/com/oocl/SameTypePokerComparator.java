package com.oocl;

import java.util.List;

public class SameTypePokerComparator {
  public String compare(List<Integer> blackNumber, List<Integer> whiteNumber) {
    for (int i = blackNumber.size()-1; i >= 0; i--) {
      if (blackNumber.get(i) > whiteNumber.get(i)) {
        return "Black wins.";
      } else if (blackNumber.get(i) < whiteNumber.get(i)) {
        return "White wins.";
      }
    }
    return "Tie.";
  }
}
