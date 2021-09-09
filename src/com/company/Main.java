package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();

        boss.setHealth(10000);
        boss.setDamage(50);
        boss.setDefence("Classic");

        System.out.println("His HP " + boss.getHealth() + " | His DMG " + boss.getDamage() + " | His DEF " + boss.getDefence());


        /*System.out.println("==========================================");
        heroes[0] = new Hero(100, 20);
        System.out.println(heroes[0]); // Возвращает это: com.company.Hero@27d6c5e0*/
    }

    // Задание на сообразительность

    /*// Метод создания героев
    public static Hero[] heroes = new Hero[1];
    public static void createHeroes(int health, int damage, String ability) {
        Hero[] heroes = new Hero[1];

        heroes[0] = new Hero(health, damage, ability);

    }*/

    // сложно
}