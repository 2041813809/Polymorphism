package Polymorphism;

public class cat extends Animal{

    public cat() {
    }

    public cat(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println("猫咪爱吃鱼");
    }
    public void work(){
        System.out.println("猫抓老鼠");
    }
}
