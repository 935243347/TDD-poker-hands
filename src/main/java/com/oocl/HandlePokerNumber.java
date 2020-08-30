package com.oocl;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class HandlePokerNumber {
  public List<String> getPokerNumber(String pokerInput) {
//    "Black: 2H 3D 5S 9C KD White: 2C 3H 4S 8C AH"
    String[] str = pokerInput.split(" ");
    StringJoiner joiner1 = new StringJoiner(",");
    StringJoiner joiner2 = new StringJoiner(",");
    for (int i = 1 ; i <= 5; i++){
      joiner1.add(str[i]);
    }
    for (int i = 7 ; i <= 11; i++){
      joiner2.add(str[i]);
    }
    List list = new ArrayList<String>();
    list.add(joiner1.toString());
    list.add(joiner2.toString());
    return list;
  }
}
