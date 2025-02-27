package org.example.dnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Potions {
    Scanner scanner = new Scanner(System.in);
    Hero hero = new Hero();

    public Potions() {
        Map<String, Heal> potions = new HashMap<>();
        potions.put("Малое", new Heal(hero, "D4") {
        });
        potions.put("Среднее", new Heal(hero, "D6") {
        });
        potions.put("Большое", new Heal(hero, "D8") {
        });
        potions.put("Легендарное", new Heal(hero, "D10") {
        });
        System.out.println("Доступные зелья лечения: Малое, Среднее, Большое, Легендарное");

        String healChoice = scanner.nextLine();
        if (potions.containsKey(healChoice)) {
            Heal heal = potions.get(healChoice);
            int rollHeal = heal.rollHeal();
            System.out.println("Вы открываете баночку с зельем лечения и восстанавливаете " + rollHeal + " очков здоровья");
            hero.hp += rollHeal;
            System.out.println("Нынешнее количество очков здоровья героя: " + hero.hp);
        }
    }
}
