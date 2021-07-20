import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
  
  static void reverse(int[] a, int start, int end){
      while(start < end){
          int temp = a[start];
          a[start] = a[end];
          a[end] = temp;
          
          start++;
          end--;
      }
  }

  public static void rotate(int[] a, int k){
        reverse(a, a.length - k, a.length-1);
        reverse(a, 0, a.length - k - 1);
        reverse(a, 0, a.length-1);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}