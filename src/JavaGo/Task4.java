package JavaGo;
/*Написать функцию getMax которая принимает на вход два аргумента в виде чисел. А возврыщает максимальное из этих двух
  Так же, необходимо перегрузить эту функцию для работы с разными числовыми типами переменных (int, float).*/

public class Task4 {

    public static void main(String[]args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        float d = (float) (Math.random() * 100);
        System.out.println(getMax(a,b));
        System.out.println(getMax(c,d));
    }


    public static int getMax(int a, int b) {
        int max;
        if (a > b && b < a) {
            max = a;
        } else {
            max = b;
        }

        return max;
    }
    public static double getMax(int c, float d){
        double max;
        if (c > d && d < c) {
            max = c;
        } else {
            max = d;
        }

        return max;
    }
}