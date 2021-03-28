package shapes;

import java.util.*;
abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}