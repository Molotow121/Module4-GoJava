package JavaGo;
/*Решить задачу 2, без использования циклов. Использовав рекурсию.*/

public class Task6 {

    public static void main(String[]args) {
        int width = 5;
        int height = 5;
        drawRectangle(width, height);
    }
    static int numW = 1;
    static int numH = 1;

    public static void drawRectangle(int width, int height) {
        char plus = '+';
        System.out.print(plus + " ");
        numW++;
        if (numW <= width){
            drawRectangle(width, height);
        }

        numH++;
        if(numH <= height){
            numW = 1;
            System.out.println();
            drawRectangle(width, height);
        }
    }
}


