/*
 * Refactored by Hajdara Patrik, 2023-11-16
 * Copyright (c) 2023, Hajdara Patrik
 * File name: App.java
 * Licenc: MIT
 * Az esetlegesen elofordulo hibakert nem all modomban felelosseget vallalni
 */

public class App {

  public static void main(String[] args) throws Exception {
    Temp temperature = new Temp();
    temperature.collectTemperature();
  }
}
