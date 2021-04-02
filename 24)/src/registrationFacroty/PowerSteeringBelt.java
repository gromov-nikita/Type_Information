package registrationFacroty;

public class PowerSteeringBelt extends Belt {
    public static class Factory
            implements registrationFacroty.Factory<PowerSteeringBelt> {
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}