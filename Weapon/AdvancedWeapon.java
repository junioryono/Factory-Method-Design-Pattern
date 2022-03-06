import java.util.*;

public class AdvancedWeapon implements WeaponInterface {
    public boolean weaponInPosition = false;
    public double damagePerHit = 60.1;
    public double accuracy = 39.4;
    public boolean scope = true;
    public List<String> selectionPanel = Collections.unmodifiableList(Arrays.asList("AW1", "AW2", "AW3"));

    @Override
    public List<String> getSelectionPanel() {
        return this.selectionPanel;
    }

    @Override
    public void holdWeapon() {
        this.weaponInPosition = true;
    }

    @Override
    public void dropWeapon() {
        this.weaponInPosition = false;
    }
}
