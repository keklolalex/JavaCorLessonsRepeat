package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.BattleUnit;
import ru.itmo.lessons.lesson7.units.Infantry;
import ru.itmo.lessons.lesson7.units.King;
import ru.itmo.lessons.lesson7.units.Knight;

public class Application {

    public void finalArg (final int a, final Infantry infantry){
        System.out.println(a);
        int b = a * a;
        // a = 90 ошибка т.к. аргумент final

        System.out.println(infantry);
        System.out.println(infantry.getHealthScore());
        //infantry  = new Infantry (12, 22, 1); ошибка  тк агрумент final
        //НО можно изменять значение свойств обьекта
        infantry.plusHealth(100);
    }


    public static void main(String[] args) {

        //final - если пишем значит наследование запрещено
        //final свойство нельзя изменить, попытка изменения приведет к ошибке
        //final метод нельзя переопределить в дочернем классе
        //final аргумент метода - то он доступен только для чтения
            //но можно изменять значение свойств
            //относиться только к сылке обьекта,






        King king01 = new King(2000);
        king01.rest();

        King king02 = new King(2000);
        king02.rest(king01);

        System.out.println(king01.getHealthScore());

        Infantry infantry1 = new Infantry(30, 10, 5);
        infantry1.upAdditionalAttack();
        infantry1.rest();
        System.out.println(infantry1.getHealthScore());
        System.out.println(infantry1.getAttackScore());

        Knight knight1 = new Knight(30, 10, 5);

        //создание через общий тип данных
        //для дальнейшего указания в коллекциях

        BattleUnit battleUnit1 = new Infantry(30, 10, 5);
        BattleUnit battleUnit2 = new Knight(30, 10, 5);

        //можно и так создать для обобщения уже
        //и для хранения в коллекциях
        //полиморфизм наследования - называется такой метод создания юнитов
        BattleUnit[] battleUnits = {infantry1, battleUnit1, battleUnit2};
        for (BattleUnit battleUnit : battleUnits){
            battleUnit.rest();
            battleUnit1.attack(knight1); //на первой итерации атакует как пехотинец, на второй как рыцарь, и т/д
        }

    }
}
