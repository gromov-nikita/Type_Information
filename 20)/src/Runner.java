/*
Exercise 20: (5) Look up the interface for java.lang.Class in the JDK documentation
from http://java.sun.com. Write a program that takes the name of a class as a command-line
argument, then uses the Class methods to dump all the information available for that class.
Test your program with a standard library class and a class you create.
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Runner implements Q,P {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cl = Class.forName("java.lang." + args[0]);
        System.out.println("Is Interface? " + cl.isInterface());
        System.out.println("Is Enum? " + cl.isEnum());
        System.out.println("Is Annotation? " + cl.isAnnotation());
        System.out.println("Canonical name: " + cl.getCanonicalName());
        System.out.println("Superclass: " + cl.getSuperclass());
        System.out.println();
        System.out.println("Amount of fields: " + cl.getDeclaredFields().length);
        Field[] fields = cl.getFields();
        for(int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].toString());
        }
        System.out.println();
        System.out.println("Amount of constructors: " + cl.getDeclaredConstructors().length);
        Constructor[] constructors = cl.getConstructors();
        for(int i = 0; i < constructors.length; i++) {
            System.out.println(constructors[i].toString());
        }
        System.out.println();
        System.out.println("Amount of methods: " + cl.getDeclaredMethods().length);
        Method[] methods = cl.getDeclaredMethods();
        for(int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].toString());
        }
        System.out.println();
        System.out.println("Amount of interfaces: " + cl.getInterfaces().length);
        Class[] classes = cl.getInterfaces();
        for(int i = 0; i < classes.length; i++) {
            System.out.println(classes.toString());
        }


        System.out.println("___________________________________");
        cl = Class.forName("Runner");
        System.out.println("Is Interface? " + cl.isInterface());
        System.out.println("Is Enum? " + cl.isEnum());
        System.out.println("Is Annotation? " + cl.isAnnotation());
        System.out.println("Canonical name: " + cl.getCanonicalName());
        System.out.println("Superclass: " + cl.getSuperclass());
        System.out.println();
        System.out.println("Amount of fields: " + cl.getDeclaredFields().length);
        fields = cl.getFields();
        for(int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].toString());
        }
        System.out.println();
        System.out.println("Amount of constructors: " + cl.getDeclaredConstructors().length);
        constructors = cl.getConstructors();
        for(int i = 0; i < constructors.length; i++) {
            System.out.println(constructors[i].toString());
        }
        System.out.println();
        System.out.println("Amount of methods: " + cl.getDeclaredMethods().length);
        methods = cl.getDeclaredMethods();
        for(int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].toString());
        }
        System.out.println();
        System.out.println("Amount of interfaces: " + cl.getInterfaces().length);
        classes = cl.getInterfaces();
        for(int i = 0; i < classes.length; i++) {
            System.out.println(classes[i].toString());
        }
    }
}
