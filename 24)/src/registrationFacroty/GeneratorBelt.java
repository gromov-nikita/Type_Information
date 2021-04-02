package registrationFacroty;

public class GeneratorBelt extends Belt {
    public static class Factory
            implements registrationFacroty.Factory<GeneratorBelt> {
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}
