package level1;

import level2.Level2;

public class Level1 {
    public static void identify() {
        System.out.println("I am level1");
        Level2.identify();
    }
}