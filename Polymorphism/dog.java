package Polymorphism;

public class dog extends Animal{

    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println("小狗爱吃肉");
    }
    public void work(){
        System.out.println("狗看门");
    }
}
