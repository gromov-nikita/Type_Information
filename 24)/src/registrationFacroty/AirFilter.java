package registrationFacroty;

public class AirFilter extends Filter {
    public static class Factory
            implements registrationFacroty.Factory<AirFilter> {
        public AirFilter create() { return new AirFilter(); }
    }
}

