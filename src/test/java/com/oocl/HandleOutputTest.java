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

  @Test
  public void should_return_white_wins_when_play_given_black_3H_3D_5S_9C_KD_and_white_4C_4H_5D_8C_KH() {
    //given
    String[] black = {"3H", "3D", "5S", "9C", "KD"};
    String[] white = {"4C", "4H", "5D", "8C", "KH"};
    //when
    PokerHandsGame pokerHandsGame = new PokerHandsGame();
    String result = pokerHandsGame.play(black, white);
    //then
    assertEquals("White wins.",result);
  }

  @Test
  public void should_return_white_when_play_given_black_8H_2D_2S_9C_8D_and_white_4C_5H_5S_6D_4H() {
    //given
    String[] black = {"8H", "2D", "2S", "9C", "8D"};
    String[] white = {"4C", "5H", "5S", "6D", "4H"};
    //when
    PokerHandsGame pokerHandsGame = new PokerHandsGame();
    String result = pokerHandsGame.play(black, white);
    //then
    assertEquals("Black wins.",result);
  }

  @Test
  public void should_return_white_when_play_given_black_3H_3D_5S_9C_3D_and_white_2C_4H_5S_4D_4H() {
    //given
    String[] black = {"3H", "3D", "5S", "9C", "3D"};
    String[] white = {"2C", "4H", "5S", "4D", "4H"};
    //when
    PokerHandsGame pokerHandsGame = new PokerHandsGame();
    String result = pokerHandsGame.play(black, white);
    //then
    assertEquals("White wins.",result);
  }

  @Test
  public void should_return_white_wins_when_play_given_black_3H_4D_5S_6C_7D_and_white_4H_5D_6S_7C_8H() {
    //given
    String[] black = {"3H", "4D", "5S", "6C", "7D"};
    String[] white = {"4H", "5D", "6S", "7C", "8H"};
    //when
    PokerHandsGame pokerHandsGame = new PokerHandsGame();
    String result = pokerHandsGame.play(black, white);
    //then
    assertEquals("White wins.",result);
  }

  @Test
  public void should_return_white_wins_when_play_given_black_2H_3D_4S_5C_6D_and_white_8H_9D_TS_JC_7D() {
    //given
    String[] black = {"2H", "3D", "4S", "5C", "6D"};
    String[] white = {"8H", "9D", "TS", "JC", "7D"};
    //when
    PokerHandsGame pokerHandsGame = new PokerHandsGame();
    String result = pokerHandsGame.play(black, white);
    //then
    assertEquals("White wins.",result);
  }
}
