package units;

public interface RestOfUnits {
    void rest ();

    default void escapeBattleField () {
        System.out.println("Юнит сбежал с поля боя");
    }
}
