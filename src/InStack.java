import java.util.ArrayList;

public class InStack<E> extends ArrayList<E> {
    public int getSize() { return size(); }
    public E peek() { return get(size()-1); }
    public void push(E o) { add(o); }
    public E pop() { return remove(size()-1); }
}