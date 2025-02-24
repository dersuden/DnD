package org.example.dnd;

import java.util.Random;

public class D6 {
    public static int rollD6() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}