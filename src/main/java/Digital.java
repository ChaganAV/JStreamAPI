import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Digital {
    private Random random;
    private List<Integer> list;
    private final int MIN = 0;
    private final int MAX = 100;
    private final int SIZE = 50;
    public Digital(){
        this.random = new Random();
        this.list = new ArrayList<>();
        initlist();
    }
    private void initlist(){
        for (int i = 0; i < SIZE; i++) {
            list.add(random.nextInt(MIN,MAX));
        }
    }

    public List<Integer> getList() {
        return list;
    }
}
