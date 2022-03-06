import java.util.*;

public class IntermediateWeapon implements WeaponInterface {
    public boolean weaponInPosition = false;
    public double damagePerHit = 90.5;
    public double accuracy = 20.2;
    public boolean scope = false;
    public List<String> selectionPanel = Collections.unmodifiableList(Arrays.asList("IW1", "IW2", "IW3"));

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
