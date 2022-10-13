package com.klj.edu.text;

import java.util.Scanner;

public class CircleQueue {
    public static void main(String[] args) {
        ArrayCircleQueue arrayCircleQueue = new ArrayCircleQueue(4);

        char key = ' ';  //用于获取用户输入的字符
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("s(show)显示队列信息" + "\n" +
                               "h(head)显示队列头数据信息" + "\n" +
                               "a(add)添加数据到队列末" + "\n" +
                               "g(get)从队列中获取信息" + "\n" +
                               "e(exit)退出");
            key = scanner.next().charAt(0);
            switch (key) {
                case 's' :
                    arrayCircleQueue.showQueue();
                    break;
                case 'h' :
                    try {
                        System.out.println(arrayCircleQueue.showFront());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'a' :

                    try {
                        System.out.println("请输入数值: ");
                        arrayCircleQueue.addQueue(scanner.nextInt());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'g' :
                    try {
                        System.out.printf("已调取数据%d\n", arrayCircleQueue.getQueue());
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
@SuppressWarnings("all")
class ArrayCircleQueue {
    private int maxSize;//队列最大可存的有效数据的个数
    private int front;  //队列的头标，指向头数据自身
    private int rear;   //队列的尾标，指向尾数据的后一个位置
    private int[] array;

    public ArrayCircleQueue(int maxSize) {
        this.maxSize = maxSize + 1;
        array = new int[this.maxSize];
    }

    public boolean isFull(){    //判断队列是否为满
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty() {  //判断队列是否为空
        return rear == front;
    }

    public void addQueue(int n) {   //往队列尾部添加数据
        if (isFull()) {
            throw new RuntimeException("队列已满，无法添加数据");
        }
        array[rear] = n;
        rear = (rear + 1) % maxSize;
    }

    public int getQueue() { //从队列首部调出数据
        if (isEmpty()) {
            throw new RuntimeException("队列为空，无法调取数据");
        }
        int value = array[front];
        front = (front + 1) % maxSize;
        return value;
    }
    public void showQueue() {   //打印队列
        if (isEmpty()) {
            System.out.println("队列为空");
            return;
        }
        for (int i = front ; i < front+size() ; i++) {
            System.out.printf("array[%d] = %d\n",i % maxSize,array[i % maxSize]);
        }
    }

    public String showFront() {     //显示队列的头数据
        if (isEmpty()) {
            throw new RuntimeException("没有头数据");
        }
        return "front = " + array[front] ;
    }
    public int size() {     //判断队列内有效数据的个数
        return (rear+ maxSize-front) % maxSize ;
    }
}
