import java.lang.Math;
public class battleSystem {
    public int dmgDealtToHero(int enemyAtk, int heroDef){
        heroStats heroBlockChance = new heroStats();
        int rngBlockChance = 0;
        int isHeroBlocked = 0;
        if(heroBlockChance.blockChance() <= 0){
            return heroBlockChance.blockChance();
        }
        else {
            int max = 100;
            int min = 1;
            int range = max - min + 1;
            rngBlockChance = (int)(Math.random() * range) + min;
            return rngBlockChance;
        }
        /**if (heroBlockChance.blockChance() >= rngBlockChance){
            isHeroBlocked = 1;
            return isHeroBlocked;
        }
        else{
            isHeroBlocked = 0;
            return isHeroBlocked;
        }*/
    }
}
