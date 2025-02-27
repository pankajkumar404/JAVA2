public class Swapping {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Values before Swapping\na = "+a+"\nb = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Values after Swapping\na = "+a+"\nb = "+b);
    }
}
