import java.util.*;

public class mohitSir {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
            
        ArrayList<String> ans = gss(str);
        System.out.println(ans);
    }

    public static ArrayList<String> gss(String str) {
        if(str.isEmpty()){
            ArrayList<String>baseList = new ArrayList<>();
            baseList.add("");   // agar ye nahi karenge, toh phir ispe loop nahi laga paenge
            return baseList;  
        }

        char first = str.charAt(0);
        String restOfStr = str.substring(1);

        ArrayList<String> rres = gss(restOfStr);

        ArrayList<String> myAns = new ArrayList<>();
        for(String s: rres){
            myAns.add(s);
        }

        for(String s: rres){
            myAns.add(first+s);
        }

        return myAns;

    }
   
    
}
