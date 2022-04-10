package com.company;
import static com.company.GameServies.random;


public class Monster {
    private int easyForceMonster=random.nextInt(11);
    private int midlForceMonster= random.nextInt(21);
    private int strongForceMonster= random.nextInt(41);
    private int bossForceMonster= random.nextInt(71);



    public Monster(){}
        public int getEasyForceMonster() {
            return easyForceMonster;
        }

        public int getMidlForceMonster() {
            return midlForceMonster;
        }

        public int getStrongForceMonster() {
            return strongForceMonster;
        }
        public int getBossForceMonster(){
        return bossForceMonster;
        }





        @Override
        public String toString() {
            return ("Выбирите противника" +
                    "\n"+"легкий монст"+"урон-"+  getEasyForceMonster() + " награда :" +getEasyForceMonster()+
                    "\n"+"средний монстр"+"урон-"+  getMidlForceMonster() + " награда :" +getMidlForceMonster()+
                    "\n"+"тяжелый монстр"+"урон-"+  getStrongForceMonster() + " награда :" +getStrongForceMonster()+
                    "\n"+"босс"+"урон-"+  getBossForceMonster() + " награда :"+getBossForceMonster());
        }

    }

