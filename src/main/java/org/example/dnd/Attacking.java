package org.example.dnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Attacking {
    Scanner scanner = new Scanner(System.in);
    Goblin goblin = new Goblin();
    Hero hero = new Hero();

    public Attacking() {
        Map<String, WeaponAttack> weapons = new HashMap<>();
        weapons.put("Ножи", new WeaponAttack("двойными кинжалами", "D4") {
        });
        weapons.put("Лук", new WeaponAttack("луком", "D6") {
        });
        weapons.put("Топор", new WeaponAttack("топором", "D8") {
        });
        weapons.put("Меч", new WeaponAttack("огромным мечом", "D10") {
        });
        weapons.put("Глефа", new WeaponAttack("глефой", "D20") {
        });
        System.out.println("Доступное оружие: Ножи, Лук, Топор, Меч, Глефа");
        System.out.println("ведите название оружия для атаки: ");
        String weaponChoice = scanner.nextLine();

        if (weapons.containsKey(weaponChoice)) {
            WeaponAttack weaponAttack = weapons.get(weaponChoice);
            if (goblin.isAlive()) {
                goblin.takeDamage(weaponAttack.rollDamage());
                hero.takeDamage(goblin.baseDamage);
                if (goblin.isAlive()) {
                    goblin.takeDamage(weaponAttack.rollDamage());
                    hero.takeDamage(goblin.baseDamage);
                }
            }
        } else {
            System.out.println("Оружие не найдено");
        }
    }
}