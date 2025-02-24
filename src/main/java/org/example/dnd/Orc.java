package org.example.dnd;

public class Orc {
    int baseHp = 25;
    int baseDamage = 3;

    public boolean isAlive() {
        return this.baseHp > 0;
    }

    public void takeDamage(int damage) {
        this.baseHp -= damage;
        if (this.baseHp < 0) {
            this.baseHp = 0;
        }
        System.out.println("Орк получил " + damage + " урона");
        System.out.println("оставшееся здоровье: " + this.baseHp);
        if (this.baseHp <= 0) {
            System.out.println("Орк мёртв");
        }
    }
}