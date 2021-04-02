package registrationFacroty;

public class CabinAirFilter extends Filter {
    public static class Factory
            implements registrationFacroty.Factory<CabinAirFilter> {
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}
