import java.util.Scanner;

public class StarRightPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the star pattern printing");
        System.out.print("Enter the number of rows: ");
        int mxrows = input.nextInt();
        int rows = mxrows;
        while (rows > 0){
            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println("");
            rows--;
        }
    }

}
