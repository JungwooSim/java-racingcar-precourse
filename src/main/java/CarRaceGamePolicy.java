import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CarRaceGamePolicy {
    private List<Integer> randomNumberRange = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));

    public boolean isMove() {
        Collections.shuffle(randomNumberRange);
        if (randomNumberRange.get(0) >= 4) {
            return true;
        }
        return false;
    }
}
