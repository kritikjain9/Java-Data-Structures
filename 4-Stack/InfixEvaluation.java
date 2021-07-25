/*
Constraints
1. Expression is balanced
2. The only operators used are +, -, *, /
3. Opening and closing brackets - () - are used to impact precedence of operations
4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
5. In two operators of equal precedence give preference to the one on left.
6. All operands are single digit numbers.
Sample Input
2 + 6 * 4 / 8 - 3
Sample Output
2

*/

import java.io.*;
import java.util.*;

public class InfixEvaluation{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Stack<Character> tor = new Stack<>();
        Stack<Integer> operand = new Stack<>();

        for(int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                if(tor.size() > 0 && OP(ch) > OP(tor.peek())){
                    tor.push(ch);
                }else{
                    int v2 = tor.pop();
                    int v1 = tor.pop();
                    if(ch == '+') operand.push(v1 + v2);
                    else if(ch == '-') operand.push(v1 - v2);
                    else if(ch == '*') operand.push(v1 * v2);
                    else {
                        operand.push(v1 / v2);
                    }
                }
            }else if(ch >= '0' && ch <= '9'){
                operand.push(Integer.parseInt(ch+""));
            }
        }

        while(tor.size() != 0){
            char ch = tor.peek();
            int v2 = tor.pop();
            int v1 = tor.pop();
            if(ch == '+') operand.push(v1 + v2);
            else if(ch == '-') operand.push(v1 - v2);
            else if(ch == '*') operand.push(v1 * v2);
            else {
                operand.push(v1 / v2);
            }
        }
        System.out.println(tor.peek());
    }

    public static  int OP(char ch){
        if(ch == '/' || ch == '*'){
            return 2;
        }else{
            return 1;
        }
    }

}










//if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
//        if(OP(ch) > operator.peek()){
//        int v1 = operand.pop();
//        int v2 = operand.pop();
//if(ch == '+') operand.push(v1 + v2);
////        else if(ch == '-') operand.push(v1 - v2);
////        else if(ch == '*') operand.push(v1 * v2);
////        else if(ch == '/') operand.push(v1 / v2);
//        chal ek meri iccha negative mahol mausam
//        }else{
//        if()
//        }
//        } else if (ch >= '0' && ch <= '9') {
//        operand.push(Integer.parseInt(ch + ""));
//        }
