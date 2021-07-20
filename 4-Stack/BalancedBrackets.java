/*
BalancedBrackets
1. You are given a string exp representing an expression.
2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

e.g.
[(a + b) + {(c + d) * (e / f)}] -> true
[(a + b) + {(c + d) * (e / f)]} -> false
[(a + b) + {(c + d) * (e / f)} -> false
([(a + b) + {(c + d) * (e / f)}] -> false
*/

import java.util.*;

public class BalancedBrackets {

   public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        System.out.println(BB(exp));
        scn.close();
    }

    public static boolean BB(String exp){
        Stack <Character> st = new Stack<>();
        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){        //opening ko seedhe push 
                st.push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']'){   //closing pe check karenge
                if(st.size() == 0)return false;             //no closing B > no. of opening B 
                
                else if(ch == ')' && st.peek() != '('){     //bracket mismatch
                    return false;
                }
                else if(ch == '}' && st.peek() != '{'){
                    return false;
                }
                else if(ch == ')' && st.peek() != '('){
                    return false;
                }
                st.pop();
            }
        }

        if(st.size() != 0){                                 // no. of opening B > no closing B 
            return false;
        }

        return true;
    }

}
