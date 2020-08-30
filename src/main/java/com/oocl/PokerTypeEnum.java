package com.oocl;

public enum PokerTypeEnum {

  HIGH_CARD("High Card", 1),

  PAIR("Pair", 2),

  TWO_PAIRS("Two Pairs", 3),

  THREE_OF_A_KIND("Three of a Kind", 4),

  STRAIGHT("Straight", 5),

  FLUSH("Flush", 6),

  FULL_HOUSE("Full House", 7),

  FOUR_OF_A_KIND("Four of a kind", 8),

  STRAIGHT_FLUSH("Straight flush", 9);

  private String PokerTypeName;
  private Integer PokertypeNumber;

  private PokerTypeEnum(String PokerTypeName, Integer PokertypeNumber) {
    this.PokerTypeName = PokerTypeName;
    this.PokertypeNumber = PokertypeNumber;
  }

  public Integer getPokerTypeNumber() {
    return PokertypeNumber;
  }

  public String getPokerTypeName() {
    return PokerTypeName;
  }
}
