/*
Exercise 9: (5) Modify the previous exercise so that it uses
Class.getDeclaredFields( ) to also display information about the fields in a class.

Exercise 8: (5) Write a method that takes an object and recursively prints all the classes
in that object’s hierarchy.
 */
import shapes.*;
public class Runner {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Class ref = circle.getClass();
        do{
            System.out.println(ref.getSimpleName());
            System.out.println(ref.getDeclaredFields().length);
        }
        while ((ref = ref.getSuperclass()) != null);
    }
}
