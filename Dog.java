// Function Overriding
class Animal {
    void sound() {
        System.out.println("Animal sounds....");
    }
}

public class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks.....");
    }

    void parentSound() {
        super.sound(); //Super key to access the method of parent class hehehehehe
    }

    public static void main(String[] args) {
        Animal a = new Dog(); //upcasting
        Dog d = (Dog) a; //Downcasting

        d.parentSound();
        d.sound();
    }
}