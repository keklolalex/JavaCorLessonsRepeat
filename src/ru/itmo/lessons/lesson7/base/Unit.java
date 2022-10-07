package ru.itmo.lessons.lesson7.base;


//нельзя создать экземпляр (обьект) abstract класса //запрещаем создавать new Unit
//может содерждать абстрактные мотоды (методы без реализации)
abstract public class Unit {
    //int healthScore
    //бывает что нет модификатора тогда default или package-private
    //доступ только внутри пакета

    //protected доступ к дочерним классам или внутри пакета// модификатор доступа
    //если два класса находятся внутри пакета
    protected int healthScore;

    //final свойство нельзя изменить, попытка изменения приведет к ошибке
    //если делаем так, то значения final свойство надо присвоить при объялении переменной либо в конструкторе
    //(сеттеры) запрещены
    private final int maxHealthScore;

    public Unit(int healthScore){
        if (healthScore < 1){
            throw new IllegalArgumentException("healthScore - не может быть меньше 1");
        }
        this.healthScore = healthScore; //свойство текущего обьекта равно значению которое передали в конструктор)
        maxHealthScore = healthScore;
    }

    public boolean isAlive(){
        //сокращает true если здоровье больше нуля и false если меньше или равно 0
        //все три варианта рабочие
        //if (healthScore > 0) return true;
        //return false;
        //return healthScore > 0 ? true : false;

        return healthScore > 0;
    }


    public void plusHealth(int healthScore){
        //если юнит жив увеличить здоровье на healthScore
        //но не больше изначального (изначальное значение сохраняйте в дополнительном свойстве maxHealthScore

        if (!isAlive()) return;
        this.healthScore = Math.min(this.healthScore + healthScore, maxHealthScore);

//        if (isAlive()){
//            this.healthScore += healthScore;
        }


    public void minusHealth(int healthScore){
        //если юнит жив уменьшить здоровье на healthScore
        //if (!isAlive()) return;
        //this.healthScore -= healthScore;

        if (isAlive()) this.healthScore -= healthScore;
    }

    public int getHealthScore(){
        return healthScore;
    }


    public void rest(){
        plusHealth(1);
        System.out.println("Unit восстанавливает силы");
    }

}
