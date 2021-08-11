import java.util.Arrays;
import java.util.Scanner;

public class Exe2_ArraysASC {

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
        System.out.println("Đây là mảng các số tăng dần: "+ checkSortASC(array));

    }

    public static boolean checkSortASC(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i-1])
                return false;
        }
        return true;
    }
}
