package lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        //операторы сравнения
        int a = 54;
        int d = 454;
        int c = 32;
        System.out.println(a > d); //false
        System.out.println(a >= c); //true
        System.out.println(a = c); // 54
        System.out.println(a != d); //true

        // тернарный оператор
        // выражение х = выражение ? выражение1 : выражение2
        int star = 3, end = 100;
        int rest = star > end ? 0 : star; //false 3


        double sum = 12314;
        double sum1 = sum * 0.9;
        double res = sum > 100_000 ?  sum1 : sum;
        System.out.println(res);

        //логические операторы тип boolean false || true
        // && - и || - или
        // ! меняет на противоположное
        // if switch операторы принятия решений

        int state = 43;
        //если state равен 0 то вывести в консоль "закрытие приложения"
        //если state равен 1 то вывести в консоль "Открытие приложения"
        //в остальных случаяч вывести в консоль "Ошибка статуса"

        if (state == 0){ // в скобках булевое выражение
            // любое кол-во условий или даже if
            //если инструкция одна то можно на одной строке ставить без скобок {}
            // если их много используем скобки {}
            System.out.println("Закрытие приложения");
        } else if (state == 1){
            System.out.println("Открытие приложения");
        } else {
            System.out.println("Ошибка статуса");
        }
            // если есть ветвления после получения значения true то след условия не проверяются
        /**
         * на циклы работа
         */

        //switch
        // только для byte, short, int, char, long
        state = 0;
        //если state равен 0 то вывести в консоль "закрытие приложения"
        //если state равен 1 или 100 то вывести в консоль "Открытие приложения"
        //в остальных случаяч вывести в консоль "Ошибка статуса"
        switch (state){ // с скобках либо имя переменной или какое то выражение
            case 0: //
                System.out.println("Закрытие приложения");
                break; // break нужен чтобы дальше не выполнялся switch
            case 1:
            case 100: // написание подряд это как был условие "или"
                System.out.println("Открытие приложения");
                break;
            default: // вместо else  и это не обязательный блок
                System.out.println("Открытие приложения");
        }
        int age = 2;

        //лямбда выражения с 8 версии
        // с 12 версии в стиле лямбда выражений
        //синтаксис switch в стиле лямбда выражений
        // способность вернуть результат своей работы в переменную
        // -> означает что выполнить след инструкции

        switch (age){
            case 0, 1 -> System.out.println(200); //если значение переменной age 0 или 1 вывести 200
            case 2, 3 -> System.out.println(150);  //вот так не работает, нужно именно выражение для записи в переменну/ю
            case 4, 5 -> System.out.println(100);
            default -> System.out.println(0);
        }
        //такой метод просто выведет значение

        int count =  switch (age){
            case 0, 1 -> 200; //если значение переменной age 0 или 1 вывести 200
            case 2, 3 -> 150;  //System.out.println(150) вот так не работает, нужно именно выражение для записи в переменну/ю
            case 4, 5 -> 100;
            default -> 0;
        }; //вот так обязательно для выражения и значения в таком варианте switch
        System.out.println(count);

        //если кейс с несколькими инструкциями то пишем в фигурных скобках, скобки обязательно

        count =  switch (age){
            case 0, 1 -> {
                System.out.println("Результат на 0 - 1 год: " + 200);
                yield 200; //заставляет вернуть значение в переменную, все изза скобок
            }
            case 2, 3 -> {
                System.out.println("Результат на 2 - 3 года: " + 150);
                yield 150;
            }
            case 4, 5 -> {
                System.out.println("Результат на 4 - 5 лет: " + 100);
                yield 100;
            }
            default -> { //если вернуть ничего не надо то и default не нужен
                System.out.println("Результат для собаки старше 5 лет: " + 0);
                yield 100;
            }
        };
        System.out.println(count);

        int k = 1;
        // блок { }
        // область видимости локальных переменных - блок фигурных скобок { }
        //если переменная обьявлена внутри фигурных скобок то ее не видно
        {
            int l = 2; // если переменная обьявлена внутри блока снаружи ее не видно
            System.out.println(k);
            System.out.println(l);
        }
        System.out.println(k);
        //System.out.println(l); //снаружи ее не существует

    }


}