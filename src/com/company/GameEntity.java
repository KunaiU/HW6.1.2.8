package com.company;

public class GameEntity {
    private int health;
    private int damage;

    public GameEntity (String who, int health, int damage){

        this.health = health;
        this.damage = damage;

    }


    public String info (){
        return "Damage: " + getDamage() + " Health: " + getHealth();
    }


    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }


}
