package com.gromov;
public class Contain {
    private String name;
    public static void printPublic() {
        System.out.println("Public");
    }
    static void printPackage() {
        System.out.println("Package");
    }
    protected static void printProtected() {
        System.out.println("Protected");
    }
    private static void printPrivate() {
        System.out.println("Private");
    }
    private int sum(int n1, int n2) {
        return n1 + n2;
    }
}
