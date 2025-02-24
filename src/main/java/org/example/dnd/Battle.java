package org.example.dnd;

public class Battle {
    private Hero hero;
    private Goblin goblin;
    private GoblinOnWarg goblinOnWarg;
    private Orc orc;

    public Battle(Hero hero, GoblinOnWarg goblinOnWarg) {
        this.hero = hero;
        this.goblinOnWarg = goblinOnWarg;
    }

    public Battle(Hero hero, Orc orc) {
        this.hero = hero;
        this.orc = orc;
    }

    public Battle(Hero hero, Goblin goblin) {
        this.hero = hero;
        this.goblin = goblin;
    }

    public void heroAttackGoblin() {
        if (hero.isAlive() && (goblin.isAlive())) {
            System.out.println("Вы атакуете гоблина!");
            goblin.takeDamage(D10.rollD10());
        }
    }

    public void heroAttackGoblinOnWarg() {
        if (hero.isAlive() && (goblinOnWarg.isAlive())) {
            System.out.println("Вы атакуете гоблина на варге!");
            goblinOnWarg.takeDamage(D10.rollD10());
        }
    }

    public void heroAttackOrc() {
        if (hero.isAlive() && (orc.isAlive())) {
            System.out.println("Вы атакуете орка!");
            orc.takeDamage(D10.rollD10());
        }
    }
}