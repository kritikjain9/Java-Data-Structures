import java.io.*;
import java.util.*;

public class PreFixEvaluation_Conversion{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    Stack<Integer> eval = new Stack<>();
    Stack<String> postfix = new Stack<>();
    Stack<String> infix = new Stack<>();

    for(int i = exp.length() - 1; i >= 0; i--){
      char ch = exp.charAt(i);

      if(ch >= '0' && ch <= '9'){
        eval.push(Integer.parseInt(ch+""));
        postfix.push(ch+"");
        infix.push(ch+"");
      }
      else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
        //evalutaion stack
          int Ev1 = eval.pop();
          int Ev2 = eval.pop();
          
          if(ch == '+')eval.push(Ev1 + Ev2);
          else if(ch == '*')eval.push(Ev1 * Ev2);
          else if(ch == '/')eval.push(Ev1 / Ev2);
          else if(ch == '-')eval.push(Ev1 - Ev2);

          //prefix stack
          String Pv1 = postfix.pop();
          String Pv2 = postfix.pop();
          postfix.push(Pv1+Pv2+ch);

          //infix stack
          String Iv1 = infix.pop();
          String Iv2 = infix.pop();
          infix.push('(' + Iv1 +ch+ Iv2+')');
      }
    }
    System.out.println(eval.peek());
    System.out.println(infix.peek());
    System.out.println(postfix.peek());
    

 }
}