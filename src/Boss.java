import java.util.Random;

public class Boss {

        private   static  String [] changeBossDefence = { " Physical " , " Magical " , " Kinetic " };

       private static  int bossHealth;
        private   static  int bossAttack;
        private   static  String bossDefenceType =  " " ;

        private   int  getBossHealth () {
            return bossHealth;
        }

        public  void  setBossHealth ( int  bossHealth ) {
            this. bossHealth = bossHealth;
        }

        public  int  getBossAttack () {
            return bossAttack;
        }

        public  void  setBossAttack ( int  bossAttack ) {
            this. bossAttack = bossAttack;
        }

        public  String  getBossDefenceType () {
            return bossDefenceType;
        }

        public  void  setBossDefenceType ( String  bossDefenceType ) {
            this. bossDefenceType = bossDefenceType;
        }
        public  static  void  changeBossDefence () {
            Random r =  new Random ();
            int randomIndex = r . nextInt ( 3 );
            bossDefenceType = changeBossDefence [randomIndex];
        }
}
