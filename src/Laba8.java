import java.util.Scanner;

public class Laba8 {

    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[][] spir = new int [n][m];
        int a = 0, b = n-1;//g,s
        int c = 0, d = m-1, i = 0;//x,b
        int shet = 1;
        while(shet <= n*m){
            for(i = a; i <= b; i++){
                spir[c][i] = shet;
                shet++;
            }
            if(shet > n*m) break;
            c++;
            for (i = c; i <= d; i++) {
                spir[i][b]=shet;
                shet++;
            }
            if(shet > m*n) break;
            b--;
            for (i = b; i >= a; i--) {
                spir[d][i]=shet;
                shet++;
            }
            if(shet > m*n) break;
            d--;
            for (i = d; i >= c; i--) {
                spir[i][a]=shet;
                shet++;
            }
            a++;
        }
        for (i = 0; i < m; i++){
            System.out.println();
            for(int j = 0; j < n; j++){
                System.out.print(spir[i][j]+"\t");
            }
        }
    }
}
