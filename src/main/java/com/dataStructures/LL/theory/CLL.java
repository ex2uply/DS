package com.dataStructures.LL.theory;

import lombok.AllArgsConstructor;

public class CLL {
    private Node head;
    private Node tail;
    public int size;

    public CLL(){
        this.size=0;
        this.head = null;
        this.tail=null;
    }

    @AllArgsConstructor
    private static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public void insertAtIndex(int index,int val){

        if(index>size){
            System.out.println("Enter Valid Index");
            return;
        }

        Node node = new Node(val);

        if(size==0){
            head = node;
            tail = node;
            size++;
            return;
        }


        if(index == 1 || index == size){
            insertAtStartOrEnd(val);
            size++;
            return;
        }


        Node temp = head;
        while(index-2!=0){
            temp = temp.next;
            index--;
        }
        node.next = temp.next;
        temp.next = node;
        size++;

    }

    public void display(){
        if(size==1){
            System.out.println(head.val);
            return;
        }
        Node temp = head;
        while(temp.next != head){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println(temp.val);
    }
    public void insertAtStartOrEnd(int val) {
        Node node = new Node(val);
        if(size==0){
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }




    public void delete(int value){
        Node temp = head;
        if(temp==null){
            return;
        }
        if(temp.val==value){
            if(tail==head){
                tail=null;
                head=null;
                size--;
                return;
            }
            head = head.next;
            tail.next = head;
            size--;
            return;
        }

        while(temp.next!=head){
            if(temp.next.val == value){
                if(temp.next == tail){
                    tail = temp;
                    tail.next = head;
                    size--;
                    return;
                }
                temp.next=temp.next.next;
                size--;
                return;
            }
            temp = temp.next;
        }
    }
}

