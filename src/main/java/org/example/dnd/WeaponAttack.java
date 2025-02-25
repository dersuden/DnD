package org.example.dnd;

import lombok.Data;

@Data
public abstract class WeaponAttack {
    private String name;
    private String diceType;

    public WeaponAttack(String name, String diceType) {
        this.name = name;
        this.diceType = diceType;
    }

    public int rollDamage() {
        return switch (diceType) {
            case "D4" -> D4.rollD4();
            case "D6" -> D6.rollD6();
            case "D8" -> D8.rollD8();
            case "D10" -> D10.rollD10();
            case "D20" -> D20.rollD20();
            default -> throw new IllegalArgumentException("Неизвестный тип кубика" + diceType);
        };
    }
}