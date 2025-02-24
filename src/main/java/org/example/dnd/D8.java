package org.example.dnd;

import java.util.Random;

public class D8 {
    public static int rollD8() {
        Random random = new Random();
        return random.nextInt(8) + 1;
    }
}