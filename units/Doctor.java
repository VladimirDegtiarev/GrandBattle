package units;

public class Doctor extends BattleUnit {

    public Doctor(String name, int speed, int health, int attackScore) {
        super(name, speed, health, attackScore);
    }

    @Override
    public void attack(Unit friend) {
        System.out.println("Доктор увеличил очки здоровья "+ friend.getName());
        friend.health = friend.health + this.attackScore;
        // Дописана вторая строчка с увеличением очков здоровья friend
        // Доктор увеличивает здоровье на величину своей атаки
    }

    @Override
    public void rest() {
        System.out.println("Доктор успешно отдохнул и увеличил очки своего здоровья на +5");
        this.health = this.health + 5;
        // Дописана реализация метода rest(), уникальная для каждого персонажа
    }

    @Override
    public void run() {
        super.run();
    }
}
