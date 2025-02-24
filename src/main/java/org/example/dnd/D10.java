package org.example.dnd;

import java.util.Random;

public class D10 {
    public static int rollD10() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
}