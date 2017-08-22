package JavaGo;
/*Перегрузить функцию drawRectangle (задание 2) таким образом, что бы она могла принимать на вход только 1 параметр
 (ширина квадрата) и рисовать квадрат с равными сторонами. */

public class Task3 {

    public static void main(String[]args) {
        int width = 5;
        drawRectangle(width);
    }

    public static void drawRectangle(int width) {
        char plus = '+';
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(plus + " ");
            }
            System.out.println();
        }
    }
}