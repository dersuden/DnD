package org.example.dnd;

public class GreatSword extends WeaponAttack {
    public GreatSword(Rarity rarity) {
        super(rarity);
    }

    public int hit() {
        int baseDamage = 9;
        if (rarity == Rarity.RARE) {
            return baseDamage + 3;
        }
        if (rarity == Rarity.LEGENDARY) {
            return baseDamage + 4;
        }
        return 9;
    }
}
