package com.company;

public class Boss extends GameEntity{
    public WeaponEnum bossWeapon;
    public Boss(String who, int health, int damage) {
        super(who, health, damage);

    }
    public WeaponEnum getBossWeapon(){ return bossWeapon;}

    public void setBossWeapon(WeaponEnum bossWeapon) {
        this.bossWeapon = bossWeapon;
    }


}
