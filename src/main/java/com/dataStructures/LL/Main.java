package com.dataStructures.LL;

import com.dataStructures.LL.theory.CLL;

public class Main {
    public static void main(String[] args){

        CLL list = new CLL();
//
//        for(int i = 0;i<5;i++){
//            list.insertAtStartOrEnd(i);
//        }
//        list.displayReverse();

//        list.insertAtIndex(5,66);
//        list.insertAtIndex(90,23);
//        list.display();
        list.insertAtStartOrEnd(7);
        list.insertAtStartOrEnd(2);
        list.insertAtStartOrEnd(1);
        list.insertAtStartOrEnd(17);
        list.insertAtStartOrEnd(4);
        list.insertAtStartOrEnd(6);
        list.display();
        System.out.println(list.size);
        list.delete(4);
        list.display();
        System.out.println(list.size);




//        list.insertAtEnd(44);
//        list.insert(55,45);
//        list.display();
//        list.deleteLast();
//        list.display();
//        list.deleteFirst();
//        list.display();
//        list.deleteAtIndex(2);
//        list.display();
//        list.findAtIndex(2);


    }
}