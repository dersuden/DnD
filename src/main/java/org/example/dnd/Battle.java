package org.example.dnd;

public class Battle {
    private Hero hero;
    private Goblin goblin;
    Glaive glaive = new Glaive(Rarity.RARE);

    public Battle(Hero hero, Goblin goblin) {
        this.hero = hero;
        this.goblin = goblin;
    }

    public void heroAttack(int damage) {
        if (hero.isAlive() && (goblin.isAlive())) {
            System.out.println("Вы атакуете гоблина!");
                goblin.takeDamage(2);
        }
    }
}
