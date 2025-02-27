package org.example.dnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DnDApplication {

    public static void main(String[] args) {
        SpringApplication.run(DnDApplication.class, args);
        Scanner scanner = new Scanner(System.in);
        Hero hero = new Hero();
        System.out.println("Вы идёте по лесу и натыкаетесь на гоблина.\nДоступные действия: Пополнить здоровье / Атаковать");
        String choice =  scanner.nextLine();
        if (choice.equals("Пополнить здоровье")) {
            Potions potions = new Potions();
        }
        if (choice.equals("Атаковать")) {
            Attacking attacking = new Attacking();
        }
    }
}