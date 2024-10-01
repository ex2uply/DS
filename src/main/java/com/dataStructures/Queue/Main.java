package com.dataStructures.Queue;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(5);
        System.out.println(st.isEmpty());
        st.pop();
        List<Integer> lst = new ArrayList<>();
        lst.add(33);
        System.out.println(lst.subList(1, lst.size()).toString());
//        System.out.println(lst.toString());

        String s = "sfasf";
//        System.out.println(s.substring(1));

        int[] a = new int[3];

        System.out.println(a[2]);

    }
}
