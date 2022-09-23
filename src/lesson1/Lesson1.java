package lesson1;

public class Lesson1 {
    // точка входа в программу
    //psvm + Enter
    public static void main(String[] args) {
        //sout + Enter
        System.out.println("сокращения хорошо"); // вывод в консоль
        // обявление переменных: типДанных имяПеременной
        int size; //int целое число
        size = 105; // переменной присвоили значение 105
        System.out.println(size);

        int count = 607;
        int lenght = 20, width = 50;
        count = 800_888; // count = 800000 такая запись норм для разделения
        System.out.println(count);
        long time = 7_000_938_003L; //к болшим числам надо добавить L в конце
        double priz = 54.87;
        float type = -234.45F; //необходимо добавить F или f для обозначения типа данных
        System.out.println(priz / 0); // получаем бесконечность при делении дробного числа Infinity
        //System.out.println(time / 0); // программа останавливается ошибка

        // приведение типов данных
        //автоматическое при совместимых типов данных и расширении контейнера
        priz  = count;
        System.out.println(priz);
        //явное приведение типов данных при совместимых типов данных
        byte small = (byte)count;
        System.out.println(small);

        // бинарный оператор оперканд 1 / операнд 2
        // унарный оператор "-операнд"
        int a = 5, b = 2;
        int c = a / b; //всегда целое число результат
        System.out.println(c);

        double c2 = (double) a / b;
        System.out.println(c2); // если один из операндов будет double то результат всего выраженият тоже double c
        // плавающей точкой

        byte x = 6, y = 10;
        //byte z = (byte) x + y; // сложение byte или short всегда int // к типу byte только х // вообще не верно
        byte z1 = (byte) (x + y); // здесь вся сумма приводится в byte
        //System.out.println(z);
        System.out.println(z1);

    }
}
