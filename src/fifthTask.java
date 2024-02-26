import java.util.Scanner;
import java.util.Random;

public class fifthTask
{
    public static void  main(String args[])
    {
        String[] masti = new String[]{"пики", "трефы", "бубны", "черви"};
        String[] dost = new String[]{"шестерка","семерка","восьмерка","девятка","десятка","валет","дама","король","туз"};
        Scanner in = new Scanner(System.in);
        System.out.println("Введите масть карты от 1 до 4: ");
        int ms = in.nextInt();
        while(ms <= 0 || ms >4){
            System.out.println("Ошибка!Введите верные значения! ");
            ms = in.nextInt();
        }
        Scanner dos = new Scanner(System.in);
        System.out.println("Введите достоинство карты от 6 до 14: ");
        int ds = dos.nextInt();
        while(ds < 6 || ds >14){
            System.out.println("Ошибка!Введите верные значения! ");
            ds = in.nextInt();
        }
        System.out.print(dost[ds-6]);
                System.out.print(" "+masti[ms-1]);

    }
}
