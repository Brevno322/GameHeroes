package com.company;

public class Equipment {

    public   int priceWeapon;
    public   int plusHealth;
    public   int plusDamage;
    public   String nameShmot;

    public Equipment() {
    }
    public Equipment(int priceWeapon, int plusHealth, int plusDamage, String nameShmot) {
        this.priceWeapon = priceWeapon;
        this.plusHealth = plusHealth;
        this.plusDamage = plusDamage;
        this.nameShmot = nameShmot;


    }

    @Override
    public String toString() {
        return ("Выбирайте снаряжение " +
                "\n " +"Копье судьбы" +" Цена " + 20 + " Здорье + " +10 + " Урон + " + 20+
                "\n" + "Тапор правосудия"+" Цена " + 30 + " Здорье + " +15 + " Урон + " + 25+
                "\n" + "Наказатель3000 "+" Цена " + 40 + " Здорье + " +25 + " Урон + " + 35+
                "\n" + "клинок "+" Цена " + 50 + " Здорье + " +35 + " Урон + " + 45);


    }
}
