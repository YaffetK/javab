package se.yaffet;

import java.util.ArrayList;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }
    public static void main(String[] args) {
       Squirrel squirell = new Squirrel(12, 7, true, 10);
       PineTree pineTree = new PineTree(2, 41);

       System.out.println("Did treee fall ?: " + pineTree.fall("winter", 1.10, 7, true));
       System.out.println("Cones left in nest after eating: " + squirell.eat(7));
       System.out.println("Is squirell still hungry?: " + squirell.getIsHungry());
    }
}
