package com.oocl;

import java.util.List;

public class PokerHandsGame {
  public String play(String[] black, String[] white) {
    PokerTypeHandler pokerTypeHandler = new PokerTypeHandler();
    PokerTypeEnum blackPokerType = pokerTypeHandler.check(black);
    PokerTypeEnum whitePokerType = pokerTypeHandler.check(white);

    if(blackPokerType.getPokerTypeNumber() > whitePokerType.getPokerTypeNumber()){
      return "Black wins.";
    } else if(blackPokerType.getPokerTypeNumber() < whitePokerType.getPokerTypeNumber()){
      return "White wins.";
    }

    List<Integer> blackNumber = PokerInputConverter.convertToNumber(black);
    List<Integer> whiteNumber = PokerInputConverter.convertToNumber(white);

    SameTypePokerComparator sameTypePokerComparator = new SameTypePokerComparator();

    return sameTypePokerComparator.compare(blackNumber, whiteNumber, blackPokerType);

  }
}
