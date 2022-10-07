package ru.itmo.lessons.lesson7.units;

import ru.itmo.lessons.lesson7.base.BattleUnit;

//final - если пишем значит наследование запрещено
public final class Knight extends BattleUnit {

    private int additionalHealth;

    public Knight(int healthScore, int attackScore, int additionalHealth) {
        super(healthScore, attackScore);
        if (additionalHealth < 1) {
            throw new IllegalArgumentException("addionalAttack не мб меньше 1");
        }
        this.additionalHealth = additionalHealth;
    }

    @Override //аннотация, показывает что метод переопределен
    public void attack(BattleUnit enemy) { //методы обьекта те что есть в классе BattleUnit
        System.out.println("Рыцарь аттакует");
        enemy.minusHealth(this.attackScore);
        if (attackScore > 10 && !enemy.isAlive()){
            this.plusHealth(this.additionalHealth);
        }



    }
}
