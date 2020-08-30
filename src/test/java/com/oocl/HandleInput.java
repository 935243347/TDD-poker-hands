package com.oocl;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class HandleInput {

  @Test
  void should_return_string_array_when_handle_poker_number_given_poker_string() {
    //given
    String pokerInput = "Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH";
    //when
    HandlePokerNumber handlePokerNumber = new HandlePokerNumber();
    List<String> pokerNumber = handlePokerNumber.getPokerNumber(pokerInput);
    //then
    assertEquals("2H,3D,5S,9C,KD", pokerNumber.get(0));
    assertEquals("2C,3H,4S,8C,AH", pokerNumber.get(1));
  }
}
