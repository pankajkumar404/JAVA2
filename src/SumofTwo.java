public class SumofTwo {
    public int addition(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        SumofTwo sum = new SumofTwo();
        int num = sum.addition(5, 10);
        System.out.println("The sum is: "+ num);
    }
}
