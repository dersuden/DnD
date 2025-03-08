package org.example.dnd;

import lombok.Data;

@Data
public class Hero {
    Enemies enemies;
    String name = "Люцифер";
    int hp = 25;
    int mp = 25;

    public void takeDamage(int damage) {
        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0;
        }
        System.out.println(name + " получил " + damage + " урона");
        System.out.println("оставшееся здоровье: " + this.hp);
        if (this.hp == 0) {
            System.out.println("Гоблин мёртв");
        }
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public void walk(Enemies enemies) {
        System.out.println("Ты устало бредёшь вперёд");
        if (org.example.dnd.D20.rollD20() >= 12) {
            System.out.println("Ты с опаской осматриваешься и понимаешь, что врагов рядом нет");
        } else {
            if (enemies == Enemies.GOBLIN) {
                System.out.println("Ты продвигаешься дальше и видишь...гоблина!");
                Attacking attackingGoblin = new Attacking();
            }
            if (enemies == Enemies.GOBLIN_ON_A_WARG) {
                System.out.println("Ты продвигаешься дальше и видишь...гоблина верхом на варге!");
            }
            if (enemies == Enemies.ORC) {
                System.out.println("Ты продвигаешься дальше и видишь...орка!");
            }
        }
    }
}