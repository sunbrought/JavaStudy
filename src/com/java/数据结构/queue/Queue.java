package com.java.数据结构.queue;

public class Queue {
    //底层使用数组
    private long arr[];
    //有效数据
    private int elements;
    //队头
    private int front;
    //队尾
    private int end;

    //初始化
    public Queue() {
        arr = new long[10];
        front = 0;
        end = -1;
    }
    //初始化自定义大小
    public Queue(int maxsize) {
        arr = new long[maxsize];
        front = 0;
        end = -1;
    }

    //添加数据(从队尾添加)
    public void insert(long value){
        if(end == arr.length - 1){
            end = -1;
        }

        arr[++end] = value;
        elements++;
    }

    //删除数据
    public long remove(){
        if(front == arr.length - 1){
            front = 0;
        }

        int sub = front;
        front++;
        elements--;
        return arr[sub];
    }

    //查看数据
    public long peak(){
        return arr[front];
    }

    //判断是否为空
    public boolean isEmpty(){
        return elements == 0;
    }

    //判断是否满了
    public boolean isFull(){
        return elements == arr.length;
    }
}

class Test{
    public static void main(String[] args) {
        Queue queue = new Queue(6);
        queue.insert(1);
        queue.insert(34);
        queue.insert(12);
        queue.insert(76);
        queue.insert(98);
        queue.insert(-3);

        System.out.println(queue.isFull());
        System.out.println(queue.isEmpty());
        queue.insert(-3);
        System.out.println(queue.peak());
        while (!queue.isEmpty()){
            System.out.println(queue.remove() + ",");
        }
    }
}
