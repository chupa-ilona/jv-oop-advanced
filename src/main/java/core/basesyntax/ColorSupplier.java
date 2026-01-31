package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private static final String[] COLORS =
            {"red", "blue", "green", "yellow", "black", "white"};

    public String getRandomColor(){
        return COLORS[random.nextInt(COLORS.length)];
    }

}
