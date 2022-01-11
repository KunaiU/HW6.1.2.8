package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss("Boss" , 666, 66);

        System.out.println("Boss's health: " + boss.getHealth() + ", Boss's damage: " + boss.getDamage());
        System.out.println("Boss's weapon type: [" + WeaponTypeEnum.FIREARMS + "] Boss's weapon: "+ WeaponEnum.RIFFLE);

        boss.setBossWeapon(WeaponEnum.RIFFLE); //вот так
        System.out.println(boss.getBossWeapon());
    }
}
