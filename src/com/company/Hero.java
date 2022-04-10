package com.company;

public abstract class Hero {
    private int lvl=1;
    private int health=100;
    private int energy=100;
    private int money=100;
    private int damage=1;



    public Hero() {
    }




    public Hero(int lvl, int health, int energy, int money, int damage) {
        this.lvl = lvl;
        this.health = health;
        this.energy = energy;
        this.money = money;
        this.damage = damage;

    }



    public int getLvl() {

        return lvl;
    }

    public void setLvl(int lvl) {

        this.lvl = lvl;

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    @Override
    public String toString() {
        return ("ваш уровень :" + lvl +
                "\nваше здоровье : " + health +
                "\nваша энергия :" + energy +
                "\nваши гривны : " + money +
                "\nваш урон :" + damage);
    }


}

