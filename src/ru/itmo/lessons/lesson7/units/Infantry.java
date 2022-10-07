package ru.itmo.lessons.lesson7.units;

import ru.itmo.lessons.lesson7.base.BattleUnit;

public class Infantry extends BattleUnit { //создали класс пехотинца наследованием от батлюнита

    private int addionalAttack;

    //создается тот обьект конструкт которого вызывается

    public Infantry(int healthScore, int attackScore, int addionalAttack){ //передача параметров 2 из них от ранее созданых
        super(healthScore, attackScore);
        if (addionalAttack < 1){ //проверка доп атаки
            throw new IllegalArgumentException("addionalAttack не мб меньше 1");
        }
        this.addionalAttack = addionalAttack; //если все ок то подтверждаем эту атаку
    }

    public void upAdditionalAttack(){
        addionalAttack += (int) (Math.random() * 3);
    }

    //если класс не является абстрактным то в клаасе должна быть реализация абстрактного метода

    @Override //аннотация, показывает что метод переопределен
    public void attack(BattleUnit enemy){ //методы обьекта те что есть в классе BattleUnit
        System.out.println("Пехотинец аттакует");
        enemy.minusHealth(this.attackScore);
        if (attackScore < 10) {
            this.attackScore *= 2;
            enemy.minusHealth(attackScore);
        }
        if (addionalAttack < 10) {
            this.attackScore = addionalAttack + addionalAttack;
            enemy.minusHealth(attackScore);
        }
        if (!isAlive()){
            enemy.plusHealth(healthScore);
        }
    }
}
