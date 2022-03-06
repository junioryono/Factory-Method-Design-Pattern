public class AdvancedFactory implements ModeInterface {
    @Override
    public CharacterInterface createCharacter() {
        return new AdvancedCharacter();
    }

    @Override
    public WeaponInterface createWeapon() {
        return new AdvancedWeapon();
    }
}
