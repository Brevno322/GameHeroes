package com.company;

public class Weapon {
    int priceWeapon;
    int plusHealth;
    int plusDamage;
    String nameShmot;

    public Weapon() {
    }


    public Weapon(int priceWeapon, int plusHealth, int plusDamage, String nameShmot) {
        this.priceWeapon = priceWeapon;
        this.plusHealth = plusHealth;
        this.plusDamage = plusDamage;
        this.nameShmot = nameShmot;


    }

    @Override
    public String toString() {
        return ("Выбирайте снаряжение " +
                "\n " +"Сапоги рядового" +" Цена " + 10 + " Здорье + " +15 + " Урон + " + 5+
                "\n" + "Броня смелости"+" Цена " + 20 + " Здорье + " +20 + " Урон + " + 25+
                "\n" + "Штаны зимние"+" Цена " + 40 + " Здорье + " +25 + " Урон + " + 30+
                "\n" + "Шлем разбойника "+" Цена " + 50 + " Здорье + " +40 + " Урон + " + 32);


    }

}






