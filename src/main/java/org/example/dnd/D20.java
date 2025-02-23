package org.example.dnd;

import java.util.Random;

public class D20 {
    public static int rollD20() {
        Random random = new Random();
        return random.nextInt(20) + 1;
    }
}