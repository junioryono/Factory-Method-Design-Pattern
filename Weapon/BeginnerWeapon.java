import java.util.*;

public class BeginnerWeapon implements WeaponInterface {
    public boolean weaponInPosition = false;
    public double damagePerHit = 40.7;
    public double accuracy = 90.5;
    public boolean scope = true;
    public List<String> selectionPanel = Collections.unmodifiableList(Arrays.asList("BW1", "BW2", "BW3"));

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
