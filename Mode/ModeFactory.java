public class ModeFactory {
    public ModeInterface createFactory(String mode) {
        if (mode == "Beginner") {
            return new BeginnerFactory();
        } else if (mode == "Advanced") {
            return new AdvancedFactory();
        } else if (mode == "Intermediate") {
            return new IntermediateFactory();
        }
        return null;
    }
}
