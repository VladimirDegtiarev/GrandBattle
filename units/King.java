package units;

public class King extends Unit {

    public King(String name, int speed, int health) {
        super(name, speed);
        this.health = health;
    }

    @Override
    public void rest() {
        System.out.println("Хитрый король успешно отдохнул и увеличил очки своего здоровья на +10");
        this.health = this.health + 10;
        // Дописана реализация метода rest(), уникальная для каждого персонажа
    }

    @Override
    public void run() {
        super.run();
    }
}
