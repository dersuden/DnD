package org.example.dnd;

import lombok.Data;

@Data
public abstract class Heal {
    Hero hero;
    private String diceType;

    public Heal(Hero hero,String diceType) {
        this.hero = hero;
        this.diceType = diceType;
    }

    public int rollHeal() {
        return switch (diceType) {
            case "D4" -> D4.rollD4();
            case "D6" -> D6.rollD6();
            case "D8" -> D8.rollD8();
            case "D10" -> D10.rollD10();
            default -> throw new IllegalArgumentException("Неизвестный тип кубика" + diceType);
        };
    }
}
