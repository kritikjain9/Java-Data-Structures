/**
 * GetSubSequence
1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
 */

import java.io.*;
import java.util.*;

public class GetSubSequence {    
        public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            String s = scn.next();
            ArrayList<String> ans = gss(s);
            System.out.println(ans);
        }
    
        public static ArrayList<String> gss(String str) {
            if(str.length() == 0){
                ArrayList<String> ans = new ArrayList<>();
                ans.add("");
                return ans;
            }

            char first = str.charAt(0);
            String fs = str.substring(1);

            ArrayList<String> fal = gss(fs);
            ArrayList<String> myAns = new ArrayList<>();

            for(String s: fal){
                myAns.add(s);
                
            }

            for(String s: fal){
                myAns.add(first + s);
            }

            return myAns;
        }
    
    }