public class Main {
    public static void main(String[] args) {
        // 1.1
        java.util.ArrayList<String> s = new java.util.ArrayList<>();
        s.add("a"); s.add("b"); s.add("a");
        System.out.println(Alghoritms.removeDups(s));

        // 1.2
        Integer[] arr = {1, 5, 9};
        System.out.println(Alghoritms.lSearch(arr, 5));

        // 1.3
        Circle[] c = {new Circle(2), new Circle(5)};
        System.out.println(Alghoritms.max(c));
    }
}