import java.util.Scanner;

public class App {

    public static void main(String[] main){
        Scanner input = new Scanner(System.in);

        Boolean choose = true;
        do {
            System.out.println("*******MENU******");
            System.out.println("1. Kiểm tra mảng số nguyên tố.");
            System.out.println("2. Kiểm tra mảng tăng dần.");
            System.out.println("3. Count số chia hết cho 4 nhưng không chia hết cho 5.");
            System.out.println("4. Tổng các số nguyên tố có trong mảng.");
            System.out.println("0. Thoát.");
            System.out.print("Chọn số:");
            int num = input.nextInt();
            switch (num){
                case 1:
                    Exe1_PrimeArrays.start();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    choose = false;
                    break;
                default:
                    break;
            }

        }while (choose);

    }
}
