import java.util.*;

public class BeginnerCharacter implements CharacterInterface {
    public String stance = "Standing";
    public double maxSpeed = 90.3;
    public int maxWeapons = 3;
    public List<String> selectionPanel = Collections.unmodifiableList(Arrays.asList("BC1", "BC2", "BC3"));

    @Override
    public List<String> getSelectionPanel() {
        return this.selectionPanel;
    }

    @Override
    public void setStance(String stance) {
        this.stance = stance;
    }
}
