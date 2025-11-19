import java.util.ArrayList;

public class Alghoritms {

    public static <E> ArrayList<E> removeDups(ArrayList<E> list) {
        ArrayList<E> res = new ArrayList<>();
        for (E el : list) {
            if (!res.contains(el)) {
                res.add(el);
            }
        }
        return res;
    }
}