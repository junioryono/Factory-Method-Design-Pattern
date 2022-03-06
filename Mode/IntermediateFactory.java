public class IntermediateFactory implements ModeInterface {
    @Override
    public CharacterInterface createCharacter() {
        return new IntermediateCharacter();
    }

    @Override
    public WeaponInterface createWeapon() {
        return new IntermediateWeapon();
    }
}
