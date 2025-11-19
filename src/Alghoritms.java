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
    public static <E> int lSearch(E[] arr, E val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(val)) return i;
        }
        return -1;
    }
    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];
        for (int i=1; i<list.length; i++) {
            if (list[i].compareTo(max) > 0) max = list[i];
        }
        return max;
    }
    public static <E extends Comparable<E>> E max2d(E[][] list) {
        E max = list[0][0];
        for (E[] row : list) {
            for (E el : row) {
                if (el.compareTo(max) > 0) max = el;
            }
        }
        return max;
    }
}