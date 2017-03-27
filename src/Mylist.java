
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by lumia on 2017/3/24.
 */
public class Mylist<E extends Comparable<E>> extends ArrayList<E> {
    public static void main(String[] args) {
        Mylist<String> myList = new Mylist<>();
        myList.add("A");
        myList.add("B");
        System.out.println(myList.inOrder());
    }
    public Mylist() {
        super();
    }
    

    public boolean inOrder() {
        if (size() == 1 || isEmpty())
            return true;
        Iterator<E> iterator = iterator();
        E lastOne = iterator.next();
        E currentOne;
        while (iterator.hasNext()) {
            currentOne = iterator.next();
            if (lastOne.compareTo(currentOne) < 0)
                return false;
            lastOne = currentOne;
        }
        return true;
    }

    public Mylist everThree() {
        Mylist everThreeList = new Mylist();
        return everThreeList;

    }
}
