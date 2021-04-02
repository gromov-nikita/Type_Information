package registrationFacroty;

public class OilFilter extends Filter {
    public static class Factory implements registrationFacroty.Factory<OilFilter> {
        public OilFilter create() { return new OilFilter(); }
    }
}
