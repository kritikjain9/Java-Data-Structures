import java.util.*;
/**
 * TwoD
 */
public class TwoD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int[][] mat1 = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                mat1[i][j] = scn.nextInt();
            }
        }
    
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        int[][] mat2 = new int[r2][c2];
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                mat2[i][j] = scn.nextInt();
            }
        }

        if(c1 != r2){
            System.out.println("Invalid input");
            return;
        }

        int[][] res = new int[r1][c2];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                int mul = mat1[i][j] * mat2[j][i];
                res[i][j] = mul;
            }
            
        }

    }



    
}
