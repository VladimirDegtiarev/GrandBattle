package units;

public class Warrior extends BattleUnit {

    public Warrior(String name, int speed, int health, int attackScore) {
        super(name, speed, health, attackScore);
    }

    @Override
    public void attack(Unit enemy) {
        enemy.health -= this.attackScore;
        System.out.println("Воин атаковал " + enemy.getName());
    }

    @Override
    public void rest() {
        System.out.println("Воин успешно отдохнул и увеличил очки своего здоровья на +1");
        this.health = this.health + 1;
        // Дописана реализация метода rest(), уникальная для каждого персонажа
    }

    @Override
    public void run() {
        super.run();
    }
}
