/*
Exercise 10: (3) Write a program to determine whether an array of char is a primitive
type or a true Object.
 */
public class Runner {
    public static void main(String[] args) {
        char[] array = new char[3];
        System.out.println(array.getClass().isMemberClass());
    }
}
