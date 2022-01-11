package com.company;

public class Weapon {


    private String weapon;
    private int damage;

    public Weapon(){}

    public Weapon(String weapon, int damage) {

        this.weapon = weapon;
        this.damage = damage;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
