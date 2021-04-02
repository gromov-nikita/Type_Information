package registrationFacroty;

public class FuelFilter extends Filter {
    // Create a Class Factory for each specific type:
    public static class Factory
            implements registrationFacroty.Factory<FuelFilter> {
        public FuelFilter create() { return new FuelFilter(); }
    }
}
