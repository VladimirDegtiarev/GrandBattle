package units;

public class Knight extends BattleUnit {

    public Knight(String name, int speed, int health, int attackScore) {
        super(name, speed, health, attackScore);
    }

    @Override
    public void attack(Unit enemy) {
        System.out.println("Рыцарь атаковал " + enemy.getName());
        enemy.health = enemy.health - this.attackScore;
        // Дописана вторая строчка с уменьшением очков здоровья enemy
    }

    @Override
    public void rest() {
        System.out.println("Рыцарь успешно отдохнул и увеличил очки своего здоровья на +2");
        this.health = this.health + 2;
        // Дописана реализация метода rest(), уникальная для каждого персонажа
    }

    @Override
    public void run() {
        super.run();
    }
}
