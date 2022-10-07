package lesson5;

import java.util.Arrays;

public class Lesson5 {
    public static void main(String[] args) {
        //Массивы
        //тоже ссылочный тип
        //переменная ссылается на набор данных
        //только данные одного типа

        int[] arg = new int[7]; //где 7 - это длина массива, создан массив на 7 элементов
        //и заполнен значениями по умолчанию

        //размер массива изменить нельзя!
        //массивы всегда создаются со значениями по умолчанию
        //целочисленные массивы заполняются нулями 0
        //массивы для float/double заполняются 0.0
        //массивы для boolean заполняются false
        //для char символами нулей
        //массивы для ВСЕХ ссылочных типов заполняются null

        System.out.println(arg);
        System.out.println(Arrays.toString(arg)); //класс Arrays для массивов // для вывода значения по умолчанию

        int[] ints2 = {4, 523, 234 , 23, 65, -754, 2}; //способ сразу обьявить массив
        System.out.println(Arrays.toString(ints2));

        ints2 = new int[3];
        //ints2 = {1, 2, 54}; //так нельзя делать
        ints2 = new int[]{1, 342, 654};// только так если нало определить массив сразу
        System.out.println(Arrays.toString(ints2));

        //длинна массива - положительное значение типа int
        int len = 10;
        int[] ints3 = new int[len]; //размер определяющей длины массива нельзя изменить
        String[] strings2 = new String[len * 2]; //длина массива вычисляется выражением тип int
        System.out.println(Arrays.toString(strings2));
        //только положительный массив
        //длина характеристика массива

        System.out.println(ints3.length); //показывает сколько длина массива
        System.out.println(strings2.length);

        //в квадратные скобки может быть передано целочисленное выражение

        //доступ к элементам массива
        // [543, 324, 4, 32, -1, 45]
        strings2 = new String[len * 2];
        strings2[4] = "Цветы"; // замена по индексу
        strings2[2] = "red";
        strings2[10] = "black";
        System.out.println(Arrays.toString(strings2));
        System.out.println(strings2[12]);
        System.out.println(strings2[10]);

        //при обращениям к элементам массива может произойти выход за пределы массива
        //System.out.println(strings2[21]);
        // ошибка java.lang.ArrayIndexOutOfBoundsException

        int[] ints4 = {3,-4, 321, 32, 564, 65};
        //вывести в консоль случайный элемент массива
        //int count = ints4.length;
        //System.out.println(count);
        System.out.println(ints4[(int)(Math.random()*ints4.length)]);

        //перебор элементов массива
        //последовательно обращаться к элементам массива
        //цикл for позволяет изменять значения элементов массива
        //позволяет переберать элементы начиная с последнего элемента

        for (int arrIndex = 0; arrIndex < ints4.length; arrIndex++){
            System.out.println(ints4[arrIndex]);
            ints4[arrIndex] += 100;
        }
        System.out.println(Arrays.toString(ints4));

        //foreach - не имеет доступа к индексам
        //поэтому нельзя изменять значение элементов массива
        //for (типДанных элемента имяПеременной : массив )
        //обращения происходят последовательно
        int sum = 0;
        for (int elementValue: ints4){
            //elementValue - значение элементов массива
            System.out.println(elementValue);
            sum += elementValue;
        }
        System.out.println(sum);


        //сортировка массива

        int[] tip = {5, 534, 23, -321, 56};
        Arrays.sort(tip); // сортировка по возрастанию, меняет исходный массив
        //сортирует алгоритмом быстрой сортировки
        System.out.println(Arrays.toString(tip));

        //метод поиска бинарный
        //использовать только в отсортированном массиве
        //возвращает первое значение которое нашел
        int elementIndex = Arrays.binarySearch(tip,23);
        System.out.println(elementIndex);

        elementIndex = Arrays.binarySearch(tip,100);
        System.out.println(elementIndex); //-5 // если метод решил отрицательное значение, значит элемента в массиве нет

        //копирование массивов
        //для копирования не используется оператор присваивания =,
        //иначе он скопирует ссылку, а не значения

        double[] double1 = {1.5, 3.2, 6.765, 7.2, 3.765, 0.6768, -3.2,};
        //double[] doubles2 = double1; //обращается к ссылке массива а не к самим значениям
        // 1. создание полной копии массива
        double[] cloneArr = double1.clone();
        System.out.println(Arrays.toString(cloneArr));

        // 2. создание частичной копии
        double[] copyArr = Arrays.copyOf(double1, 4);
        System.out.println(Arrays.toString(copyArr));

        // 3. создание частичной копии
        double[] newDoubles = new double[10];
        System.arraycopy(double1, // исходный массив
                2, //начиная с какого индекса копируем массив
                newDoubles, // новый массив
                3, // начиная с какого индекса вставляем элементы в новый массив
                2 //сколько элементов нужно скопировать
        );
        System.out.println(Arrays.toString(newDoubles));



    }
}
