package com.company;
public class Knight  extends Hero{
    String horseName;

    public Knight(int lvl, int health, int energy, int money, int damage, String horseName) {
        super(lvl, health, energy, money, damage);
        this.horseName = horseName;
    }
    public void horse(){
        setEnergy(getEnergy()+20);
        setDamage(getDamage()+10);
        setHealth(getHealth()+5);
    }
    @Override
    public  String toString(){
        return super.toString()+
                "\n Лошадь: "+horseName;
    }

}
