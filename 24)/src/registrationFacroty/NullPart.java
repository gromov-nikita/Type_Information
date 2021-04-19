package registrationFacroty;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NullPart extends Part {
    @Override
    public String toString() {
        return "NULL";
    }
    public static Part createRandom() {
        return new NullPart();
    }
}
