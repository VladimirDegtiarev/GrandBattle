package units;

public interface AttackAble {
    void attack(Unit enemy);
    default void escapeBattleField () {
        System.out.println("Юнит сбежал с поля боя");
    }
}
