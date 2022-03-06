public class BeginnerFactory implements ModeInterface {
    @Override
    public CharacterInterface createCharacter() {
        return new BeginnerCharacter();
    }

    @Override
    public WeaponInterface createWeapon() {
        return new BeginnerWeapon();
    }
}
