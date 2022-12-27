import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble(),
                b= in.nextDouble(),
                c=in.nextDouble(),
                d=in.nextDouble(),
                e=in.nextDouble();

        System.out.println("Example1 = " + (((a+b+c)*d)/e));
        System.out.println("Example2 = " + (a*b*c*d*e));
        System.out.println("Example3 = " + (1/(a*b*c*d*e)));
        System.out.println("Example4 = " + (Math.pow(a,Math.pow(b, Math.pow(c, Math.pow(d,e))))
                /(Math.pow(a, (1/(b*c*d*e))))));
        System.out.println("Example5 = " + (Math.log(a)/Math.log(b)));
        System.out.println("Example6 = " + (Math.pow((a+b)/((c+d)*d), (a+b+e))));
    }
}