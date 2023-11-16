/*
 * Refactored by Hajdara Patrik, 2023-11-16
 * Copyright (c) 2023, Hajdara Patrik
 * File name: Temp.java
 * Licenc: MIT
 * Az esetlegesen elofordulo hibakert nem all modomban felelosseget vallalni
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Temp {

  ArrayList<Double> temperatureList;

  public Temp() {
    Double[] baseData = { 2.5, 2.8, 1.2, 0.5, -1.1 };
    this.temperatureList = new ArrayList<>(Arrays.asList(baseData));
  }

  public void collectTemperature() {
    String inputData = "";
    while (!inputData.equals("done")) {
      inputData = inputTemp();
      checkEnd(inputData);
    }
  }

  public String inputTemp() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Temperature: ");
    return scan.nextLine();
  }

  public void checkEnd(String tempStr) {
    if (!tempStr.equals("done")) {
      convertAndAdd(tempStr);
    } else {
      writeList();
    }
  }

  public void convertAndAdd(String tempStr) {
    if (checkInput(tempStr)) {
      double temperature = Double.parseDouble(tempStr);
      temperatureList.add(temperature);
    } else {
      System.err.println("Wrong input! Please enter a number");
    }
  }

  public boolean checkInput(String input) {
    if (input.matches("[0-9.]+")) {
      return true;
    } else {
      return false;
    }
  }

  public void writeList() {
    for (double temperature : this.temperatureList) {
      System.out.print(temperature + " ");
    }
    System.out.println();
  }
}
