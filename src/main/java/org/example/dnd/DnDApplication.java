package org.example.dnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DnDApplication {

    public static void main(String[] args) {
        SpringApplication.run(DnDApplication.class, args);
        Hero hero = new Hero();
        Goblin goblin = new Goblin();
        GoblinOnWarg goblinOnWarg = new GoblinOnWarg();
        Orc orc = new Orc();
//        Glaive glaive = new Glaive(Rarity.RARE);
//        DualDaggers dualDaggers = new DualDaggers(Rarity.RARE);
//        GreatSword greatSword = new GreatSword(Rarity.RARE);
//        System.out.println("Уровень здоровья гоблина: " + goblin.getBaseHp());
//        System.out.println("Вы наносите удар");
//        System.out.println("Вы нанесли глефой: " + glaive.hit() + " урона");
//        System.out.println("Вы нанесли парными клинками: " + dualDaggers.hit() + " урона");
//        System.out.println("Вы нанесли огромным мечом: " + greatSword.hit() + " урона");
//        hero.walk(Enemies.GOBLIN);
        Battle battleWithGoblin = new Battle(hero, goblin);
        Battle battleWithGoblinOnWarg = new Battle(hero, goblinOnWarg);
        Battle battleWithOrc = new Battle(hero, orc);
        battleWithGoblin.heroAttackGoblin();
        battleWithGoblinOnWarg.heroAttackGoblinOnWarg();
        battleWithOrc.heroAttackOrc();

    }
}