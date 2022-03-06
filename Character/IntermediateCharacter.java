import java.util.*;

public class IntermediateCharacter implements CharacterInterface {
    public String stance = "Standing";
    public double maxSpeed = 50.9;
    public int maxWeapons = 1;
    public List<String> selectionPanel = Collections.unmodifiableList(Arrays.asList("IC1", "IC2", "IC3"));

    @Override
    public List<String> getSelectionPanel() {
        return this.selectionPanel;
    }

    @Override
    public void setStance(String stance) {
        this.stance = stance;
    }
}
