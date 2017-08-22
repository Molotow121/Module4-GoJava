package JavaGo;
/*Написать функцию которая считает в консоли до числа Х.
  Аргументы функции: число Х*/

public class Task1 {

    public static void main(String[]args) {
        int x = (int) (Math.random() * 31);
        count(x);
    }

    public static void count(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(i + "");
        }
    }
}