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

  @Test
  void should_return_full_house_when_check_type_given_3H_3D_5S_5C_3D() {
    //given
    String[] input = {"3H", "3D", "5S", "5C", "3D"};
    //when
    PokerTypeHandler pokerTypeHandler = new PokerTypeHandler();
    PokerTypeEnum result = pokerTypeHandler.check(input);
    //then
    assertEquals("Full House", result.getPokerTypeName());
  }

  @Test
  void should_return_flush_when_check_type_given_2H_3H_5H_9H_KH() {
    //given
    String[] input = {"2H", "3H", "5H", "9H", "KH"};
    //when
    PokerTypeHandler pokerTypeHandler = new PokerTypeHandler();
    PokerTypeEnum result = pokerTypeHandler.check(input);
    //then
    assertEquals("Flush", result.getPokerTypeName());
  }

  @Test
  void should_return_Straight_when_check_type_given_3H_4D_5S_6C_7D() {
    //given
    String[] input = {"3H", "4D", "5S" ,"6C" ,"7D"};
    //when
    PokerTypeHandler pokerTypeHandler = new PokerTypeHandler();
    PokerTypeEnum result = pokerTypeHandler.check(input);
    //then
    assertEquals("Straight", result.getPokerTypeName());
  }

  @Test
  void should_return_three_of_a_kind_when_check_type_given_3H_3D_5S_9C_3D() {
    //given
    String[] input = {"3H", "3D", "5S" ,"9C" ,"3D"};
    //when
    PokerTypeHandler pokerTypeHandler = new PokerTypeHandler();
    PokerTypeEnum result = pokerTypeHandler.check(input);
    //then
    assertEquals("Three of a Kind", result.getPokerTypeName());
  }

  @Test
  void should_return_two_pairs_when_check_type_given_3H_3D_5S_9C_5D() {
    //given
    String[] input = {"3H", "3D", "5S" ,"9C" ,"5D"};
    //when
    PokerTypeHandler pokerTypeHandler = new PokerTypeHandler();
    PokerTypeEnum result = pokerTypeHandler.check(input);
    //then
    assertEquals("Two Pairs", result.getPokerTypeName());
  }

  @Test
  void should_return_pair_when_check_type_given_3H_3D_5S_9C_KD() {
    //given
    String[] input = {"3H", "3D", "5S" ,"9C" ,"KD"};
    //when
    PokerTypeHandler pokerTypeHandler = new PokerTypeHandler();
    PokerTypeEnum result = pokerTypeHandler.check(input);
    //then
    assertEquals("Pair", result.getPokerTypeName());
  }
}
