import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        int num = 1;
//        while (num<=1000){
//            System.out.println(num);
//           num+=1;
//        }
//        int num = 1000;
//        while (num>=0) {
//            System.out.println(num);
//            num-=1;
//        }
        Scanner input = new Scanner(System.in);
        int num = 0;
        while (num<5){
            System.out.print("Enter number: ");
            int a = input.nextInt();
            System.out.println("Your number is: "+a);
            System.out.println((num+1)+" iteration");
            num+=1;
        }


    }
}