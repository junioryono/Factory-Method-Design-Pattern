import java.util.*;

public class AdvancedCharacter implements CharacterInterface {
    public String stance = "Standing";
    public double maxSpeed = 70.4;
    public int maxWeapons = 2;
    public List<String> selectionPanel = Collections.unmodifiableList(Arrays.asList("AC1", "AC2", "AC3"));

    @Override
    public List<String> getSelectionPanel() {
        return this.selectionPanel;
    }

    @Override
    public void setStance(String stance) {
        this.stance = stance;
    }
}
