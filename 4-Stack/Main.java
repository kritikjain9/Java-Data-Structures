import java.io.*;
import java.util.*;

public class Main{
  
public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] a1 = new int[n1][m1];

        for(int i = 0; i < n1; i++){
            for(int j = 0; j < m1; j++){
                a1[i][j] = scn.nextInt();
            }
        }

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] a2 = new int[n2][m2];

        for(int i = 0; i < n2; i++){
            for(int j = 0; j < m2; j++){
                a2[i][j] = scn.nextInt();
            }
        }

        if(m1 != n2){
            return;
        }



    }
}