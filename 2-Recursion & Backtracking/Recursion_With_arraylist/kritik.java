import java.util.*;
  
  public class kritik{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int ans = anyBaseToAnyBase(n, sourceBase, destBase);
     System.out.println(ans);
   }
   
   public static int anyBaseToAnyBase(int n, int sourceBase, int destBase){
       int ansInDecimal = anyBaseToDecimal(n, sourceBase);
       int ansInAnyBase = decimalToAnyBase(ansInDecimal, destBase);
       return ansInAnyBase;
   }

private static int decimalToAnyBase(int ansInDecimal, int destBase) {
    int rv = 0;
    int temp = ansInDecimal;
    int pow = 1;
    while(temp != 0){
        int rem = temp % destBase;
        rv += rem * pow;
        temp /= destBase;
        pow *= 10;
    }
    return rv;
}

public static int anyBaseToDecimal(int n, int sourceBase) {
    int rv = 0;
    int temp = n;
    int pow = 1;
    while(temp != 0){
        int rem = temp % 10;
        rv += rem * pow;
        temp /= 10;
        pow *= sourceBase;
    }
    return rv;
}
   
  }