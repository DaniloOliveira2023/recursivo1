import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int x;
        int y;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        x = s.nextInt();
        System.out.println("Digite o segundo número");
        y = s.nextInt();
        System.out.println(potencia(x,y));

    }

    private static int potencia(int x, int y) {
        if (y==0) {
            return 1;
        }
        else {
            return x * potencia (x, y - 1);
        }
    }


}