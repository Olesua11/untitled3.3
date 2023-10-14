package org.example;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(900);
        boss.setDamage(90);
        boss.setDefenseType("Armor");

        System.out.println("Boss Information:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Type of protection: " + boss.getDefenseType());

        Hero[] heroes = createHeroes();

        System.out.println("Hero information");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Superpower: " + hero.getSuperpower());
            System.out.println();
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(170, 15, "Flight");
        Hero hero2 = new Hero(140, 75);
        Hero hero3 = new Hero(240, 17, "Invisibility");

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}
