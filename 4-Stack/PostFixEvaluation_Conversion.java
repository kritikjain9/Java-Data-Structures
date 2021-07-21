/*
1. You are given a postfix expression.
2. You are required to evaluate it and print it's value.
3. You are required to convert it to infix and print it.
4. You are required to convert it to prefix and print it.

Note -> Use brackets in infix expression for indicating precedence. Check sample input output for more details.
Constraints
1. Expression is a valid postfix expression
2. The only operators used are +, -, *, /
3. All operands are single digit numbers.
Sample Input
264*8/+3-
Sample Output
2
((2+((6*4)/8))-3)
-+2/*6483
*/

import java.io.*;
import java.util.*;

public class PostFixEvaluation_Conversion{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    Stack<Integer> eval = new Stack<>();
    Stack<String> prefix = new Stack<>();
    Stack<String> infix = new Stack<>();

    for(int i = 0; i < exp.length(); i++){
      char ch = exp.charAt(i);

      if(ch >= '0' && ch <= '9'){
        eval.push(Integer.parseInt(ch+""));
        prefix.push(ch+"");
        infix.push(ch+"");
      }
      else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
        //evalutaion stack
          int Ev2 = eval.pop();
          int Ev1 = eval.pop();
          
          if(ch == '+')eval.push(Ev1 + Ev2);
          else if(ch == '*')eval.push(Ev1 * Ev2);
          else if(ch == '/')eval.push(Ev1 / Ev2);
          else if(ch == '-')eval.push(Ev1 - Ev2);

          //prefix stack
          String Pv2 = prefix.pop();
          String Pv1 = prefix.pop();
          prefix.push(ch+Pv1+Pv2);

          //infix stack
          String Iv2 = infix.pop();
          String Iv1 = infix.pop();
          infix.push('(' + Iv1 +ch+ Iv2+')');
      }
    }
    System.out.println(eval.peek());
    System.out.println(infix.peek());
    System.out.println(prefix.peek());
    

 }
}