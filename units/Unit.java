package units;

abstract public class Unit implements RestOfUnits {
    protected String name;
    protected int health;
    protected int speed;

    public Unit () {}

    public Unit (String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    // Добавлены проверки правильности ввода данных в setters

    public void setName(String name) {
        while (true) {
            if (name != null) {
                this.name = name;
                break;
            } else {
                System.out.println("Необходимо задать имя персонажа повторно");
            }
        }
    }

    public void setHealth(int health) {
        while (true) {
            if (health > 0 && health < 100) {
                this.health = health;
                break;
            } else {
                System.out.println("Очки здоровья персонажа должны быть больше 0 и меньше 100");
            }
        }
    }

    public void setSpeed(int speed) {
        while (true) {
           if (speed > 0 && speed< 50 ) {
               this.speed = speed;
               break;
           } else{
               System.out.println("Скорость персонажа должна быть больше 0 и меньше 50");
           }
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    protected boolean isAlive() {
        return health > 0;
    }

    public void run () {
        System.out.println("Юнит перемещается со скоростью " + speed);
    }

    @Override
    public String toString() {
        return name + ", " + "скорость: " + speed + ", здоровье: " + health;
    }
}
