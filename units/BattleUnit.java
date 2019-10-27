package units;

abstract public class BattleUnit extends Unit implements AttackAble {

    protected int attackScore;

    public BattleUnit(String name, int speed, int health, int attackScore) {
        super(name, speed);
        this.health = health;
        this.attackScore = attackScore;
    }

    public void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }

    public int getAttackScore() {
        return attackScore;
    }

    @Override
    public void escapeBattleField() {
        System.out.println("Юнит " + this.name + " сбежал с поля боя");
    }

    @Override
    public String toString() {
        return this.name + ", " + "скорость: " + this.speed + ", здоровье: " + this.health + ", сила атаки: " + this.attackScore;
    }
}
