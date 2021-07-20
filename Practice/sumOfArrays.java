import java.util.*;
import java.io.*;
/**
 * sumOfArrays
 */
public class sumOfArrays {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a = new int[n1];
        for(int i = 0; i < n1; i++){
            a[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] b = new int[n2];
        for(int i = 0; i < n2; i++){
            b[i] = scn.nextInt();
        }

        int[] sum = new int[(n1 > n2)? n1 : n2];

        int i = a.length - 1;
        int j = b.length - 1;
        int k = sum.length - 1;
        int carry = 0;

        while(k >= 0){
            int digit = a[i] + b[j] + carry;
            digit %= 10;
            carry = digit / 10;

            sum[k] = digit;
            i--; j--; k--;
        }

        if(carry > 0){
            System.out.println(carry);
        }

        for(int val: sum){
            System.out.println(val);
        }

    }
    
}