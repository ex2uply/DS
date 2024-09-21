package com.dataStructures.LL.theory;

public class DLL {
    private int size;
    private Node head;

    public DLL(){
        this.size = 0;
    }

    private static class Node{
        int value;
        Node next;
        Node prev;

        public Node(int val){
            this.value = val;
        }
        public Node(int val,Node next,Node prev){
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertAtStart(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
        size++;
    }
    public void insertAtEnd(int val){
        Node node = new Node(val);
        Node temp = head;
        node.next=null;
        if(head==null){
            node.prev= null;
            head = node;
            return;
        }

        while(temp.next!=null){
            temp= temp.next;
        }
        node.prev = temp;
        temp.next = node;
        size++;
    }

    public void display(){
        Node temp = head;
        System.out.print("START -> ");
        while(temp!= null){
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayReverse(){
        Node node = head;
        while(node.next!=null){
            node = node.next;
        }
        System.out.print("END" + " -> ");
        while(node!=null){
            System.out.print(node.value + " -> ");
            node = node.prev;
        }
        System.out.println("START");
    }
    public void insertAtIndex(int index, int val){
        Node node = new Node(val);
        if(index == size){
            insertAtEnd(val);
            return;
        }
        if(index == 1){
            insertAtStart(val);
        }
        Node temp =head;
        while(index-2!=0){
            temp=temp.next;
            index--;
        }
        node.next = temp.next;
        temp.next.prev = node;

        node.prev=temp;
        temp.next = node;
    }


}
