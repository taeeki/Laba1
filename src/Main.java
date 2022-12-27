import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble(),
                b= in.nextDouble(),
                c=in.nextDouble(),
                d=in.nextDouble(),
                e=in.nextDouble();

        //1
       double ex1 = ((a+b+c)*d)/e;
        //2
       double ex2 = a*b*c*d*e;
        //3
       double ex3 = 1/(a*b*c*d*e);
        //4
       //double ex4 = Math.pow(a,Math.pow(b, Math.pow(c, Math.pow(d,e))));

        //5
        double ex5 = Math.log(a);


        System.out.println("Example1 = " + ex1);
        System.out.println("Example2 = " + ex2);
        System.out.println("Example3 = " + ex3);
        System.out.println("Example4 = " + ex4);
        System.out.println("Example5 = " + ex1);
    }
}