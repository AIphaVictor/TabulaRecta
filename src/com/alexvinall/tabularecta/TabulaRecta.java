package com.alexvinall.tabularecta;

/**
 * Generates a Tabula Recta to standard output.
 *
 * @author Alex Vinall 2016
 */
public class TabulaRecta {


  /**
   * Prints a Tabula Recta to standard out.
   *
   * @param args
   */
  public static void main (String[] args) {
    String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    for (int i = 0; i < 26; i++) {
      System.out.println(s);
      String end = s.substring(0, 1);
      String start = s.substring(1, 26);
      s = start.concat(end);
    }
  }
}
