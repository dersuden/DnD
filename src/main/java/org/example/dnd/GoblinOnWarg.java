package org.example.dnd;

public class GoblinOnWarg {
    int baseHp = 20;
    int baseDamage = 3;

    public boolean isAlive() {
        return this.baseHp > 0;
    }

    public void takeDamage(int damage) {
        this.baseHp -= damage;
        if (this.baseHp < 0) {
            this.baseHp = 0;
        }
        System.out.println("Гоблин на варге получил " + damage + " урона");
        System.out.println("оставшееся здоровье: " + this.baseHp);
        if (this.baseHp <= 0) {
            System.out.println("Гоблин и варг мертвы");
        }
    }
}