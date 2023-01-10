import java.util.Scanner;

public class Laba3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt(),
                B = in.nextInt();
        int num = 1;
        if (A == 0 || B == 0) System.out.println("Programm done.");
        else {
            for (int i = 1; i <= B; i++) {
               for (int j = 1; j<=A; j++) {
                    System.out.print(num + "x" + j + " = " + i * j + "\t");
                    num++;
                    }
                System.out.println();

                //if (num == B)
                }
            }
        }
}

