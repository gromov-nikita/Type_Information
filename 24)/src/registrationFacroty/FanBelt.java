package registrationFacroty;

public class FanBelt extends Belt {
    public static class Factory
            implements registrationFacroty.Factory<FanBelt> {
        public FanBelt create() { return new FanBelt(); }
    }
}
