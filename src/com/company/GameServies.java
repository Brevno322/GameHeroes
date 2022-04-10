package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class GameServies {
    public static SecureRandom random = new SecureRandom();
    Hero hero = null;
    //    одежда
    Weapon shmot = new Weapon();
    Weapon boots = new Weapon(10, 15, 5, "Сапоги рядового");
    Weapon armor = new Weapon(20, 20, 25, "Броня смелости");
    Weapon trousers = new Weapon(40, 25, 30, "Штаны зимние");
    Weapon helmet = new Weapon(50, 40, 32, "Шлем разбойника");
    //    оружие
    Equipment spear = new Equipment(20, 10, 20, "Копье судьбы");
    Equipment axe = new Equipment(30, 15, 25, "Тапор правосудия");
    Equipment nakazatel = new Equipment(40, 25, 35, "Наказатель3000 ");
    Equipment blade = new Equipment(50, 35, 45, "клинок " + " Цена ");
    Equipment orudie = new Equipment();

    Monster battle = new Monster();
    Scanner consol = new Scanner(System.in);
    public void igra() {
        System.out.println("Добро пожаловать в игру ");
        System.out.println("Выбор героя");


        System.out.println("1 - Рыцарь----есть лошадь и она добавляе: +25 к энергии, +10 к силе, +5 к НР" +
                "\n2 - Маг----есть чары и они добавляют: +10 к энергии, +5 к силе, +15 к НР");
        

        int wiborIgroka = consol.nextInt();

        if (wiborIgroka == 1) {
            System.out.println("Вы выбрали Рыцаря");
            hero = new Knight(1, 100, 100, 100, 10, "конь");
            Knight knight = (Knight) hero;
            knight.horse();


        } else {
            System.out.println("Вы выбрали Мага");
            hero = new Mag(1, 100, 100, 100, 10, "пасивка");
            Mag mag = (Mag) hero;
            mag.pasivka1();
        }
        while (hero.getEnergy() > 0) {
            System.out.println(hero);


            System.out.println("Чем хотите заняться ? " +
                    "\n 1 - подраться с монстрами (-10 energy)" +
                    "\n 2 - прикупить снаряжение (-5 energy)" +
                    "\n 3 - прикупить оружие (-5 energy)" +
                    "\n 4 - испытать удачу в казино (-15 energy)");
            int vibor = consol.nextInt();

            switch (vibor) {

                case 1:
                    System.out.println(battle);
                    hero.setEnergy(hero.getEnergy() - 10);
                    int viborbossa = consol.nextInt();
                    switch (viborbossa) {
                        case 1:
                            Monster easyMonsters = new Monster();
                            if (hero.getDamage() > easyMonsters.getEasyForceMonster()) {
                                hero.setHealth(((Hero) hero).getHealth() - easyMonsters.getEasyForceMonster());
                                hero.setMoney(((Hero) hero).getMoney() + easyMonsters.getEasyForceMonster());
                                System.out.println("вы победили ваша награда" + easyMonsters.getEasyForceMonster());

                            } else {
                                System.out.println("вы проиграли ");
                            }
                            break;
                        case 2:
                            Monster midlMonsters = new Monster();
                            if (hero.getDamage() > midlMonsters.getMidlForceMonster()) {
                                hero.setHealth(((Hero) hero).getHealth() - midlMonsters.getMidlForceMonster());
                                hero.setMoney(((Hero) hero).getMoney() + midlMonsters.getEasyForceMonster());
                                System.out.println("вы победили ваша награда" + midlMonsters.getMidlForceMonster());

                            } else {
                                System.out.println("вы проиграли ");
                            }
                            break;
                        case 3:
                            Monster strongMonsters = new Monster();
                            if (hero.getDamage() > strongMonsters.getMidlForceMonster()) {
                                hero.setHealth(((Hero) hero).getHealth() - strongMonsters.getMidlForceMonster());
                                hero.setMoney(((Hero) hero).getMoney() + strongMonsters.getEasyForceMonster());
                                System.out.println("вы победили ваша награда" + strongMonsters.getMidlForceMonster());

                            } else {
                                System.out.println("вы проиграли ");
                            }
                        case 4:
                            Monster bosslMonsters = new Monster();
                            if (hero.getDamage() > bosslMonsters.getMidlForceMonster()) {
                                hero.setHealth(((Hero) hero).getHealth() - bosslMonsters.getMidlForceMonster());
                                hero.setMoney(((Hero) hero).getMoney() + bosslMonsters.getEasyForceMonster());
                                System.out.println("вы победили ваша награда" + bosslMonsters.getMidlForceMonster());

                            } else {
                                System.out.println("вы проиграли ");
                            }

                    }
                    break;

                case 2:
                    System.out.println(shmot);
                    hero.setEnergy(((Hero) hero).getEnergy() - 10);
                    int viborshmot = consol.nextInt();
                    switch (viborshmot) {
                        case 1:
                            if (hero.getMoney() > boots.priceWeapon) {
                                hero.setDamage(((Hero) hero).getDamage() + boots.plusDamage);
                                hero.setMoney(((Hero) hero).getMoney() - boots.priceWeapon);
                                hero.setHealth(((Hero) hero).getHealth() + boots.plusHealth);
                                hero.setLvl(((Hero) hero).getLvl() + 1);
                            } else {
                                System.out.println("У вас нет денег");
                                hero.setEnergy(((Hero) hero).getEnergy() + 5);
                            }
                            break;
                        case 2:
                            if (hero.getMoney() > armor.priceWeapon) {
                                hero.setDamage(((Hero) hero).getDamage() + armor.plusDamage);
                                hero.setMoney(((Hero) hero).getMoney() - armor.priceWeapon);
                                hero.setHealth(hero.getHealth() + armor.plusHealth);
                                hero.setLvl(((Hero) hero).getLvl() + 1);
                            } else {
                                System.out.println("У вас нет денег");
                                hero.setEnergy(((Hero) hero).getEnergy() + 5);
                            }
                            break;
                        case 3:
                            if (hero.getMoney() > trousers.priceWeapon) {
                                hero.setMoney(((Hero) hero).getMoney() - trousers.priceWeapon);
                                hero.setHealth(((Hero) hero).getHealth() + trousers.plusHealth);
                                hero.setDamage(((Hero) hero).getDamage() + armor.plusDamage);
                                hero.setLvl(((Hero) hero).getLvl() + 1);
                            } else {
                                System.out.println("У вас нет денег");
                                hero.setEnergy(((Hero) hero).getEnergy() + 5);
                            }
                        case 4:
                            if (hero.getMoney() > helmet.priceWeapon) {
                                hero.setMoney(hero.getMoney() - helmet.priceWeapon);
                                hero.setDamage(((Hero) hero).getDamage() + helmet.plusDamage);
                                hero.setHealth(((Hero) hero).getHealth() + helmet.plusHealth);
                                hero.setLvl(((Hero) hero).getLvl() + 1);
                            } else {
                                System.out.println("У вас нет денег");
                                hero.setEnergy(((Hero) hero).getEnergy() + 5);
                            }


                    }
                case 3:
                    System.out.println(orudie);

                    hero.setEnergy(((Hero) hero).getEnergy() - 5);
                    int vibororudie = consol.nextInt();
                    switch (vibororudie) {
                        case 1:
                            if (hero.getMoney() > spear.priceWeapon) {
                                hero.setMoney(((Hero) hero).getMoney() - spear.priceWeapon);
                                hero.setDamage(((Hero) hero).getDamage() + spear.plusDamage);
                                hero.setHealth(((Hero) hero).getHealth() + spear.plusHealth);
                                hero.setLvl(((Hero) hero).getLvl() + 1);
                            } else {
                                System.out.println("У вас нет денег");
                                hero.setEnergy(((Hero) hero).getEnergy() + 5);
                            }
                            break;
                        case 2:
                            if (hero.getMoney() > axe.priceWeapon) {
                                hero.setMoney(((Hero) hero).getMoney() - axe.priceWeapon);
                                hero.setDamage(((Hero) hero).getDamage() + axe.plusDamage);
                                hero.setHealth(hero.getHealth() + axe.plusHealth);
                                hero.setLvl(((Hero) hero).getLvl() + 1);
                            } else {
                                System.out.println("У вас нет денег");
                                hero.setEnergy(((Hero) hero).getEnergy() + 5);
                            }
                            break;
                        case 3:
                            if (hero.getMoney() > nakazatel.priceWeapon) {
                                hero.setMoney(((Hero) hero).getMoney() - nakazatel.priceWeapon);
                                hero.setDamage(((Hero) hero).getDamage() + nakazatel.plusDamage);
                                hero.setHealth(hero.getHealth() + nakazatel.plusHealth);
                                hero.setLvl(((Hero) hero).getLvl() + 1);
                            } else {
                                System.out.println("У вас нет денег");
                                hero.setEnergy(((Hero) hero).getEnergy() + 5);
                            }
                            break;
                        case 4:
                            if (hero.getMoney() > blade.priceWeapon) {
                                hero.setMoney(hero.getMoney() - blade.priceWeapon);
                                hero.setDamage(hero.getDamage() + blade.plusDamage);
                                hero.setHealth(hero.getHealth() + blade.plusHealth);
                                hero.setLvl(((Hero) hero).getLvl() + 1);
                            } else {
                                System.out.println("У вас нет денег");
                                hero.setEnergy(((Hero) hero).getEnergy() + 5);
                            }

                    }
                    break;

                case 4:


                    System.out.println("добро пожаловать в игру 21" +
                            "\nправила просты , вы должны набрать цифру 21");
                    hero.setEnergy(((Hero) hero).getEnergy() - 15);
                    while (hero.getMoney() > 0) {

                        System.out.println("1-еще" +
                                "\n2- хватит" +
                                "\n3-покунуть игру");

                        int casinoconsol = consol.nextInt();

                        int udacha = random.nextInt(10);
                        int chect = 0;
                        chect = chect + udacha;
                        System.out.println(chect + "продолжаем?");
                        switch (casinoconsol) {
                            case 1:
                                System.out.println("хватит");
                                if (chect == 21) {
                                    hero.setMoney(hero.getMoney() + 100);
                                    hero.setEnergy(hero.getEnergy() + 20);
                                    hero.setLvl(hero.getLvl() + 1);
                                    System.out.println("у вас здорово получается ");
                                }
                                break;


                            case 2:

                                if (chect > 21) {
                                    hero.setMoney(hero.getMoney() - 10);
                                    System.out.println("увы ,вам не повезло");

                                }
                                break;
                            case 3:
                                System.out.println(hero);


                        }


                    }
                    break;

            }
        }
    }
}

