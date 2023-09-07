package sem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListHuman implements Iterator {

    private int index;
    private List<Human> humanList = new ArrayList<>();

    public void addHuman(Human human){
        humanList.add(human);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Human human: humanList) {
            sb.append(human);
            sb.append("\n");
        }
        return sb.toString();
    }

    public String get(int index){
        return String.valueOf(humanList.get(index));
    }
    public Human getHuman(int index){
        return humanList.get(index);
    }

    public int size(){
        return humanList.size();
    }

    @Override
    public boolean hasNext() {
        return humanList.size() > index;
    }

    @Override
    public Object next() {
        return humanList.get(index++);
    }
}
