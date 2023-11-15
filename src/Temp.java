/*
 * Hajdara Patrik, 2023-11-14
 * Copyright (c) 2023, Hajdara Patrik
 * Licenc: MIT
 * Az esetlegesen elofordulo hibakert nem all modomban felelosseget vallalni
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Temp {

  ArrayList<Double> tempDetails;

  public Temp() {
    Double[] changes = { 2.5, 2.8, 1.2, 0.5, -1.1 };
    this.tempDetails = new ArrayList<>(Arrays.asList(changes));
  }

  public void celsius() {
    String time = "";
    while (!time.equals("done")) {
      time = information();
      lep(time);
    }
  }

  public String information() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Temperature: ");
    return scan.nextLine();
  }

  public void lep(String tempStr) {
    if (!tempStr.equals("done")) {
      output(tempStr);
    } else {
      wl();
    }
  }

  public void output(String tempStr) {
    if (cik(tempStr)) {
      double temp = Double.parseDouble(tempStr);
      tempDetails.add(temp);
    } else {
      System.err.println("Wrong input! Please enter a number");
    }
  }

  public boolean cik(String a) {
    if (a.matches("[0-9.]+")) {
      return true;
    } else {
      return false;
    }
  }

  public void wl() {
    for (double changes : this.tempDetails) {
      System.out.print(changes + " ");
    }
    System.out.println();
  }
}
