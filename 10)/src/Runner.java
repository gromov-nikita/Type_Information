/*
Exercise 10: (3) Write a program to determine whether an array of char is a primitive
type or a true Object.
 */
public class Runner {
    public static void main(String[] args) {
        Character[] array = new Character[3];
        array[0] = '0';
        array[1] = '1';
        array[2] = '2';
        System.out.println(array.getClass().getComponentType().isPrimitive());
        char[] array2 = new char[3];
        array2[0] = '0';
        array2[1] = '1';
        array2[2] = '2';
        System.out.println(array2.getClass().getComponentType().isPrimitive());

    }
}
