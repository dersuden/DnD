package org.example.dnd;

import lombok.Data;

@Data
public class Hero {
    Enemies enemies;
    String name = "Люцифер";
    int hp = 25;
    int mp = 25;

    public void hero() {
        Enemy goblin = new Enemy(Enemies.GOBLIN) {
        };
        Enemy goblinOnaWarg = new Enemy(Enemies.GOBLIN_ON_A_WARG) {
        };
        Enemy orc = new Enemy(Enemies.ORC) {
        };
    }

    public void takeDamage(int damage) {
        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0;
            System.out.println(name + " получил " + damage + " урона");
            System.out.println("оставшееся здоровье: " + this.hp);
        }
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    @Override
    public String toString() {
        return name + " Здоровье: " + hp;
    }

    public void walk(Enemies enemies) {
        System.out.println("Ты устало бредёшь вперёд");
        if (org.example.dnd.D20.rollD20() >= 12) {
            System.out.println("Ты с опаской осматриваешься и понимаешь, что врагов рядом нет");
        } else {
            if (enemies == Enemies.GOBLIN) {
                System.out.println("Ты продвигаешься дальше и видишь...гоблина!");
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