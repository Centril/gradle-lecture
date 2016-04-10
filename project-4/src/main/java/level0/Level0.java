package level0;

import level1.Level1;

public class Level0 {
    public static void main( String... args ) {
        Level0.identify();
    }

    public static void identify() {
        System.out.println("I am level0");
        Level1.identify();
    }
}