package com.klj.edu.text;

import java.util.Scanner;

public class Queue {

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);

        char key = ' '; //用于获取用户输入的字符
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("s(show)显示队列信息");
            System.out.println("h(head)显示队列头数据信息");
            System.out.println("a(add)添加数据到队列末");
            System.out.println("g(get)从队列中获取信息");
            System.out.println("e(exit)退出");
            key = scanner.next().charAt(0);
            switch (key) {
                case 's' :
                    arrayQueue.showQueue();
                    break;
                case 'h' :
                    try {
                        System.out.println(arrayQueue.showFront());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'a' :
                    System.out.println("请输入数值: ");
                    arrayQueue.addQueue(scanner.nextInt());
                    break;
                case 'g' :
                    try {
                        System.out.printf("已调取数据%d\n", arrayQueue.getQueue());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e' :
                    scanner.close();
                    loop = false;
            }
        }
    }
}

//创建队列类
class ArrayQueue {
    private int maxSize;
    private int front;  //队列的头标的前一个位置
    private int rear;   //队列的尾标
    private int[] array;
    //构造器
    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        array = new int[this.maxSize];
        front = -1;
        rear = -1;
    }
    //判断队列是否为满
    public boolean isFull() {
        return rear == maxSize - 1;
    }
    //判断队列是否为空
    public boolean isEmpty() {
        return rear == front;
    }

    //往队列中添加数据
    public void addQueue(int n) {
        if (isFull()) {
            throw new RuntimeException("队列已满，无法添加数据");
        }
        rear++;
        array[rear] = n;
    }
    //从队列中调取数据(只能调取最首部)
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空，无法调取数据");
        }
        front++;
        return array[front];
    }

    //显示队列中的所有内容
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return;
        }
        for (int i = 0 ; i < array.length ; i++) {
            System.out.printf("array[%d] = %d\n",i,array[i]);
        }
    }
    //显示队列的头数据
    public String showFront() {
        if (isEmpty()) {
            throw new RuntimeException("没有头数据");
        }
        return "front = " + array[front+1] ;
    }
}
