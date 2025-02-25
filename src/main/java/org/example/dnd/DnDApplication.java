package org.example.dnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SpringBootApplication
public class DnDApplication {

    public static void main(String[] args) {
        SpringApplication.run(DnDApplication.class, args);
//        Hero hero = new Hero();
//        Goblin goblin = new Goblin();
//        GoblinOnWarg goblinOnWarg = new GoblinOnWarg();
//        Orc orc = new Orc();
//        Battle battleWithGoblin = new Battle(hero, goblin);
//        Battle battleWithGoblinOnWarg = new Battle(hero, goblinOnWarg);
//        Battle battleWithOrc = new Battle(hero, orc);
//        battleWithGoblin.heroAttackGoblin();
//        battleWithGoblinOnWarg.heroAttackGoblinOnWarg();
//        battleWithOrc.heroAttackOrc();
        Map<String, WeaponAttack> weapons = new HashMap<>();
        weapons.put("Кинжалы", new WeaponAttack("Dual daggers", "D4") {
        });
        weapons.put("Лук", new WeaponAttack("Bow", "D6") {
        });
        weapons.put("Топор", new WeaponAttack("Axe", "D8") {
        });
        weapons.put("Двуручный меч", new WeaponAttack("Great sword", "D10") {
        });
        weapons.put("Глефа", new WeaponAttack("Glaive", "D20") {
        });
        Scanner scanner = new Scanner(System.in);
        System.out.println("Доступное оружие: Dual daggers, Bow, Axe, Great sword, Glaive");
        System.out.println("ведите название оружия для атаки: ");
        String weaponChoice = scanner.nextLine();
        if (weapons.containsKey(weaponChoice)) {
            WeaponAttack weaponAttack = weapons.get(weaponChoice);
            int damage = weaponAttack.rollDamage();
            System.out.println("Вы атаковали " + weaponAttack.getName() + " и нанесли " + damage + " урона"); {
            }
        } else {
            System.out.println("Оружие не найдено");
        }
    }
}