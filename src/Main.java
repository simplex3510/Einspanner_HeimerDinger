import java.util.Scanner;

public class Main {
    public static void main (String[] arg) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        int num = 1;

        for (int i=0; i<line; i++) {
            for (int j=0; j<line; j++){
                System.out.print(num + " ");
                num += 2;

                if (10 <= num)
                    num = 1;
            }
            System.out.print('\n');
        }

    }
}


