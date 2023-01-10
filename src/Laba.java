import java.util.Scanner;
public class Laba {
    public static void main(String[] args) {
        int [] array = new int[5];
        input(array);
        show(array);
        System.out.println(maximum(array));
    }
    public static int maximum(int [] arr){
        int max = arr[0];
         for(int i = 0; i < arr.length ; i++){
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }
    public static void show(int[] arr){
        for (int i = 0; i < 5; i++)
            System.out.println(arr[i]);
    }
    public static void input(int [] arr){
        Scanner in = new Scanner(System.in);
        for(int i =0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
    }
}

