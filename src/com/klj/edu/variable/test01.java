package com.klj.edu.variable;

public class test01 {
    public static void main(String[] args) {
        Person jack = new Person("jack",30000,30);
        System.out.println(jack.toString());
    }
}

class Person {
    private String name;
    private double salary;
    private int age;

    public Person(String name, double salary, int age) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 1 && name.length() <= 10) {
            this.name = name;
        } else {
            System.out.println("你输入的姓名长度不符合要求，请输入长度在1-10的姓名");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 3000 && salary <= 50000) {
            this.salary = salary;
        } else {
            System.out.println("你输入的薪水大小不符合要求，请输入大小在3,000-50,000的薪水");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 16 && age <= 65) {
            this.age = age;
        } else {
            System.out.println("你输入的年龄不符合要求，年龄限制: 16-65岁");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
