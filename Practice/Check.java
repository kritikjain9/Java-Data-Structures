import java.util.*;

/**
 * Check
 */
public class Check {
    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5,6,7,8,9};
        int[] ans = oddNums(a, 0, 0);
        System.out.println(Arrays.toString(ans));
    }

public static int[] oddNums(int a[], int idx, int fsf){
    if(idx == a.length){
        return new int[fsf];
    }

    if(a[idx] % 2 != 0){
        int res[] = oddNums(a, idx+1, fsf+1);
        res[fsf] = a[idx];
        return res;
    }else{
        int res[] = oddNums(a, idx+1, fsf);
        return res;
    }

}

public static int fib(int n){
    int fibNm1 = fib(n -1);
    int fibNm2 = fib(n - 2);

    int fibN = fibNm1 + fibNm2;
    return fibN;
}

}