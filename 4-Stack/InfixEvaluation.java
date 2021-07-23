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
        Stack<Character> operator = new Stack<>();
        Stack<Integer> operand = new Stack<>();

        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                operator.push(ch);
            }else if(ch >= '0' && ch <= '9'){
                operand.push(Integer.parseInt(ch+""));
            }
        }
        System.out.println(operator);
        System.out.println(operand);

    }



}