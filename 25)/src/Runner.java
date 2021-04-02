import com.gromov.Contain;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
Exercise 25: (2) Create a class containing private, protected and package-access
methods. Write code to access these methods from outside of the class’s package.
 */
public class Runner {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Contain obj = (Contain)Class.forName("com.gromov.Contain").getConstructor().newInstance();
        Field field = obj.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(obj,"MY name!!!!");
        System.out.println(field.get(obj));
        Method method = obj.getClass().getDeclaredMethod("printPackage");
        method.setAccessible(true);
        try {
            method.invoke(new Object());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        method = obj.getClass().getDeclaredMethod("printProtected");
        method.setAccessible(true);
        try {
            method.invoke(new Object());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        method = obj.getClass().getDeclaredMethod("printPrivate");
        method.setAccessible(true);
        try {
            method.invoke(new Object());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        int[] array = new int[2];
        array[0] = 2;
        array[1] = 5;
        method = obj.getClass().getDeclaredMethod("sum");
        method.setAccessible(true);
        try {
            System.out.println(method.invoke(obj, array));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
