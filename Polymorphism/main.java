package Polymorphism;

public class main {
    public static void main(String[] args) {
        Animal a = new cat("大猫",5);
        Animal b = new dog("大狗",6);

        System.out.println(a.getName()+", "+a.getAge()+"岁");
        a.eat();
        cat c = (cat)a;
        c.work();

        System.out.println("--------");

        System.out.println(b.getName()+", "+b.getAge()+"岁");
        b.eat();
        dog d = (dog) b;
        d.work();
    }
}
