// Encapsulation!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
/*
class Number {
    private String name;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

public class CWH_testOOP {

    public static void main(String[] args) {
        Number num = new Number();
        Number num1 = new Number();
        num.setId(54);
        num.setName("abubakar");
        num1.setId(56);
        num1.setName("sohaib");
        System.out.println(num.getId());
        System.out.println(num.getName());
        System.out.println(num1.getId());
        System.out.println(num1.getName());
    }
}
*/
// Polymorphsm!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
/*
class Phone {
    public void call() {
        System.out.println("call");
    }
}

class smartphone extends Phone {
    public void call() {
        System.out.println("call from smartphone");
    }
}

class laptop extends smartphone {
    public void call() {
        System.out.println("call from laptop");
    }
}

public class CWH_testOOP {

    public static void main(String[] args) {

        Phone device;

        device = new Phone();
        device.call();

        device = new smartphone();
        device.call();

        device = new laptop();
        device.call();
    }
}
*/
// Abstraction!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
/*
abstract class phone{
    abstract void call();
    abstract void text();
     void message(){
        System.out.println("message...");
    }
    
}
class smartphone extends phone{
    @Override
    public void text(){
        System.out.println("texting from smartphone");
    }
    public void call(){
        System.out.println("calling from smartphone");
    }
    void message(){
        System.out.println("message from smartphone...");
    }
}
class laptop extends phone{
    @Override
    public void text(){
        System.out.println("texting from Laptop");
    }
    public void call(){
        System.out.println("calling from Laptop");
    }
    void message(){
        System.out.println("message from Laptop...");
    }
}

public class CWH_testOOP{
    public static void main(String[] args) {
        phone device ;
        device = new smartphone();
        System.out.println();
        device.call();
        device.text();
        device.message();

        System.out.println();

        device = new laptop();
        device.call();
        device.text();
        device.message();

        System.out.println();
   
        }
}
*/
// Inheritance!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// single level inheritance done as above.
// multilevel inheritance done as above.
// Hierarchical inheritance done as above.
// Multiple Inheritance !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
/*
interface A{
     void method1();
}
interface B{
     void method2();    
}
class Child1 implements A,B{
    public void method1(){
        System.out.println("method from interfaceA");
    }
    public void method2(){
        System.out.println("method from interfaceB");
    }
}
public class CWH_testOOP {
    public static void main(String[] args) {
        Child1 child;
        child = new Child1();
        child.method1();
        child.method2();
    }
}
*/
// Hybird Inheritance !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
/* 
interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

interface C extends A {
    void methodC();
}

class D implements B, C {
    public void methodA() {
        System.out.println("method from interfaceA");
    }

    public void methodB() {
        System.out.println("method from interfaceB");
    }

    public void methodC() {
        System.out.println("method from interfaceC");
    }
}

public class CWH_testOOP {

    public static void main(String[] args) {
        D random;
        random = new D();
        random.methodA();
        random.methodB();
        random.methodC();

    }
}
*/