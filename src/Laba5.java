public class Laba5 {
    public static void main(String[] args) {
        double[] a = {1, 2, 3}, b = {4, -5, 6},
                c = {-7, 8, -9};

        System.out.print("Разница векторов = ");
        raz(a, b);
        System.out.print("Сумма векторов = ");
        summa(b, c);
        System.out.println("Скалярное произведение векторов = " + scal(a,b));
        System.out.print("Векторное произведение векторов = ");
        vekt(a,b);
        System.out.println("Угол между векторами = " + cosinus(a,c));

    }

    public static void raz(double[] arr1, double[] arr2) {
        int size = arr1.length;
        double[] rez = new double[size];
        System.out.print("{");
        for (int i = 0; i < size; i++) {
            rez[i] = arr1[i] - arr2[i];
            System.out.print(rez[i] + ", ");
        }
        System.out.println("}");
    }

    public static void summa(double[] arr1, double[] arr2) {
        int size = arr1.length;
        double[] rez = new double[size];
        System.out.print("{");
        for (int i = 0; i < size; i++) {
            rez[i] = arr1[i] + arr2[i];
            System.out.print(rez[i] + ", ");
        }
        System.out.println("}");
    }

    public static void vekt(double[] arr1, double[] arr2) {
        int size = arr1.length;
        double[] rez_arr = new double [size];
        rez_arr[0] = arr1[1]*arr2[2] - arr1[2]*arr2[1]  ;
        rez_arr[1] = -1*( arr1[0]*arr2[2] - arr1[1]*arr2[2]);
        rez_arr[2] = arr1[0]*arr2[1] - arr1[1]*arr2[0];
        System.out.print("{");
        for(int i = 0; i < size; i++)
            System.out.print(rez_arr[i] + ", ");
        System.out.println("}");
    }

    public static double scal(double[] arr1, double[] arr2) {
        int scl = 0;
        for (int i = 0; i < arr1.length; i++) {
            scl += (arr1[i] * arr2[i]);
        }
        return scl;
    }

    public static double sq(double[] arr) {
        double sqr = 0;
        for (int i = 0; i < arr.length; i++)
            sqr += arr[i]*arr[i];
        sqr = Math.sqrt(sqr);
    return sqr;
    }

    public static double cosinus(double[] arr1, double[] arr2){
        double cs = scal(arr1,arr2)/(sq(arr1)*sq(arr2));
        return cs;
    }
}

