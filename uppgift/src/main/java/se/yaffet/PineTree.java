package se.yaffet;

import java.util.ArrayList;

public class PineTree {
    private int numbOfCones;
    private boolean water;
    private boolean sunlight;
    private int age;
    private ArrayList<Squirrel> squirellList = new ArrayList<Squirrel>();
    private Owl owl;

    public PineTree(int numbOfCones, int age) {
        this.numbOfCones = numbOfCones;
        this.age = age;
    }

    public boolean fall(String season, double windSpeedKmH, int sunLightHoursADday, boolean accident) {
          if (season.equals("winter") || season.equals("fall")) {
              if (windSpeedKmH > 1.2 && sunLightHoursADday < 8 && this.age > 40) {
                  didFall();
                  return true;
              }
          }
          if (accident) {
              didFall();
              return true;
          }

          return false;
    }

    
    private void didFall() {
        numbOfCones = 0;
        squirellList.clear();
      }
}
