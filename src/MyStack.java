import java.util.ArrayList;

public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        if (isEmpty()) return null;
        return list.get(getSize() - 1);
    }

    public Object pop() {
        if (isEmpty()) return null;
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public Object clone() {
        try {
            MyStack stackClone = (MyStack) super.clone();
            stackClone.list = (ArrayList<Object>) list.clone();

            return stackClone;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Стек: " + list.toString();
    }
}