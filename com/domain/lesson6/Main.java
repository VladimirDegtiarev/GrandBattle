package com.domain.lesson6;

import units.*;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        // возможность выбора героя: warrior, knight, doctor
        // добавлена проверка правильности ввода типа персонажа

        System.out.println("Укажите тип вашего персонажа:");
        String userChoice;
        while (true) {
            userChoice = in.nextLine();
            if ("warrior".equals(userChoice) || "knight".equals(userChoice) || "doctor".equals(userChoice)) {
                break;
            } else {
                System.out.println("Вы можете выбрать этих персонажей: warrior, knight, doctor");
            }
        }

        // добавлена возможность пользовательского ввода имени, скорости и здоровья, в то время как сила атаки
        // определяется случайным образом

        System.out.println("Укажите имя вашего персонажа:");
        String userName = in.nextLine();

        System.out.println("Укажите скорость своего персонажа:");
        int userSpeed = in.nextInt();

        System.out.println("Укажите количество очков здоровья своего персонажа:");
        int userHealth = in.nextInt();

        int userAttack = (int) (Math.random() * ((5 - 1) + 1)) + 1;
        System.out.println("Cила атаки вашего персонажа равна: " + userAttack + " (генерируется автоматически)");

        BattleUnit battleUnit = null;

        // Внесены некоторые изменения в процесс формирования нового персонажа
        if ("warrior".equals(userChoice)) {
            userName = "Воин " + userName;
            battleUnit = new Warrior(userName, userSpeed, userHealth, userAttack);
        } else if ("knight".equals(userChoice)) {
            userName = "Рыцарь  " + userName;
            battleUnit = new Knight (userName, userSpeed, userHealth, userAttack);
        } else if ("doctor".equals(userChoice)) {
            userName = "Доктор " + userName;
            battleUnit = new Doctor(userName, userSpeed, userHealth, userAttack);
        }

        // создан Король :-)
        Unit king = new King( "Король Ральф", 12, 14);

        BattleUnit enemyChoice = new Knight("Рыцарь противника", 4, 23, 8);
        // battleUnit.attack(enemyChoice);

        System.out.println("\nСейчас на поле битвы:");
        System.out.println(battleUnit.toString());
        System.out.println(enemyChoice.toString());
        System.out.println(king.toString());

    }
}
