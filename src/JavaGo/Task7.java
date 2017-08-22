package JavaGo;
/*Написать программу, в которой выполнены все шесть предыдущих заданий. Каждое задание выполняется в отдельной функции. В пределах этой же функции происходит ввод с консоли необходимых данных.
  Программа спрашивает пользователя какую задачу он хочет решить (от 1 до 6).
  Затем программа вызывает соответствующую функцию для решения этой задачи.
  По окончанию решения задачи, программа спрашивает пользователя, хочет ли он продолжить решать задачи.Если да - опять спрашивает какую задачу.*/

import java.util.Scanner;


public class Task7 {

    public static void main(String...args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Выберите задачу для решения:");
        int num = s.nextInt();
        switch (num){
            case 1:
                Task1.main(new String[0]);
                txt();
                break;
            case 2:
                Task2.main(new String[0]);
                txt();
                break;
            case 3:
                Task3.main(new String[0]);
                txt();
                break;
            case 4:
                Task4.main(new String[0]);
                txt();
                break;
            case 5:
                Task5.main(new String[0]);
                txt();
                break;
            case 6:
                Task6.main(new String[0]);
                txt();
                break;
            default:
                break;
        }
    }
    private static void txt() {
        System.out.println();
        System.out.println("Желаете продолить решать задачи?");
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        if (txt.equals("да")){
            main();
        }
    }
}