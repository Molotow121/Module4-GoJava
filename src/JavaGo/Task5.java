package JavaGo;
/*Решить задачу 1, без использования циклов. Использовав рекурсию.*/

public class Task5 {

    static int a = 1;

    public static void main(String[]args) {
        int x = (int) (Math.random() * 31);
        count(x);
    }

    public static void count(int x) {
        System.out.println(a++);
        if (a <= x) {
            count(x);
        }
    }
}