import java.util.Scanner;
import java.util.Random;
public class secondTask
{
    public static void main(String args[]) {
        Random random = new Random();
        int randomch = random.nextInt(1,9);
        Scanner in = new Scanner(System.in);
        System.out.println("Компьютер загадал число от 1 до 9. Попробуй угадать: ");
        int num = in.nextInt();
        if (num >= 1 && num <= 9)
        {
           while(num != randomch)
           {
                if(num >randomch)
               {
                   System.out.print("загаданное число меньше!");
                   num = in.nextInt();
               }
                if (num < randomch)
                {
                   System.out.print("загаданное число больше!");
                   num = in.nextInt();
               }
               if(num == randomch)
               {
                   System.out.print("Вы угадали!Выход из программы!");
                   System.exit(0);
               }
               if(num == 0){
                   System.out.print("Выход из программы!");
                   System.exit(0);
                   num = in.nextInt();

               }
           }
        }
        else if (num == 0){
            System.out.print("Выход из программы!");
            System.exit(0);
        }
        else{
            System.out.print("Ошибка!Число должно быть положительным!");
        }
    }
}
