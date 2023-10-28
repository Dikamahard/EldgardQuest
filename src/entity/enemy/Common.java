package entity.enemy;
import feature.Dice;

public class Common extends Enemy{
    public Common(String name){
        super(name);
        this.totalHp = this.baseHp * 2;
        this.currentHp = this.totalHp;
        this.dice = new Dice(10);
    }

    @Override
    public double getAtkDamage(double enemyPDef, double enemyMDef, int diceRolled) {
        return calculateDamage(diceRolled * baseAtk, mAtk, pAtk, enemyPDef, enemyMDef);
    }
}
