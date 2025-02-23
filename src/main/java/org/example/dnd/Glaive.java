package org.example.dnd;

public class Glaive extends WeaponAttack {
    public Glaive(Rarity rarity) {
        super(rarity);
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