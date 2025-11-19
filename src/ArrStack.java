import java.util.Arrays;

public class ArrStack<E> {
    private E[] arr;
    private int size = 0;

    public ArrStack() {
        arr = (E[]) new Object[10];
    }

    public int getSize() { return size; }
    public boolean isEmpty() { return size == 0; }

    public E peek() { return arr[size-1]; }

    public void push(E o) {
        if (size >= arr.length) {
            E[] narr = (E[]) new Object[arr.length * 2];
            System.arraycopy(arr, 0, narr, 0, arr.length);
            arr = narr;
        }
        arr[size++] = o;
    }

    public E pop() {
        E o = arr[--size];
        return o;
    }
}