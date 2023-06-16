package org.example.Super;

/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/

class Parent {
    protected int nums = 0;

    Parent() {
        System.out.println("parent object constructed");
    }

    public void foo () {
        System.out.println("parent foo");
    }
}

class Child extends Parent {
    protected int nums = 1;
    protected int nums2 = 2;

    Child() {
        super();
        System.out.println("parent object constructed");
    }

    public void foo () {
        super.foo();
        System.out.println("parent foo");
    }

    public void data() {
        System.out.println(super.nums);
        System.out.println(nums);
        System.out.println(nums2);
    }
}

public class SuperDemo1
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        Child child = new Child();
        child.foo();
        child.data();
    }
}