import java.util.Stack;

import java.util.*;

public class IntroStack{
    public static void main(String[] args) {
        Stack st1 = new Stack();
        Stack <Integer> st = new Stack<>();
        st.push(2);
        st.push(23);
        st.push(224);
        st.push(2242);
        st.push(223);
        st.push(27);
        System.out.println(st.search(2));
        System.out.println(st.search(23));
        System.out.println(st.search(224));
        System.out.println(st.search(2242));
        System.out.println(st.search(223));
        System.out.println(st.search(27));
        System.out.println(st);
    }
}