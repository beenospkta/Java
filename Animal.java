//Abstract class
abstract class Animal{
    //Abstract method
    abstract void sound();
    //normal method
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}
//child class
class Dog extends Animal{
    @overide 
    void sound(){
    }
    //providing body to Abstract method
    
}
public class AbstractionDemo{
    public static void main(String[]args){
        //creating object of child class
        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}