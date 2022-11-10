package com.bytelegend;

public class Cat {
    public String name;

    public Cat(String n) {
        name = n;
    }

    public static void main(String[] args) {
        System.out.println(new Cat("Black"));
        System.out.println(new Cat("White"));
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
