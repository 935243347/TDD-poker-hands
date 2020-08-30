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
}
