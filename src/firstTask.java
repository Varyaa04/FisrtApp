import java.util.Scanner;

public class firstTask {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
         int num = in.nextInt();
            if (num > 0) {
                int summach = 0;
                for (int i = 0; i <= num; i++) {
                    int a = num % 10;
                    num = num / 10;
                    summach += a;

                }
                System.out.print("Итог: " + summach);
            } else {
                System.out.print("Ошибка!Число должно быть положительным!");
            }
        }

    }
