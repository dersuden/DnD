package org.example.dnd;

public class Goblin {
    int baseHp = 10;
    int baseDamage = D4.rollD4();

    public boolean isAlive() {
        return this.baseHp > 0;
    }

    public void takeDamage(int damage) {
        this.baseHp -= damage;
        if (this.baseHp < 0) {
            this.baseHp = 0;
        }
        System.out.println("Гоблин получил " + damage + " урона");
        System.out.println("оставшееся здоровье: " + this.baseHp);
        if (this.baseHp <= 0) {
            System.out.println("Гоблин мёртв");
        }
    }
}