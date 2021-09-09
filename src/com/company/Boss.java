package com.company;

public class Boss {
    private int health;
    private int damage;
    private String defence;

    // Health
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health <= 0) {
            System.out.println("Hmm... Can Boss fight if he dead? Please, set correct value.");
        }
        this.health = health;
    }

    // Damage
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (damage <= 0) {
            System.out.println("Don't make him weak. Please, set correct value.");
        }
        this.damage = damage;
    }

    // Defence
    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }
}
