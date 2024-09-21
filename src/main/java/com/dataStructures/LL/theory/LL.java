package com.dataStructures.LL.theory;


import lombok.Data;

@Data
public class LL {
    private Node head;      //just reference variables pointing to the first element;
    private Node tail;
    private int size;

    public LL(){
        this.size= 0;
    }

    private static class Node{

        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

    }

    public void insertAtStart(int val){
        Node node = new Node(val);
        node.next =head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void display(){
        Node temp = head;
        System.out.print("START"+ " -> ");
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertAtEnd(int val) throws NullPointerException{
        Node node = new Node(val);
        if(head == null){
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        tail = node;

        size++;
    }

    public void insert(int val, int index) throws NullPointerException {
        try {
            if (index == 0) {
                insertAtStart(val);
                return;
            }
            if (index == size) {
                insertAtEnd(val);
                return;
            }
            Node temp = head;
            while (index - 2 != 0) {
                temp = temp.next;
                index--;
            }
            temp.next = new Node(val, temp.next);               // a new node is created which points to temp.next and finally temp.next points to the new node
        }
        catch (Exception e){
            System.out.println("Enter valid index: Index is out of bound");
        }
    }


    public void deleteFirst(){
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
    }
    public void deleteLast(){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }
    public void deleteAtIndex(int index){
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == size-1){
            deleteLast();
            return;
        }
        Node temp = head;
        while(index-2!=0){
            temp = temp.next;
            index--;
        }
        temp.next = temp.next.next;
    }

    public void findAtIndex(int val) throws NullPointerException{
    try {
        Node temp = head;
        int i = 1;
        while (temp.value != val && i<size) {
            temp = temp.next;
            i++;
        }
        System.out.println(i);
    }
    catch (Exception e){
        System.out.println("Not found");
    }
    }
}
