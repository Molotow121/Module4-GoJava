package JavaGo;
/*Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+'.
  Аргументы функции: ширина прямугольника в символах, высота прямоугольника в символах*/

public class Task2 {

    public static void main(String[]args) {
        int width = 5;
        int height = 5;
        drawRectangle(width, height);
    }

    public static void drawRectangle(int width, int height) {
        char plus = '+';
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++) {
                System.out.print(plus+ " ");
            }
            System.out.println();
        }
    }
}