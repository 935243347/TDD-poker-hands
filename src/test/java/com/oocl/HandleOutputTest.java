package com.oocl;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HandleOutputTest {

  @Test
  public void should_return_white_wins_when_play_given_black_2H_3D_5S_9C_KD_and_white_2C_3H_4S_5C_AH() {
    //given
    String[] black = {"2H", "3D", "5S", "9C", "KD"};
    String[] white = {"2C", "3H", "4S", "5C", "AH"};
    //when
    PokerHandsGame pokerHandsGame = new PokerHandsGame();
    String result = pokerHandsGame.play(black, white);
    //then
    assertEquals("White wins.",result);
  }
}
