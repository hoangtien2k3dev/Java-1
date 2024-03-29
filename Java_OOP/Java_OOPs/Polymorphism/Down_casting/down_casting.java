package Java_OOP.Java_OOPs.Polymorphism.Down_casting;

import Java_OOP.Java_OOPs_Misc.Object_Class.Object;

class Animal {
    public void sound() {
        System.out.println("1. Base Class Some sound");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("- Driver Class Meow meow");
    }
    public void play() {
        System.out.println("- Down-casting ... ");
    }
}

public class down_casting {
    public static void main(String[] args) {
        Animal animal = new Cat();
//        ((Cat)animal).play(); // down-casting

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal; // down-casting
            cat.play();
            cat.sound();
        }

    }
}
