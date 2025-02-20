package org.example.dnd;

import lombok.Data;

@Data

public abstract class WeaponAttack {
    protected Rarity rarity;

    public WeaponAttack(Rarity rarity) {
        this.rarity = rarity;
    }

    public int hit() {
        int baseDamage = 6;
        if (rarity == Rarity.RARE) {
            return baseDamage + 3;
        }
        if (rarity == Rarity.LEGENDARY) {
            return baseDamage + 4;
        }
        return baseDamage;
    }
}