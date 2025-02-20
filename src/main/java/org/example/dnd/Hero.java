package org.example.dnd;

import lombok.Data;

@Data
public class Hero {
    int hp = 25;
    int mp = 25;

    public void hero() {
        String hpInfo = "Hero hp: " + hp;
        String mpInfo = "Hero mp: " + mp;
        int smallPotionHP = hp + 5;
        int bigPotionHP = hp + 10;
        int greatPotionHP = hp + 15;
        int smallPotionMP = mp + 5;
        int bigPotionMP = mp + 10;
        int greatPotionMP = mp + 15;
    }

    public void walk() {
        String walk = "Ты продвигаешься дальше...";
    }
}