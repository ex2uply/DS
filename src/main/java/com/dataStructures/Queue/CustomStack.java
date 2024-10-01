package com.dataStructures.Queue;

public class CustomStack {
    protected int[] data;
    private int pointer = -1;
    private static final int DEFAULT_SIZE = 10;

    public CustomStack(int size) {
        this.data=new int[size];
    }
    public CustomStack(){
        this(DEFAULT_SIZE);       //this keyword as constructor
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Empty");
        }
        return data[pointer--];
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Empty");
        }
        return data[pointer];
    }
    public boolean push(int val){
        if(isFull()){
            System.out.println("FUll");
            return false;

        }
        pointer++;
        data[pointer] = val;
        return true;
    }

    public boolean isFull(){
        return pointer == data.length - 1;
    }
    public boolean isEmpty(){
        return pointer == - 1;
    }
}
