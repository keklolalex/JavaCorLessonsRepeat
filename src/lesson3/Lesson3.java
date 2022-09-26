package lesson3;

import java.util.Scanner; //берем пакет из java.util

public class Lesson3 {
    public static void main(String[] args) {
        //Операторы:
        // ИНКРЕМЕНТ ++ увеличивает значение переменной на 1
        // ДЕКРЕМЕНТ -- уменьшает значение переменной на 1
        //только с именами переменными a++ , 45++ так нельзя
        int a = 3;
        System.out.println(a++); //3 //постфиксная форма
        // сначала возвращает, потом увеличивает и потом записывает в новое значение
        System.out.println(a); //4

        a = 1;
        System.out.println(++a); //2 //префиксная форма
        // сначала увеличивает и потом записывает и потом возвращает новое значение
        System.out.println(a); //2

        int b = 3;
        System.out.println(b--); //3 //постфиксная форма
        // сначала возвращает, потом увеличивает и потом записывает в новое значение
        System.out.println(b); //2

        b = 1;
        System.out.println(--b); //0 //префиксная форма
        // сначала увеличивает и потом записывает и потом возвращает новое значение
        System.out.println(b); //0

        //ВВОД данных с клавиатуры
        Scanner in = new Scanner(System.in);
        //с помощью переменной in делаем ввод в клавиатуры
        System.out.println("Введите целое число");

        int userNumber = in.nextInt();
        System.out.println(userNumber * userNumber);

        //ЦИКЛЫ while, do while, for
        //для повторяющихся операций несколько раз
        //принимают в скобки только булевые выражения

        int printCount = 3;
        while (printCount > 0)/* в скобках булевое выражение*/{
            System.out.println("======");
            printCount--;
            //printCount -= 1;
            //printCount = printCount - 1;
        }
        //в скобках тело цикла
        //повторение инструкций из тела цикла называются "итерации", 1 раз "итерация"

        /* не будет выполнено ни одной итерации т.к. сразу false условие
        while (false){
            System.out.println("false");
        }*/

        /* бесконечный цикл
        while (true){
            System.out.println("false");
        }*/

        /* бесконечный цикл, не обновляется переменная
        int a = 18;
        while (a > 0){
            System.out.println("бесконечный цикл");
        }*/

        while (true){
            System.out.println("Введите целое положительное число или 0 если хотите выйти из программы");
            userNumber = in.nextInt();
            //директивы break и continue (они не обязательные)
            if (userNumber == 0) break; //завершение или выход текущего цикла и остальные инструкции не выполняются
            // и больше не проверяется условие, выход за скобки
            if (userNumber < 0) continue; //переход на след. итерацию с проверкой условия но не выполняет след инструкции
            System.out.println(userNumber * userNumber);
        }

        //вывести в консоль все четные числа от start до end

        int start = 1, end = 13;
        while (start <= end ){
            if (start % 2 == 0) System.out.println(start);
            start++;
        }

        //for ( ; ; ) { } бесконечный цикл
        //выбирая написать бесконечный цикл только while

        for (int s = 1, e = 13; s <= e; s++){
            if (s % 2 == 0) System.out.println(s);
        }
        //for (int s = 1, e = 13;  // инициализация счетчиков, каких то переменных, выполняется 1 раз
        // s <= e; //условие, булевое выражение 1 шт, выполняется тело цикло при true
        // s++) // обновление счетчиков
        // {

    }
}
