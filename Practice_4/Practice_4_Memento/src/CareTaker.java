import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Stats> mementoList = new ArrayList<>();
    static int saveID = 0;
    public void add(Stats state){
        mementoList.add(state);
        System.out.println("State save " + saveID + "\n");
        saveID++;
    }
    public Stats get(int index){
        System.out.println("loading stats from save " + index);
        return mementoList.get(index);
    }
}
