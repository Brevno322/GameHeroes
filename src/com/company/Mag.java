package com.company;
public class Mag extends Hero{
    String pasivka;

    public Mag(int lvl, int health, int energy, int money, int damage, String pasivka) {
        super(lvl, health, energy, money, damage);
        this.pasivka = pasivka;
    }

    public void pasivka1(){
        setEnergy(getEnergy()+5);
        setDamage(getDamage()+50);
        setHealth(getHealth()+5);
    }
    @Override
    public  String toString(){
        return super.toString()+
                "\n Пасивка "+pasivka;
    }
}
