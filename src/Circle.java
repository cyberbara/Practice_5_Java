public class Circle implements Comparable<Circle> {
    double r;
    public Circle(double r) { this.r = r; }

    @Override
    public int compareTo(Circle o) {
        if (r > o.r) return 1;
        if (r < o.r) return -1;
        return 0;
    }
    public String toString() { return "Cir(" + r + ")"; }
}