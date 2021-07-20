import java.io.*;
import java.util.*;

public class GetMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> ans =  getMazePaths(0, 0, n-1, m-1);
        System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        if(sr > dr || sc > dc){                     //agar invalid hai to path mei add nahi karna hai
            return new ArrayList<>();
        }

        ArrayList<String> HPaths = getMazePaths(sr, sc+1, dr, dc);
        ArrayList<String> VPaths = getMazePaths(sr+1, sc, dr, dc);

        ArrayList<String> myAns = new ArrayList<>();
        for(String s: HPaths){
            myAns.add("h"+s);
        }
        for(String s: VPaths){
            myAns.add("v"+s);
        }

        return myAns;

    }

}