import java.util.Scanner;
import java.util.Random;

public class thirdTask
{
        public static void main(String [] args) {
            Scanner in = new Scanner(System.in);
            int a = 50;
            boolean pobeda = false;
            while (!pobeda) {
                System.out.print("Число больше "+a+"?: ");
                int ravno = in.nextInt();
                if (ravno == 0) {
                    System.out.print("Число равно = "+a+"?: ");
                    ravno = in.nextInt();
                    if(ravno==0){
                        a = a/2;
                    }
                    if(ravno==1){
                        pobeda = true;
                    }
                }
                if (ravno == 1) {
                    a = a*3/2;
                }
            }
            System.out.print("Ваше загаданное число = "+ a);
        }
}
