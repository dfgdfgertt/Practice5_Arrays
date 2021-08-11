import java.util.Arrays;
import java.util.Scanner;

public class Exe4_SumPrimeArrays {

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
        System.out.println("Mảng: "+ Arrays.toString(array));
        System.out.println(sumPrime(array)+" là tổng các số nguyên tố có trong array.");

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

    public static long sumPrime(int arr[]){
        long total=0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNumber(arr[i]))
                total+= arr[i];
        }
        System.out.println();
        return total;
    }
}
