import java.util.*;

import java.util.*;

public class test {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);

       int n1 = scn.nextInt();
       int[] a = new int[n1];
       for(int i = 0; i < n1; i++){
           a[i] = scn.nextInt();
       }

       int n2 = scn.nextInt();
       int[] b = new int[n2];
       for(int j = 0; j < n2; j++){
           b[j] = scn.nextInt();
       }

       int len = n1 > n2 ? (n1) : (n2);
       int[] res = new int[len+1];

       int i = n1 - 1, j = n2 - 1, k = len - 1;
       int carry = 0, sum = 0;

       while(i < n1 && j < n2){
           if(i >= 0 && j >= 0){
               sum += carry;
               sum = a[i] + b[j];
               sum = sum % 10;
               carry = sum / 10;
            }

            res[k] = sum;
            i--; j--; k--;
       }
       if(carry > 0){
            System.out.println(carry);
       }
       System.out.println(Arrays.toString(res));

    }
}
