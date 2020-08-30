package com.oocl;

import java.util.List;
import java.util.Map;

public class SameTypePokerComparator {
  public String compare(List<Integer> blackNumber, List<Integer> whiteNumber, PokerTypeEnum pokerType) {
    if (pokerType.getPokerTypeName().equals("High Card")) {
      return highCardCompare(blackNumber, whiteNumber);
    } else if (pokerType.getPokerTypeName().equals("Pair")) {
      return pairCompare(blackNumber, whiteNumber);
    } else if (pokerType.getPokerTypeName().equals("Two Pairs")) {
      return twoPairsCompare(blackNumber, whiteNumber);
    } else if (pokerType.getPokerTypeName().equals("Three of a Kind")) {
      return threeOfAKindCompare(blackNumber, whiteNumber);
    }
    return "";
  }

  private String threeOfAKindCompare(List<Integer> blackNumber, List<Integer> whiteNumber) {
    if (blackNumber.get(2) > whiteNumber.get(2)) {
      return "Black wins.";
    }
    return "White wins.";
  }

  private String twoPairsCompare(List<Integer> blackNumber, List<Integer> whiteNumber) {
    Map<Integer, Integer> blackNumberMap = PokerInputConverter.convertToCountNumberMap(blackNumber);
    Map<Integer, Integer> whiteNumberMap = PokerInputConverter.convertToCountNumberMap(whiteNumber);
    Integer maxBlackNumber = getMaxMapNumber(blackNumberMap);
    Integer maxWhiteNumber = getMaxMapNumber(whiteNumberMap);
    if(maxBlackNumber> maxWhiteNumber){
      return "Black wins.";
    }
    return "White wins.";
  }

  private Integer getMaxMapNumber(Map<Integer, Integer> NumberMap) {
    Integer maxNumber = 0;
    for (Integer key : NumberMap.keySet()) {
      Integer number = NumberMap.get(key);
      if(number == 2 && key > maxNumber){
        maxNumber = key;
      }
    }
    return maxNumber;
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


