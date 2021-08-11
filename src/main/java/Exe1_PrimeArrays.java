import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exe1_PrimeArrays {
    public static Scanner input = new Scanner(System.in);

    public static void start(){
        Scanner input = new Scanner(System.in);
        Boolean conti = true;
        do{
            content();

            System.out.print("Nhấn phím bất kỳ để tiếp tục.\nPhím 0 để kết thúc.\nNhập: ");
            int choose= input.nextInt();
            switch (choose){
                case 0:
                    conti = false;
                    break;
                default:
                    break;
            }
        }while (conti);

    }

    public static void content(){
        System.out.println("Nhập giới hạn mảng: ");
        int n = input.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập giá trị cho ["+i+"]: ");
            array[i] = input.nextInt();
        }
        System.out.println("Mảng: "+ array.toString());
        System.out.println("Đây là mảng các số nguyên tố: "+ checkPrimeArrays(array));

    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPrimeArrays(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if ( !isPrimeNumber(arr[i]))
                return false;
        }
        return true;
    }
}
