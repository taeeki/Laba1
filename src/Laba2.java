import java.util.Scanner;

public class Laba2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean a = in.nextBoolean(),
             b = in.nextBoolean() ;
        int c = in.nextInt(),
            d = in.nextInt(),
            e = in.nextInt();
        int q = 0, w = 0, X = 0, y = 0, z = 0;
        //y
        y = (c<=d) ? e : d;
        //z
        if (c < e && c <= d) z = d;
        else if(c > d ) z = c;
        else z = e;
        //q
        q = (c == e && e == d) ? 0 : c;
        //w
        w = (c == (d/2)) ? c : 0;
        //x
        if(a == true && b == false) X = y;
        else if (a == false && b == false) X = z;
        else if (a == true && b == true) X = q;
        else if (a == false && b == true) X = w;


        System.out.println("y = " + y + "\nz = " + z + "\nq = " + q
        + "\nw = " + w + "\nX = " + X);
    }
}
