package com.company;

public class Main {

    public static void main(String[] args) {
        Boss {

            public  static  String [] changeBossDefence = { " Physical " , " Magical " , " Kinetic " };

            public  static  int bossHealth;
            public  static  int bossAttack;
            public  static  String bossDefenceType =  " " ;

            public  int  getBossHealth () {
                вернуть bossHealth;
            }

            public  void  setBossHealth ( int  bossHealth ) {
                это . bossHealth = bossHealth;
            }

            public  int  getBossAttack () {
                вернуть bossAttack;
            }

            public  void  setBossAttack ( int  bossAttack ) {
                это . bossAttack = bossAttack;
            }

            public  String  getBossDefenceType () {
                return bossDefenceType;
            }

            public  void  setBossDefenceType ( String  bossDefenceType ) {
                это . bossDefenceType = bossDefenceType;
            }
            public  static  void  changeBossDefence () {
                Случайный г =  новый  Случайный ();
                int randomIndex = r . nextInt ( 3 );
                bossDefenceType = changeBossDefence [randomIndex];
            }
    }
}
