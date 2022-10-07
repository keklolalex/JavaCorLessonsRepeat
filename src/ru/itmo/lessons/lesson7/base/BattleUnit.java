package ru.itmo.lessons.lesson7.base;

import ru.itmo.lessons.lesson7.base.Unit;

abstract public class BattleUnit extends Unit{

    protected int attackScore;

    //cвойства, конструкторы, геттеры и сеттеры,
    //собственные методы, переопределенные методы

    public BattleUnit(int healthScore, int attackScore){
        super(healthScore); //всегда первой строчкой т.к. наследование
        if (attackScore < 1){
            throw new IllegalArgumentException("attackScore дб больше");
        }
        this.attackScore = attackScore;
    }

    public int getAttackScore(){
        return attackScore;
    }
    //абстрактный метод - метод без реализации {} без тела метода
    abstract public void attack (BattleUnit enemy);
    //у всех классов которые наследуются от BattleUnit
    //должен быть реализован метод
    //метод переопределн потому что от родителя
}
