package org.example.dnd;

import lombok.Data;

@Data
public abstract class Enemy {
    protected Enemies enemyType;
    int baseHp = 10;
    int baseDamage = 3;

    public Enemy(Enemies enemies) {
        this.enemyType = enemies;
    }

    public int getDamage() {
        int damage = this.baseDamage;
        int hp = this.baseHp;
        if (enemyType.equals(Enemies.GOBLIN_ON_A_WARG)) {
            hp += 10;
            damage += 3;
        }
        if (enemyType.equals(Enemies.ORC)) {
            hp += 15;
            damage += 6;
        }
        return damage;
    }
}