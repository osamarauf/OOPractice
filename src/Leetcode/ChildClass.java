package Leetcode;

public class ChildClass extends GenericClass{
    int age ;

    public ChildClass(){
        this.age = 24;
    }

    public ChildClass(int num, String name, int age) {
        super(num, name);
        this.age = age;
    }
}
