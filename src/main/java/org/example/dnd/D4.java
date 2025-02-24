package org.example.dnd;

import java.util.Random;

public class D4 {
    public static int rollD4() {
        Random random = new Random();
        return random.nextInt(4) + 1;
    }
}