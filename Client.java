import java.util.List;

public class Client {
    private static void printSelectionPanel(String title, List<String> list) {
        System.out.println(title);
        list.forEach(item -> {
            System.out.println(item);
        });
        System.out.println();
    }

    public static void main(String[] args) {
        ModeInterface beginnerFactory = new ModeFactory().createFactory("Beginner");
        CharacterInterface beginnerCharacter = beginnerFactory.createCharacter();
        printSelectionPanel("Beginner Character Selection Panel:", beginnerCharacter.getSelectionPanel());
        WeaponInterface beginnerWeapon = beginnerFactory.createWeapon();
        printSelectionPanel("Beginner Weapon Selection Panel:", beginnerWeapon.getSelectionPanel());

        ModeInterface advancedFactory = new ModeFactory().createFactory("Advanced");
        CharacterInterface advancedCharacter = advancedFactory.createCharacter();
        printSelectionPanel("Advanced Character Selection Panel:", advancedCharacter.getSelectionPanel());
        WeaponInterface advancedWeapon = advancedFactory.createWeapon();
        printSelectionPanel("Advanced Weapon Selection Panel:", advancedWeapon.getSelectionPanel());

        ModeInterface intermediateFactory = new ModeFactory().createFactory("Intermediate");
        CharacterInterface intermediateCharacter = intermediateFactory.createCharacter();
        printSelectionPanel("Intermediate Character Selection Panel:", intermediateCharacter.getSelectionPanel());
        WeaponInterface intermediateWeapon = intermediateFactory.createWeapon();
        printSelectionPanel("Intermediate Weapon Selection Panel:", intermediateWeapon.getSelectionPanel());
    }
}
