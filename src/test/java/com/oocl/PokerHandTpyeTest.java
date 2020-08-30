package com.oocl;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PokerHandTpyeTest {
  @Test
  void should_return_straight_flush_when_check_type_given_2H_3H_4H_5H_6H() {
    //given
    String[] input = {"2H", "3H", "4H", "5H", "6H"};
    //when
    PokerTypeHandler pokerTypeHandler = new PokerTypeHandler();
    PokerTypeEnum result = pokerTypeHandler.check(input);
    //then
    assertEquals("Straight flush", result.getPokerTypeName());
  }

  @Test
  void should_return_four_of_a_kind_when_check_type_given_2S_2H_2D_2H_6H() {
    //given
    String[] input = {"2S", "2H", "2D", "2H", "6H"};
    //when
    PokerTypeHandler pokerTypeHandler = new PokerTypeHandler();
    PokerTypeEnum result = pokerTypeHandler.check(input);
    //then
    assertEquals("Four of a kind", result.getPokerTypeName());
  }
}
