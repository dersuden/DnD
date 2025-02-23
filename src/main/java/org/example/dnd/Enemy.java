package org.example.dnd;

import lombok.Data;
import lombok.Getter;

@Data
public class Enemy {
    Hero hero = new Hero();
    protected Enemies enemyType;
    int baseHp = 10;
    int baseDamage = 3;

    public Enemy(Enemies enemies) {
        this.enemyType = enemies;
    }

//    public boolean isAlive() {
//        return this.baseHp > 0;
//    }
//
//    public void takeDamage(int damage) {
//        this.baseHp -= damage;
//        if (this.baseHp < 0) {
//            this.baseHp = 0;
//            System.out.println(enemyType + " получил " + damage + " урона");
//            System.out.println("оставшееся здоровье: " + this.baseHp);
//        }
//    }
}