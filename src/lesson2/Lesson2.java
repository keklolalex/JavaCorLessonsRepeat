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


        double sum = 459_932.54;
        double sum1 = sum * 0.9;
        double res = sum > 100_000 ?  sum1 : sum;
        System.out.println(res);

    }

}